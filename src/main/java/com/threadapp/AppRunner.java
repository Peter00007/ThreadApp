package main.java.com.threadapp;

import java.io.File;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class AppRunner {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(4);
        GetFiles getFiles = new GetFiles();

            executorService.submit(new Runnable() {
                @Override
                public void run() {
                    for (int i = 0; i < getFiles.list.size(); i++) {
                        System.out.println(new File(getFiles.list.get(i).toString()).length());
                        System.out.println(getFiles.list.get(i).getName().substring(getFiles.list.get(i).getName().lastIndexOf('.'), getFiles.list.get(i).getName().length()));
                    }
                }
            });
            executorService.shutdown();
    }
}
