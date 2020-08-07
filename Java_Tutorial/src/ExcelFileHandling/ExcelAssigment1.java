package ExcelFileHandling;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class ExcelAssigment1 {
	
	public void ReadDataBasedUponRowNoAndColumnNo1(int c , int r) throws BiffException, IOException {
		
		File f = new File("..//Java_Tutorial//InputFile.xls");
		Workbook wb =Workbook.getWorkbook(f);
		Sheet ws = wb.getSheet(0);
		Cell c1 = ws.getCell(c, r);
		System.out.println(c1.getContents());
	}
	

	public static void main(String[] args) throws BiffException, IOException {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the column no.");
		int c = sc.nextInt();
		System.out.println("Enter the row no");
        int r = sc.nextInt();
        ExcelAssigment1 ea = new ExcelAssigment1();
        ea.ReadDataBasedUponRowNoAndColumnNo1(c, r);

	}

}
