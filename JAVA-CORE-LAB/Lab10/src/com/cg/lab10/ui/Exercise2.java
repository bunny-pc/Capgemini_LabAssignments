package com.cg.lab10.ui;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Exercise2 {

	public static void main(String[] args) throws IOException {
		int lineNumber=1;
		FileReader fr = null;
		BufferedReader br = null;
		try {
			Scanner scan = new Scanner(System.in);
			System.out.print("Enter file name : ");
			String fileName = scan.nextLine();
			fr = new FileReader(fileName);
			br = new BufferedReader(fr);
			String line = null;
						
			while(true) {		
				line = br.readLine(); 
                if (line == null) {			
					break;
                }
                if(!(line.isEmpty())) {
                	
                	System.out.println(lineNumber+" "+line);
                	lineNumber++;
                }
			}
			scan.close();
			
		}catch (FileNotFoundException excep) {
			System.out.println("No such file present.");
		} catch(IOException excep) {
			System.out.println("Could not read file.");
		}
		finally {
			try {
				fr.close();
				br.close();
			} catch(IOException excep) {
				excep.printStackTrace();
			}
			
		}
	}


}
