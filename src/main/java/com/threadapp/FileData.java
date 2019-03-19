package main.java.com.threadapp;


import java.io.File;
import java.util.Arrays;
import java.util.List;

public class FileData {
    private final String FILE_PATH = "D:\\JavaCourse\\ThreadApp\\src\\main\\resources";

    List<File> getAllFiles() {
        File dir = new File(FILE_PATH);
        File[] arrFiles = dir.listFiles();
        List<File> list = Arrays.asList(arrFiles);
        return list;
    }
}
