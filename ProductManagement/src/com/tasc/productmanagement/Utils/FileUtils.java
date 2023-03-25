package com.tasc.productmanagement.Utils;

import java.io.*;

public class FileUtils {
    public String readFile(String filename){
        try{
            FileReader reader = new FileReader(filename);
            BufferedReader buffer = new BufferedReader(reader);
            StringBuilder builder = new StringBuilder();
            String line = buffer.readLine();
            while (line != null){
                builder.append(line).append("\n");
                line = buffer.readLine();
            }
            reader.close();
            return builder.toString();
        } catch (IOException e){
            System.out.println("error file");
        }
        return null;
    }

    public void  writeFile(String filename, String content, boolean overwrite){
        try{
            FileWriter writer = new FileWriter(filename, overwrite);
            BufferedWriter bufferedWriter = new BufferedWriter(writer);
            bufferedWriter.write(content);
            bufferedWriter.newLine();
            bufferedWriter.close();
        } catch (IOException e){
            System.out.println("An error occurred");
            e.printStackTrace();
        }
    }
}
