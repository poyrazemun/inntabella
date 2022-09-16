package com.intabella.excelRead;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ExcelRead {

    // Excel hierarchy
    // Workbook > Worksheet > Row > Cell

    // How to read using Apache POI:
    // XSSFWorkbook > XSSFSheet > XSSFRow > XSSFCell

    //XSSF -> XML spreadsheet format

    static String path = "apachePOI.xlsx";

    @Test
    public void readFromExcelFile() throws IOException {
        // to read from excel we need tı load it to FileInputStream
        FileInputStream fileInputStream = new FileInputStream(path);


        // 1. Create a work book
        XSSFWorkbook workbook = new XSSFWorkbook(fileInputStream);

        // 2. We need to get a specific worksheet from currently opened workbook
        XSSFSheet sheet = workbook.getSheet("Employees");

        // 3. Select row and cell
        // Print Mary's cell
        // Indexes start from 0

        XSSFRow row = sheet.getRow(1);
        XSSFCell cell = row.getCell(0);
        System.out.println("cell = " + cell);

        cell.setCellValue("Hüseyin"); //Writes
        System.out.println("cell = " + cell);
        FileOutputStream fos = new FileOutputStream(path);
        workbook.write(fos); // writes

        int physicalRowCount = sheet.getPhysicalNumberOfRows();
        int theLastRowNum = sheet.getLastRowNum();

        System.out.println("physicalRowCount = " + physicalRowCount);
        System.out.println("theLastRowNum = " + theLastRowNum);

        // TODO: Create a logic to print Vinod's name
        for (int rowNum = 0; rowNum < theLastRowNum; rowNum++){
            if (sheet.getRow(rowNum).getCell(0).toString().equals("Vinod")){
                System.out.println(sheet.getRow(rowNum).getCell(1));
            }
        }

        fos.close();
        workbook.close();
        fileInputStream.close();
    }




}
