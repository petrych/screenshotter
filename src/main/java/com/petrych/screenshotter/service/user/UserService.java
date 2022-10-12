package com.petrych.screenshotter.service.user;

import com.petrych.screenshotter.common.errorhandling.UserEntityNotFoundException;
import com.petrych.screenshotter.config.UserServiceProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

@Service
@Profile({"gcp", "local", "test"})
public class UserService implements IUserService {
	
	@Autowired
	private UserServiceProperties properties;
	
	private WebClient client;
	
	public UserService(UserServiceProperties properties) {
		
		this.properties = properties;
		
		client = WebClient.create(getBaseUrl());
	}
	
	
	@Override
	public Long getUserIdByUserName(String userName) {
		
		Mono<User> result = client.get()
		                          .uri(uriBuilder -> uriBuilder
				                          .path("/by-username/")
				                          .queryParam("userName", userName)
				                          .build())
		                          .accept(MediaType.APPLICATION_JSON)
		                          .retrieve()
		                          .onStatus(HttpStatus.NOT_FOUND::equals,
		                                    response -> response.bodyToMono(String.class).map(
				                                    UserEntityNotFoundException::new))
		                          .bodyToMono(User.class);
		
		return result.block().getUserId();
	}
	
	private String getBaseUrl() {
		
		return "http://"
				+ properties.getHost()
				+ ":"
				+ properties.getPort()
				+ properties.getContextPath();
	}
	
}
