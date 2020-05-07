package utils;

import menu.AuthorMenu;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Scanner;

import lists.AuthorList;
import music.rhythm.Author;


import java.io.PrintWriter;

public class WriteReadFile {

	Scanner scan;
	static String path = "E:\\IRA\\solvd\\HW\\\\HWData";
	File file = new File(path);

	
//	public List <Author> readFromFile(String path) {
//		List<Author> listAuthor = new ArrayList<>();
//		try {
//
//			scan = new Scanner(file);
//
//			while (scan.hasNextLine()) {
//				System.out.println(scan.nextLine());
//			}
//
//		} catch (FileNotFoundException exc) {
//
//			System.out.println("Sorry, file does not exist");
//
//		} finally {
//			scan.close();
//		}
//
//		return listAuthor ;
//
//	}
//	public void writeToFile(String path, AuthorList alist) {
//		PrintWriter writer = null;
//		
//		try {
//			writer = new PrintWriter(file);
//			for (Author authorlist:
//                ) {
//               writer.println(alist);
//			writer.println(alist);
//
//			writer.close();
//			}
//		} catch (FileNotFoundException exc) {
//
//			System.out.println("Sorry, path does not exist");
//		}
//	
	public String readFromFile(String string) {

		try {

			scan = new Scanner(file);

			while (scan.hasNextLine()) {
				System.out.println(scan.nextLine());
			}

		} catch (FileNotFoundException exc) {

			System.out.println("Sorry, file does not exist");

		} finally {
			scan.close();
		}

		return "";
	}
	
	public void writeToFile(String path, List<?> listAuthor) {

        File file = new File(path);
        try {
            PrintWriter printWriter = new PrintWriter(file);
            for (Object list: listAuthor){
            printWriter.println(list);
            }
            printWriter.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
}
}
