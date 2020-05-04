package utils;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import music.rhythm.Author;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintStream;

public class WriteReadFile {

	Scanner scan;
	static String path = "E:\\IRA\\solvd\\HW\\\\HWData";
	File file = new File(path);

	public void writeToFile(String path, String string) throws IOException {
		FileWriter writer = null;
		try {
			writer = new FileWriter(file, true);

			writer.write(string);
			writer.append("\n");
			writer.close();

		} catch (FileNotFoundException exc) {

			System.out.println("Sorry, path does not exist");
		}
	
     	
}

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
}
