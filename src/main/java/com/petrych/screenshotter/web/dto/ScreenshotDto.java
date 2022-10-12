package com.petrych.screenshotter.web.dto;

import java.time.LocalDateTime;

public class ScreenshotDto {
	
	private Long id;
	
	private String name;
	
	private String uri;
	
	private LocalDateTime dateTimeCreated;
	
	private Long userId;
	
	public ScreenshotDto() {
	
	}
	
	public ScreenshotDto(Long id, String name, String uri, LocalDateTime dateTimeCreated, Long userId) {
		
		this.id = id;
		this.name = name;
		this.uri = uri;
		this.dateTimeCreated = dateTimeCreated;
		this.userId = userId;
	}
	
	
	public Long getId() {
		
		return id;
	}
	
	public void setId(Long id) {
		
		this.id = id;
	}
	
	public String getName() {
		
		return name;
	}
	
	public void setName(String name) {
		
		this.name = name;
	}
	
	public String getUri() {
		
		return uri;
	}
	
	public void setUri(String uri) {
		
		this.uri = uri;
	}
	
	public LocalDateTime getDateTimeCreated() {
		
		return dateTimeCreated;
	}
	
	public void setDateTimeCreated(LocalDateTime dateTimeCreated) {
		
		this.dateTimeCreated = dateTimeCreated;
	}
	
	public Long getUserId() {
		
		return userId;
	}
	
	public void setUserId(Long userId) {
		
		this.userId = userId;
	}
	
}
