package com.Framework.Library;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Date;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadExcel extends BaseTest{

	static File file =new File(filepath);
	static FileInputStream fis;
	static Workbook workbook;
	static Sheet sheet;
	
	public static Date dob( String sheetname,int rowcount ,int colcount) throws EncryptedDocumentException, IOException{
		
		fis=new FileInputStream(file);
		sheet=workbook.getSheet(sheetname);
		workbook=WorkbookFactory.create(fis);
			return sheet.getRow(rowcount).getCell(colcount).getDateCellValue();
		}
	public static String name(String sheetname,int rowcount ,int colcount) throws EncryptedDocumentException, IOException{
		fis=new FileInputStream(file);
		sheet=workbook.getSheet(sheetname);
		workbook=WorkbookFactory.create(fis);
		return sheet.getRow(rowcount).getCell(colcount).getStringCellValue();
			}
			
	public static int MOB(String sheetname,int rowcount ,int colcount) throws EncryptedDocumentException, IOException{
		fis=new FileInputStream(file);
		sheet=workbook.getSheet(sheetname);
		workbook=WorkbookFactory.create(fis);
			return (int) sheet.getRow(rowcount).getCell(colcount).getNumericCellValue();
			}
	public static boolean execute(String sheetname,int rowcount ,int colcount) throws EncryptedDocumentException, IOException{
		fis=new FileInputStream(file);
		sheet=workbook.getSheet(sheetname);
		workbook=WorkbookFactory.create(fis);
				return sheet.getRow(rowcount).getCell(colcount).getBooleanCellValue();
			}
	public static Object[][] data(String sheetname) throws EncryptedDocumentException, IOException {
		File file=new File("./TestData/values.xlsx");
		FileInputStream fis=new FileInputStream(file);
		Workbook wb=WorkbookFactory.create(file);
		Sheet sheet=wb.getSheet(sheetname);
		int rowcount=sheet.getPhysicalNumberOfRows();
		int colcount=sheet.getRow(2).getPhysicalNumberOfCells();
		Object[][] data=new Object[rowcount-1][colcount];
		for(int i=1;i<rowcount;i++){
			for(int j=0; j<colcount;j++){
				data[i-1][j]=sheet.getRow(i).getCell(j).toString();
			}
		}
	return data;
	}
	
}

