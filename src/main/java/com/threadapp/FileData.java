package main.java.com.threadapp;


import java.io.File;
import java.util.Arrays;
import java.util.List;

public class FileData implements Runnable {
    private final String FILE_PATH = "D:\\JavaCourse\\ThreadApp\\src\\main\\resources";

    File dir = new File(FILE_PATH);
    File[] arrFiles = dir.listFiles();
    List<File> list = Arrays.asList(arrFiles);

    @Override
    public void run() {
        for (int i = 0; i < list.size(); i++) {
            System.out.println(new File(list.get(i).toString()).length());
            System.out.println(list.get(i).getName().substring(list.get(i).getName().lastIndexOf('.'), list.get(i).getName().length()));
        }
    }
}
