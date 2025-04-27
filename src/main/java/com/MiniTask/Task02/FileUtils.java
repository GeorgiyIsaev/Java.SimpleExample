package com.MiniTask.Task02;

import java.io.*;
import java.nio.file.Path;
import java.util.Scanner;

public class FileUtils {
    private FileUtils(){}
    public static String readText(Path p) throws IOException {
        StringBuilder result = new StringBuilder();
        try (BufferedReader br = new BufferedReader(new FileReader(p.toString()))) {
            String line;

            while((line = br.readLine()) != null) {
                result.append(line);
                result.append('\n');
            }
        } catch (IOException e) {
           throw new IOException(e);
        }
        return result.toString();
    }
}
