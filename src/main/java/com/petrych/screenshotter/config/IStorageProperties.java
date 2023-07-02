package com.petrych.screenshotter.config;


import java.nio.file.Path;
import java.nio.file.Paths;

public interface IStorageProperties {
	
	
	String getStorageDir();
	
	default Path getStorageDirAbsolutePath() {
		
		return Paths.get(getStorageDir()).toAbsolutePath();
	}
	
}
