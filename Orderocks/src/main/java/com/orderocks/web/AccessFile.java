package com.orderocks.web;

import java.io.FileInputStream;

import java.io.FileNotFoundException;

import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFCell;

import org.apache.poi.xssf.usermodel.XSSFRow;

import org.apache.poi.xssf.usermodel.XSSFSheet;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import org.openqa.selenium.By;

public class AccessFile {

	 public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream(System.getProperty("user.dir") +"\\resources\\OrderRocksInput.xlsx");
		XSSFWorkbook workBook = new XSSFWorkbook(fis);
		
		int sheets = workBook.getNumberOfSheets();
		for(int i=0; i<sheets; i++)
		{
			if(workBook.getSheetName(i).equalsIgnoreCase("Sheet1"));
			XSSFSheet sheet = workBook.getSheetAt(i); 
			
			Iterator<Row> rows = sheet.iterator();
			Row firstRow = rows.next();
			Iterator<Cell> ce =firstRow.cellIterator();
			int k =0;
			int column = 0;
			while(ce.hasNext())
			{
				Cell value = ce.next();
				if(value.getStringCellValue().equalsIgnoreCase("TestCase"))
				{
					column = k;
				}
				k++;
				
			}
			System.out.println(column);
		}
				
				
	}

}
