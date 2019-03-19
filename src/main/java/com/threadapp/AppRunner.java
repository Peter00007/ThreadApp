package main.java.com.threadapp;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class AppRunner {
    public static void main(String[] args) {

        int cores = Runtime.getRuntime().availableProcessors();

        FileData getFiles = new FileData();

        ExecutorService executorService = Executors.newFixedThreadPool(cores);

        for (int i = 0; i < getFiles.getAllFiles().size(); i++) {
            executorService.submit(new FileReader(getFiles.getAllFiles().get(i).toString()));
        }
        executorService.shutdown();
    }
}