package tutorial;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileHandleWrite {

	public void WriteData(int rowCount , String input) throws IOException {
		
	File f = new File("C:\\Users\\ankit1\\Desktop\\FileWrite.txt");
	FileWriter fr = new FileWriter(f);

	for(int i=1;i<=rowCount;i++) {
		fr.write(input + "\n");
	}
	
	fr.close();
	}
	
	
	public static void main(String[] args) throws IOException {
		Scanner s  = new Scanner(System.in);
		System.out.println("Enter line number upto  you want to write :");
		int rowCount = s.nextInt();
		s.nextLine();
		System.out.println("Enter the text wou want to write");
		String input =s.nextLine();
		FileHandleWrite fh = new FileHandleWrite();
		fh.WriteData(rowCount,input);
		
		

	}

}
