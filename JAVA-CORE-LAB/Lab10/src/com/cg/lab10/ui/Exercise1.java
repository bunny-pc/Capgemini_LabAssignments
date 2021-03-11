package com.cg.lab10.ui;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.Scanner;

public class Exercise1 {

	public static void main(String[] args) throws IOException {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter path and file name: ");
		String path = scan.next();
		
		File file = new File(path);
		if (file.exists()) {
			if (file.isFile()) {
				if(file.canRead()) {
					System.out.println("File is Readable");
				}else {
					System.out.println("File is not Readable");
				}
				if(file.canWrite()) {
					System.out.println("File is Writable");
				}else {
					System.out.println("File is not Writable");
				}
				System.out.println("Type of File is "+ Files.probeContentType(file.toPath()));
				System.out.println("This file is of " + file.length() + " bytes in size.");
			} else {
				System.out.println("The files of type folder");
			}
		} else {
			System.out.println("File Not Exist");
		}
		
		scan.close();
	}


}
