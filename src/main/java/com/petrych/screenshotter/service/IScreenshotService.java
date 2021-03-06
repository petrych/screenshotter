package com.petrych.screenshotter.service;

import com.petrych.screenshotter.persistence.model.Screenshot;

import java.io.File;
import java.nio.file.Path;
import java.util.Optional;
import java.util.stream.Stream;

public interface IScreenshotService {
	
	Iterable<Screenshot> findAll();
	
	Optional<Screenshot> findById(Long id);
	
	Iterable<Screenshot> findByName(String name);
	
	File getScreenshotFileById(Long id);
	
	Stream<Path> loadAllFiles();
	
	String storeFile(String urlString);
	
	void update(String urlString);
	
	String findFileNameByUrl(String urlString);
	
}
