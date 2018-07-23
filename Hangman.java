/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hangman;

import java.io.*;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Acer
 */
public class Hangman {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException
    {         
        frist display = new frist(); 
        display.setVisible(true);          
        }
    private static String text;
    public static String Easy()throws IOException{
         int index;
         int count=1;
         String word="";
         Random rand = new Random();
         index= (rand.nextInt(998) + 1);
         File file = new File("words.txt");
            Scanner input = new Scanner(file);
            while (input.hasNext())
            {
                String str = input.nextLine();
                    if (count == index)
                       word = str;   
                count += 1;
            }
            input.close();
         return word;
     }
    public static String Difficult()throws IOException{
         int index;
         int count=1;
         String word="";
         Random rand = new Random();
         index=( (rand.nextInt(34)+999));
         File file = new File("words.txt");
            Scanner input = new Scanner(file);
            while (input.hasNext())
            {
                String str = input.nextLine();
                    if (count == index)
                       word = str;   
                count += 1;
            }
            input.close();
         return word;
     }
    public static String Blanks(String w){
        String x = "";
        for (int i = 0 ; i < w.length(); i++){
                x= x + "_" ;
            }       
        return x;
    }
    //word = actual word
    //user = the words with still blank spaces
    //u = user new letter input 
    // z = count down
    
}
