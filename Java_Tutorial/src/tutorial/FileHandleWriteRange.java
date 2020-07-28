package tutorial;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileHandleWriteRange {
	
	public void WriteRange(int StartLineNumber , int EndLineNumber , String input ) throws IOException {
		
		String s;
		File f = new File("C:\\Users\\ankit1\\Desktop\\FileWrite.txt");
		FileWriter fr = new FileWriter(f);
		for(int i=1; i<=StartLineNumber;i++) {
			
			if ( i== StartLineNumber) {
				fr.write(input + "\n");	
                 break;
			}	
					}
		
		for(int j= StartLineNumber; j<EndLineNumber ;j++) {
			
			fr.write(input + "\n");	
			fr.close();
		}
		
		
	}

	public static void main(String[] args) throws IOException {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter which strating number of line you want to read ?");
		int StartLineNumber = s.nextInt();
		System.out.println("Enter upto which number of line you want to read ?");
		int EndLineNumber = s.nextInt();
		s.nextLine();
		System.out.println("Enter the text wou want to write");
		String input =s.nextLine();
		FileHandleWriteRange fh = new FileHandleWriteRange();
		fh.WriteRange(StartLineNumber,EndLineNumber,input );
	}

}
