package main.java.com.threadapp;

import java.io.File;

public class FileReader implements Runnable{
    private String fileName;
    private File file;

    public FileReader(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void run() {
        file = new File(fileName);
        System.out.println(Thread.currentThread().getName());
        System.out.println(file.length());
        System.out.println(file.getName().substring(file.getName().lastIndexOf('.'), file.getName().length()));

    }
}
