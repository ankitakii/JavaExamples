package ExcelFileHandling;

import java.io.File;
import java.io.IOException;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class ExcelAssignment {
	
	public void ReadDataBasedUponRowNoAndColumnNo(int a) throws BiffException, IOException {
		
		File f = new File("..//Java_Tutorial//InputFile.xls");
		Workbook wk =Workbook.getWorkbook(f);
		Sheet ws = wk.getSheet(0);
		int r = ws.getRows();
		int c =ws.getColumns();
		
		for(int i=0;i<r;i++) {
			
			for(int j=0; j<c;j++) {
				
			Cell c1 = ws.getCell(j, i);
				System.out.println(c1.getContents());
			}
			
		}
	}
	

	public static void main(String[] args) throws BiffException, IOException {
		
		ExcelAssignment ea = new ExcelAssignment();
		ea.ReadDataBasedUponRowNoAndColumnNo(0);
		

	}

}
