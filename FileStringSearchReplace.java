/*Write a program to search for a string in a file and then replace it with another string.
modifyFile(). This method reads all the content of input text file into a String object, 
replaces the old string with new string using replaceAll() and rewrites the new content back into the same file using FileWriter. 
Create BufferedReader object to read the input text file line by line*/
package com.sheetal;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileStringSearchReplace {
	static void modifyFile(String filePath, String oldString, String newString) {
		File fileModified = new File(filePath);

		String oldContent = "";

		BufferedReader reader = null;

		FileWriter writer = null;

		try {
			reader = new BufferedReader(new FileReader(fileModified));
			String line = reader.readLine();

			while (line != null) {
				oldContent = oldContent + line + System.lineSeparator();

				line = reader.readLine();
			}

			String newContent = oldContent.replaceAll(oldString, newString);
			writer = new FileWriter(fileModified);
			writer.write(newContent);
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				reader.close();

				writer.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) {
		modifyFile("C:\\Users\\Sheetal\\eclipse-workspace\\JavaProgramsAssignment\\resources\\wordcount.txt", "i",
				"we");

	}

}
