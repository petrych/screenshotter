package com.petrych.screenshotter.service;

import com.petrych.screenshotter.persistence.model.Screenshot;

import java.io.IOException;
import java.net.MalformedURLException;
import java.util.Collection;
import java.util.Optional;

public interface IScreenshotService {
	
	Iterable<Screenshot> findAll();
	
	Optional<Screenshot> findById(Long id);
	
	Optional<Screenshot> findByIdAndUserId(Long id, Long userId);
	
	Iterable<Screenshot> findByName(String name);
	
	Iterable<Screenshot> findByNameAndUserId(String name, Long userId);
	
	Iterable<Screenshot> findByUserId(Long userId);
	
	byte[] getScreenshotFileById(Long id) throws IOException;
	
	Screenshot storeScreenshot(String urlString, String userName) throws IOException;
	
	void updateScreenshot(String urlString, String userName) throws IOException;
	
	Collection<String> findScreenshotFileNamesByUrl(String urlString) throws MalformedURLException;
	
	void deleteScreenshot(String urlString) throws IOException;
	
}
