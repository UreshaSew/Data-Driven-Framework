package com.fortunaglobal.ReadExcelData;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;

public class ReadExcel1 {
    public static void main(String[] args) throws Exception {

        File src = new File("E:\\DataDrivenFramework\\src\\test\\resources\\excels\\TestData.xlsx");
        FileInputStream fis = new FileInputStream(src);
        XSSFWorkbook wb = new XSSFWorkbook(fis); // FOR .xls file
        XSSFSheet sheet1 = wb.getSheetAt(0);      // FOR .xlsx file
        // how many data cells in sheet
        int rowCount = sheet1.getLastRowNum();
        System.out.println("total row is " + rowCount);

        wb.close(); // avoid memory leak

    }

}
