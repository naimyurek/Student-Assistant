package com.hns.oop;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class Downloader {
    
    private static Downloader downloader = null;
    private String directory;

    private Downloader() { 
        directory = ""; 
    }
    
    public static Downloader getDownloader(){ // Singleton design pattern
        if (downloader==null)
            downloader = new Downloader();
        return downloader;
    }
    
    public void download(String link, String name) throws IOException{ // Bir linki "name" olarak program dizinine indirir.
        
        URL url = new URL(link);
        InputStream in = url.openStream();
        File targetFile = new File(getDirectory() + name);
        Files.copy(in, targetFile.toPath(), StandardCopyOption.REPLACE_EXISTING);
    }

    public String getDirectory() {
        return directory;
    }

    public void setDirectory(String directory) throws IOException {
        this.directory = directory;
        
        Path path = Paths.get(directory);
        if (!Files.exists(path)) {
            Files.createDirectories(path);
        }
    }
}
