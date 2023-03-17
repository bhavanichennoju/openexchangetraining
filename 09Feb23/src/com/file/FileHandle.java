package com.file;

import java.io.ByteArrayInputStream;
import java.io.IOException;

public class FileHandle{
	   public static void main(String []arr) throws IOException{
		     byte [] byteList={10,40,81,23,32,100,57};
		     ByteArrayInputStream by=new ByteArrayInputStream(byteList);
		 
		     int value=0;
		     while((value=by.read())!=-1)
		     {
		        int number=value;
		        if(number%2==0)
		          System.out.println(number+" is an even number.");
		        else
		          System.out.println(number+" is an odd number.");
		     }
		   }
		}
