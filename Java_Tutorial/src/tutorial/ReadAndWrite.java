package tutorial;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ReadAndWrite {
	
	public void ReadAndWriteHandle(int rowCount ,String input) throws IOException {
		File f = new File("C:\\Users\\ankit1\\Desktop\\FileWriterRead.txt");
		FileWriter fw = new FileWriter(f);

		for(int i=1;i<=rowCount;i++) {
			fw.write(input + "\n");
		}
		
		fw.close();
		String s;
		FileReader fr = new FileReader(f);
		BufferedReader b = new BufferedReader(fr);
		System.out.println("Below text in file : ");
		while((s=b.readLine())!=null) {
			
			System.out.println(s);
		}
	

	
}
	public static void main(String[] args) throws IOException {
		Scanner s  = new Scanner(System.in);
		System.out.println("Enter line number upto  you want to write :");
		int rowCount = s.nextInt();
		s.nextLine();
		System.out.println("Enter the text wou want to write");
		String input =s.nextLine();
		ReadAndWrite rw = new ReadAndWrite();
		rw.ReadAndWriteHandle(rowCount,input);

	}

}
