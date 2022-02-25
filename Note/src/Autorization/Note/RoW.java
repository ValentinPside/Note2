/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Autorization.Note;

import Autorization.User;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import javafx.scene.control.TextArea;


/**
 *
 * @author user
 */
public class RoW {
    public static void saveFile(User user, String text){
        try {
            File file = new File(user.getId() + ".txt");
                try (FileWriter fileWriter = new FileWriter(file)) {
                    fileWriter.write(text);
                    fileWriter.close();
                }
                
            }catch(IOException e){
            e.getMessage();
        }
        
    }
    
    public static String readFile(User user, TextArea textArea) {
        String text = "";
            try{
                File file = new File(user.getId() + ".txt");
                FileReader fReader = new FileReader(file);
                char[] temp = new char[1024];
                int i;
                while ((i = fReader.read(temp)) > 0){
                    String line = new String(temp, 0, i);
                    textArea.appendText(line);
                return text;
            } 
            }catch (FileNotFoundException ex) {
                ex.getMessage();
            } catch (IOException ex) {
                ex.getMessage();
            }
        return text;
    }
}
