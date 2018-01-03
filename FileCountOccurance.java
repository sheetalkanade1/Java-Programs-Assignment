//Write a program to search for a string in a file and then return the count of number of occurrences of the string.
package com.sheetal;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class FileCountOccurance {
	public static void main(String args[]) throws Exception {

		String findWord = "java";
		String filePath = "C:\\Users\\Sheetal\\eclipse-workspace\\JavaProgramsAssignment\\resources\\wordcount.txt";
		String strLine;
		int numFound = 0;

		try {
			FileInputStream fis = new FileInputStream(filePath);
			DataInputStream dis = new DataInputStream(fis);
			BufferedReader br = new BufferedReader(new InputStreamReader(dis));

			while ((strLine = br.readLine()) != null) {
				strLine = strLine + " ";
				String[] strArry = strLine.split(findWord);

				if (strArry.length > 1) {
					numFound = numFound + strArry.length - 1;
				} else {
					if (strLine == findWord) {
						numFound++;
					}
				}
			}

			dis.close();

			System.out.println(findWord + " has occurred " + numFound + " times.");

		} catch (Exception e) {
		}
	}
}
