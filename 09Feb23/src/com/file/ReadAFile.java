package com.file;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadAFile {
		public static void main(String[] args) {
			try {
				File file = new File("sampleExample.txt");
				Scanner sc = new Scanner(file);
				while (sc.hasNextLine()) {
					String str = sc.nextLine();
					System.out.println(str);
				}
				sc.close();
			} catch (FileNotFoundException e) {
				System.out.println("An error occurred.");
				e.printStackTrace();
			}
	}
}
