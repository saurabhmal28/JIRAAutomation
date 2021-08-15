package com.genrics.jira;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class ExcelUpload implements AutoConstant {

	List<String> credential=new ArrayList<String>();
	
	
	
	
	public List<String> excelUp() throws IOException
	{
		List<String> username=new ArrayList<String>();
		List<String> password=new ArrayList<String>();
		
		FileInputStream fis = new FileInputStream(excel_path);
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		
		Sheet sheet= wb.getSheetAt(0);
		
		for(Row row : sheet)
		{
			for (Cell cell : row)
			{
				if(cell.getCellType() == cell.getCellType().STRING )
				{
					/* System.out.println(cell.getStringCellValue() + "\t"); */
					
					/* System.out.println(cell.getColumnIndex()); */
					 if(cell.getColumnIndex() == 0)
					 {
						 
						 username.add( cell.getStringCellValue());
					 }
					 else if(cell.getColumnIndex() == 1)
					 {
						 password.add( cell.getStringCellValue());
					 }
					 
					 
				}
				else if(cell.getCellType()  == cell.getCellType().NUMERIC)
				{
					System.out.println(cell.getNumericCellValue() + "\t");
				}
				else if(cell.getCellType() == cell.getCellType().FORMULA)
				{
					System.out.println(cell.getCellFormula() + "\t");
					
				}			
			}
		}
		
		credential.add(username.get(1));
		credential.add(password.get(1));
		return credential;
		
		
		
		
	}
	
	public List<String> getIncidentNumber() throws IOException
	{
		List<String> inc=new ArrayList<String>();
		List<String> wo=new ArrayList<String>();
		
		FileInputStream fis = new FileInputStream(excel_path);
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		
		Sheet sheet= wb.getSheetAt(1);
		
		for(Row row : sheet)
		{
			for (Cell cell : row)
			{
				if(cell.getCellType() == cell.getCellType().STRING )
				{
					/* System.out.println(cell.getStringCellValue() + "\t"); */
					
					/* System.out.println(cell.getColumnIndex()); */
					 if(cell.getColumnIndex() == 0)
					 {
						 
						 inc.add( cell.getStringCellValue());
					 }
					 else if(cell.getColumnIndex() == 1)
					 {
						 wo.add( cell.getStringCellValue());
					 }
					 
					 
				}
				else if(cell.getCellType()  == cell.getCellType().NUMERIC)
				{
					System.out.println(cell.getNumericCellValue() + "\t");
				}
				else if(cell.getCellType() == cell.getCellType().FORMULA)
				{
					System.out.println(cell.getCellFormula() + "\t");
					
				}			
			}
		}
		
		
		return inc;
		
		
		
		
	}



	
		
	}
