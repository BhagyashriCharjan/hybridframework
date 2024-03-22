package com.util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ExcelReaderUtility {
	
	FileInputStream inputStream;
	public static String projectPath = System.getProperty("user.dir");  // will get user current directory
	
	public void readExcel() throws FileNotFoundException {
		
		inputStream = new FileInputStream(projectPath+"\\src\\test\\resources\\DemoExcelSheeet.xlsx");
		
	}

}
