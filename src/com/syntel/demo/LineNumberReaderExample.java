package com.syntel.demo;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.LineNumberReader;
 
public class LineNumberReaderExample
{
	public static final String SEARCHWORD = "public";
	static String fileName ="D://SLSWorkSpace//SampleProject//src//com//syntel//demo//TestJava2.java";
	 int searchLineNumber=0;
   public static void main(String[] args)
   {
      String fileName ="D://SLSWorkSpace//SampleProject//src//com//syntel//demo//TestJava2.java";
     
      int readFromFile = readFromFile(fileName);
      writeAnnotation(readFromFile);
      System.out.println("searchLineNumber Value::::"+readFromFile);
   }
 
   private static int readFromFile(String filename)
   {
      LineNumberReader lineNumberReader = null;
      int searchLineNumber=0;
      try
      {
         lineNumberReader = new LineNumberReader(new FileReader(filename));         
         String line = null;
         while ((line = lineNumberReader.readLine()) != null)
         {
            if (line.indexOf(SEARCHWORD) >= 0) {
            	searchLineNumber = lineNumberReader.getLineNumber();
            	break;
		        }
         }
         System.out.println("Line " + lineNumberReader.getLineNumber());
        
      }
      catch (Exception ex)
      {
         ex.printStackTrace();
      } finally
      {
         try {
            if (lineNumberReader != null){
               lineNumberReader.close();
            }
         } catch (IOException ex){
            ex.printStackTrace();
         }
      }
	return searchLineNumber;
   }
   
   public static void writeAnnotation(int lineNumber){
       try {
    	   File f=new File(fileName);
               FileWriter fw = new FileWriter(fileName,true);
               BufferedWriter bw = new BufferedWriter(fw);
               LineNumberReader  lnr = new LineNumberReader(new FileReader(f));
               lnr.setLineNumber(lineNumber);

               for(int i=1;i<=lnr.getLineNumber();i++){            	 
            		   bw.newLine();
               }
               bw.write("Hello World");
               bw.close();
               lnr.close();
               } catch (IOException e) {
               e.printStackTrace();
       }
   }
   
}