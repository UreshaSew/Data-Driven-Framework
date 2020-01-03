package com.fortunaglobal.ReadExcelData;


import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;

public class ReadExcel {
    public static void main(String[] args) throws Exception {

        File src = new File("E:\\DataDrivenFramework\\src\\test\\resources\\excels\\TestData.xlsx");
        FileInputStream fis = new FileInputStream(src);
        XSSFWorkbook wb = new XSSFWorkbook(fis); // FOR .xls file
        XSSFSheet sheet1 = wb.getSheetAt(0);      // FOR .xlsx file
        String data0 = sheet1.getRow(0).getCell(0).getStringCellValue();
        System.out.println("Data from excel is " + data0);

        String data1 = sheet1.getRow(0).getCell(1).getStringCellValue();
        System.out.println("Data from excel is " + data1);

        wb.close(); // avoid memory leak

    }

}
