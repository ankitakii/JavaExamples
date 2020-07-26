package tutorial;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class FileHandleRange {
	
	public void ReadDataFromRange(int StartLineNumber , int EndLineNumber ) throws IOException {
		
		String s;
		File f = new File("C:\\Users\\ankit1\\Desktop\\Dummydata.txt");
		FileReader fr = new FileReader(f);
		BufferedReader b = new BufferedReader(fr);
		for(int i=1; i<=StartLineNumber;i++) {
			
			if ( i== StartLineNumber) {
				s=b.readLine();
                 System.out.println(s);	
                 break;
			}
			else
				b.readLine();	
					}
		
		for(int j= StartLineNumber; j<EndLineNumber ;j++) {
			
			String d = b.readLine();
			System.out.println(d);
		}
		
	}

	public static void main(String[] args) throws IOException {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter which strating number of line you want to read ?");
		int StartLineNumber = s.nextInt();
		System.out.println("Enter upto which number of line you want to read ?");
		int EndLineNumber = s.nextInt();
		FileHandleRange fh = new FileHandleRange();
		fh.ReadDataFromRange(StartLineNumber,EndLineNumber );

	}

}
