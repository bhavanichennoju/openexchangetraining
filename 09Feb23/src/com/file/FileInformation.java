package com.file;

import java.io.File;

public class FileInformation {

	public static void main(String[] args) {
		File file=new File("sampleExample.txt");//declare the method
		if(file.exists()) {
			System.out.println(file.getName());// Returning the file name
			System.out.println(file.getAbsolutePath());// Returning the path of the file 
			System.out.println(file.canWrite());//
			System.out.println(file.canRead());
			System.out.println(file.length());
		}

	}

}
