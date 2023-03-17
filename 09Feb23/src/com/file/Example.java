package com.file;

import java.io.File;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.IOException;

public class Example {
	public static void main(String[] args) {
	File f = new File("sampleExample.txt");
	FileInputStream inF = null;
	FileDescriptor fd = null;

	try {
	    inF = new FileInputStream(f);
	    fd = inF.getFD();
	    System.out.print("Is file valid? "+fd.valid());

	} catch (IOException e) {
	    e.printStackTrace(System.err);
	    System.exit(1);
	}
	}
}
