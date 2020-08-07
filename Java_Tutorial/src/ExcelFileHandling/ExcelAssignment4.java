package ExcelFileHandling;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import jxl.Workbook;
import jxl.read.biff.BiffException;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;
import jxl.write.biff.RowsExceededException;

public class ExcelAssignment4 {
	
	public void WriteData(int c , int r) throws IOException, RowsExceededException, WriteException {
		File f = new File("..//Java_Tutorial//OutputFile.xls");
		WritableWorkbook wb = Workbook.createWorkbook(f);
		WritableSheet ws = wb.createSheet("Ankit", 0);
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the data");
        String id = sc.nextLine();
		Label l = new Label(c,r,id);
		ws.addCell(l);
		wb.write();
		wb.close();
		
	}

	public static void main(String[] args) throws BiffException, IOException, RowsExceededException, WriteException {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the column no");
		int c = sc.nextInt();
		System.out.println("Enter the row no");
        int r = sc.nextInt();
        ExcelAssignment4 ea = new ExcelAssignment4();
        ea.WriteData(c, r);

	}

}
