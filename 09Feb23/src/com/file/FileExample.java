package com.file;

import java.io.File;
import java.io.IOException;

public class FileExample {

	public static void main(String[] args) {
		File file=new File("sampleExample.txt");//declare the method
		try {
			if(file.createNewFile()) {
				System.out.println(file.getName() +"file created");
			}else {
				System.out.println("file already exist");
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
