package com.file;

import java.io.FileInputStream;

public class CharaterStreamRead {

	public static void main(String[] args) {
		FileInputStream fin=null;
		try{
		    fin=new FileInputStream("sampleExample.txt");
		    int i=0;
		    while((i=fin.read())!=-1){
		        System.out.print((char)i);
		    }
		    fin.close();
		} catch (Exception e) {
		    e.printStackTrace();;
		}

	}

}
