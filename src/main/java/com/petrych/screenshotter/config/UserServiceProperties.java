package com.petrych.screenshotter.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@ConfigurationProperties(prefix = "userservice")
@Profile({"gcp", "local", "test"})
public class UserServiceProperties {
	
	private String host;
	
	private String port;
	
	private String contextPath;
	
	
	public String getHost() {
		
		return host;
	}
	
	public void setHost(String host) {
		
		this.host = host;
	}
	
	
	public String getPort() {
		
		return port;
	}
	
	public void setPort(String port) {
		
		this.port = port;
	}
	
	public String getContextPath() {
		
		return contextPath;
	}
	
	public void setContextPath(String contextPath) {
		
		this.contextPath = contextPath;
	}
	
}
