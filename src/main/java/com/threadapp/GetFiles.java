package main.java.com.threadapp;


import java.io.File;
import java.util.Arrays;
import java.util.List;

public class GetFiles {
    private final String FILE_PATH = "D:\\JavaCourse\\ThreadApp\\src\\main\\resources";

    File dir = new File(FILE_PATH);
    File[] arrFiles = dir.listFiles();
    List<File> list = Arrays.asList(arrFiles);
}
