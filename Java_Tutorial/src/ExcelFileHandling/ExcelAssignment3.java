package ExcelFileHandling;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class ExcelAssignment3 {
	
	public void ReadDataBasedUponRangeNo(int StartRow , int EndRow) throws BiffException, IOException {
		File f = new File("..//Java_Tutorial//InputFile.xls");
		Workbook wb =Workbook.getWorkbook(f);
		Sheet ws = wb.getSheet(0);
		int r = ws.getRows();
		int c =ws.getColumns();
		for(int i = StartRow ;i<=EndRow;i++) {
		for(int j=0;j<c;j++) { 
			Cell c1 = ws.getCell(j,i);
			System.out.print(c1.getContents());
			
		}
		System.out.println();
		
		}
		
	}

	public static void main(String[] args) throws BiffException, IOException {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the starting row no.");
		int StartRow = sc.nextInt();
		System.out.println("Enter the ending row no");
        int EndRow = sc.nextInt();
        ExcelAssignment3 ea = new ExcelAssignment3();
        ea.ReadDataBasedUponRangeNo(StartRow,EndRow);

	}

}
