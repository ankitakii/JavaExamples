package tutorial;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class FileHandle {
	
	public void ReadData(int lineNumber) throws IOException {
		String s;
		File f = new File("C:\\Users\\ankit1\\Desktop\\Dummydata.txt");
		FileReader fr = new FileReader(f);
		BufferedReader b = new BufferedReader(fr);
		for(int i=1; i<=lineNumber;i++) {
			
			if ( i== lineNumber) {
				s=b.readLine();
                 System.out.println(s);	
                 break;
			}
			else
			s = b.readLine();
		}
		
	}

	public static void main(String[] args) throws IOException  {
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter which number of line you want to read ?");
		int lineNumber = s.nextInt();
		FileHandle fh = new FileHandle();
		fh.ReadData(lineNumber);
	}

}
