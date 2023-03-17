package com.file;

import java.io.FileWriter;
import java.io.IOException;

public class WriteFile {

	public static void main(String[] args) {
		      
			    try {  
			        FileWriter fwrite = new FileWriter("sampleExample.txt");  
			        fwrite.write("This is Java programming file");   
			        fwrite.close();   
			        System.out.println("wrote to the file.");  
			    } catch (IOException e) {  
			        System.out.println("Unexpected error occurred");  
			        e.printStackTrace();  
			        }  
			    }  

	
}
