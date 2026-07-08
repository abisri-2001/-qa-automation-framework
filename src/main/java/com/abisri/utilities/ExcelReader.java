package com.abisri.utilities;

import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReader {

    public static Object[][] getExcelData() throws Exception {

        FileInputStream fis =
                new FileInputStream("testdata/LoginData.xlsx");

        XSSFWorkbook workbook =
                new XSSFWorkbook(fis);

        XSSFSheet sheet =
                workbook.getSheet("LoginData");

        int totalRows =
                sheet.getLastRowNum();

        int totalColumns =
                sheet.getRow(0).getLastCellNum();

        int actualRows = 0;

        for (int i = 1; i <= totalRows; i++) {

            XSSFRow row = sheet.getRow(i);

            if (row != null &&
            	    row.getCell(0) != null &&
            	    !row.getCell(0).toString().trim().isEmpty()) {

            	    actualRows++;
            	
            }
        }

        Object[][] data =
                new Object[actualRows][totalColumns];

        int dataIndex = 0;

        for (int i = 1; i <= totalRows; i++) {

            XSSFRow row = sheet.getRow(i);

            if (row == null ||
            	    row.getCell(0) == null ||
            	    row.getCell(0).toString().trim().isEmpty()) {

            	    continue;
            	}

            for (int j = 0; j < totalColumns; j++) {

                if (row.getCell(j) != null) {

                    data[dataIndex][j] =
                            row.getCell(j).toString();
                }
            }

            dataIndex++;
        }

        workbook.close();

        fis.close();
        System.out.println("Total Rows detected: " + totalRows);
        System.out.println("Actual Data Rows: " + actualRows);
        System.out.println("DataProvider Array Length: " + data.length);
        return data;
    }
}