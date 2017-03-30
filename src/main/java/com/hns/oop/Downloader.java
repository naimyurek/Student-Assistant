package com.hns.oop;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import org.jsoup.Connection;
import org.jsoup.Jsoup;

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
    
    public void download(String link, String fileName) throws IOException{ // Bir linki "name" olarak program dizinine indirir.
        
        String browser = "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_9_2) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/33.0.1750.152 Safari/537.36";

        Connection.Response document = Jsoup.connect(link).userAgent(browser).ignoreContentType(true).execute();
        
        InputStream inputStream;
        FileOutputStream fileOutputStream;
        inputStream = new ByteArrayInputStream(document.bodyAsBytes());
        fileOutputStream = new FileOutputStream(new File(getDirectory() + fileName));

        int length;
        byte[] buffer = new byte[1024];

        while ((length = inputStream.read(buffer)) > -1) {
            fileOutputStream.write(buffer, 0, length);
        }
        fileOutputStream.close();
        inputStream.close();
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
