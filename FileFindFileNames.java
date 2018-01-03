//Write a program to show list of all file names in a folder.
//create File object by passing folder path. Call list() method on file object to get list of file names in the folder.
package com.sheetal;

import java.io.File;

public class FileFindFileNames {
	public static void main(String a[]){
        File file = new File("C:\\Users\\Sheetal\\eclipse-workspace\\JavaProgramsAssignment\\resources\\");
        String[] fileList = file.list();
        for(String names:fileList){
            System.out.println(names);
        }
    }
}

