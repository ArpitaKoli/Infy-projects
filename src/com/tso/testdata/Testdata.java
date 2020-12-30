package com.tso.testdata;

import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Testdata 
{
public static Object[][] getdata() throws Exception
{
	FileInputStream fis=new FileInputStream("./src/com/tso/testdata/data.xlsx");
	Workbook excel=WorkbookFactory.create(fis);
	Sheet sh=excel.getSheet("sheet1");
	Object[][]data=new Object[sh.getLastRowNum()][sh.getRow(0).getLastCellNum()];
	for (int i = 0; i <sh.getLastRowNum(); i++) 
	{
		Row r=sh.getRow(i+1);
		for (int j = 0; j <r.getLastCellNum(); j++) 
		{
			Cell c=r.getCell(j);
			data[i][j]=c.toString();
		}	
	}
	return data;

}

 

}

