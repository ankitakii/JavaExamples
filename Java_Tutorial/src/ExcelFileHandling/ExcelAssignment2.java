package ExcelFileHandling;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class ExcelAssignment2 {
	
	public void ReadDataBasedUponRowNo(int r) throws BiffException, IOException {
		
		File f = new File("..//Java_Tutorial//InputFile.xls");
		Workbook wb =Workbook.getWorkbook(f);
		Sheet ws = wb.getSheet(0);
		int c =ws.getColumns();
		for(int i=0;i<c;i++) { 
			Cell c1 = ws.getCell(i, r);
			System.out.print(c1.getContents());
		}
		
		
	}

	public static void main(String[] args) throws BiffException, IOException {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the row no.");
        int r = sc.nextInt();
        ExcelAssignment2 ea = new ExcelAssignment2();
        ea.ReadDataBasedUponRowNo(r);

	}

}
