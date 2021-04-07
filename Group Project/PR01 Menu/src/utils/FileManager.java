package utils;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class FileManager {
    public static boolean createFile(String fileName){
        boolean created = false;
        try {
            File file = new File(fileName + ".csv");
            if(file.createNewFile()){
                System.out.println("File was created");
                created = true;
            } else{
                System.out.println("File already exists");
                created = false;
            }
        } catch (IOException ex){
            ex.printStackTrace();
            created = false;
        }
        return created;
    }
    
    public static boolean save(String data, String fileName){
        boolean saved = false;
        createFile(fileName);
        
        try {
            FileWriter myWrite = new FileWriter(fileName + ".csv", true);
            myWrite.write(data + System.getProperty("line.separator"));
            myWrite.close();
            System.out.println("A new record of " +fileName+ " was saved.");
            saved = true;
        } catch (IOException ex){
            ex.printStackTrace();;
            saved = false;
        }
        return saved;
    }
    
}
