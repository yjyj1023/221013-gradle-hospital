package org.example;

import java.io.*;
import java.util.List;

public class FileController<H> {
    public FileController(HospitalParser hospitalParser) {
    }

    public void writeLines(List<String> strs, String filename){
        File file = new File(filename);
        try {
            BufferedWriter writer
                    = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file), "utf-8"));
            for(String str:strs){
                writer.write(str);
            }
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    public void createANewFile(String filename) throws IOException{
        File file = new File(filename);
        file.createNewFile();
        System.out.println("Have a file generated?:" + file.exists());
    }
}
