package main.java.com.threadapp;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class AppRunner {
    public static void main(String[] args) {
        FileData getFiles = new FileData();
        ExecutorService executorService = Executors.newFixedThreadPool(4);

        executorService.submit(getFiles);
        executorService.shutdown();
    }
}