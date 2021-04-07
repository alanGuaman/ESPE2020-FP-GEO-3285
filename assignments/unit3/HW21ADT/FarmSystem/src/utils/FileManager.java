/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utils;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author Personal
 */
public class FileManager {

    public static boolean createFile(String fileShoe) {
        boolean created = false;
        try {
            File file = new File(fileShoe + ".txt");
            if (file.createNewFile()) {
                System.out.println("file was created");

                created = true;
            } else {
                System.out.println("file already exists");
                created = false;

            }
        } catch (IOException ex) {
            ex.printStackTrace();
            created = false;
        }
        return created;

    }

    public static boolean save(String data, String fileShoe) {
        boolean saved = false;

        createFile(fileShoe);

        try {
            FileWriter myWrite = new FileWriter(fileShoe + ".csv", true);
            myWrite.write(System.getProperty("line.separator") + data);
            myWrite.close();
            System.out.println("a new record of " + fileShoe + " was saved");
            saved = true;

        } catch (IOException ex) {
            ex.printStackTrace();
            saved = false;
        }
        return saved;

    }

    public static String read(String fileShoe) {
        fileShoe = null;
        String text = null;
        String document = "C:\\Users\\Personal\\OneDrive\\Espe\\FP\\ESPE2020-FP-GEO-3285\\workshops\\unit3\\WS26ADT\\FarmSystem\\shoes.txt";
        try (BufferedReader textBr = new BufferedReader(new FileReader(document))) {
            while ((fileShoe = textBr.readLine()) != null) {
                text = fileShoe;
            }
        } catch (IOException ex) {
            System.out.println("Error");
            ex.printStackTrace();
        }
        return text;
    }
}
