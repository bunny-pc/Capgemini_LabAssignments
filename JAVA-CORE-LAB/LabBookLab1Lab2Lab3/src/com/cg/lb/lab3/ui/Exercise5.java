package com.cg.lb.lab3.ui;
/*
 *  D:\venka\workclass\javeSE\IOStreamDemo\names.txt
 */

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Exercise5 {
	public static void main(String[] args) {
		FileReader fr = null;
		BufferedReader br = null;
		try {
			Scanner scan = new Scanner(System.in);
			System.out.print("Enter file name : ");
			String fileName = scan.nextLine();
			fr = new FileReader(fileName);
			br = new BufferedReader(fr);
			String line = null;
			int countLine=0;
			int countWords=0,countChar=0;
			
			while(true) {		
				line = br.readLine(); 
                if (line == null)			// EOF
					break;
                
				countLine+=1;
				countChar+=line.length();
				String[] wordList = line.split("[,  ]+"); 
	            countWords+= wordList.length;
			}
			System.out.println("Number of Lines : "+countLine+"\nNumber of Words : "+countWords+"\nNumber of Charecters : "+countChar);
			scan.close();
		} catch (FileNotFoundException excep) {
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
