import java.io.File;

import java.io.FileNotFoundException;

import java.util.Scanner;

import javax.swing.JFileChooser;

public class FileAway
{
    public static void main(String[] args)
    {
        {
            //Create a file chooser object
            final JFileChooser file_chooser = new JFileChooser();
            //show dialog to select file
            int returnVal = file_chooser.showOpenDialog(null);
            //get selected file
            File file=file_chooser.getSelectedFile();
            //variable to store data
            int lineCount=0;
            int wordCount=0;
            int characterCount=0;
            String line="";

            try
            {
                //create a scanner to read from file
                Scanner read=new Scanner(file);
                //keep on reading until the file is empty
                while(read.hasNextLine())
                {
                    line=read.nextLine();
                    //split line by spaces
                    String words[]=line.split(" ");
                    //update counts
                    characterCount=characterCount+line.length();
                    wordCount=wordCount+words.length;
                    lineCount=lineCount+1;
                }

            } catch (FileNotFoundException e)
            {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            //display stats
            System.out.printf("File name: %s \n Character count: %d \n Word count: %d \n Line count: %d \n",file.getName(),characterCount,wordCount,lineCount);
        }
    }
}