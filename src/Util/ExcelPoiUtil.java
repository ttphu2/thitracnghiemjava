package Util;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.util.NumberToTextConverter;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExcelPoiUtil {
    public static Workbook getWorkBook(String fileName,String fileLocation) throws  IOException {
        FileInputStream excelFile=new FileInputStream(new File(fileLocation));
        Workbook workbook=null;
        if(fileName.endsWith("xls")){
        workbook=new HSSFWorkbook(excelFile);
        }else if (fileName.endsWith("xlsx")){
            workbook=new XSSFWorkbook(excelFile);
        }
        return workbook;

    }
    public static String getCellValue(Cell cell){
        String cellValue=null;
        if(cell==null){
            return cellValue;
        }
        
        switch (cell.getCellType()) {
            case STRING:
                cellValue=cell.getStringCellValue();
                break;
            case BOOLEAN:
                cellValue=Boolean.toString(cell.getBooleanCellValue());
                break;
            case NUMERIC:
                cellValue= NumberToTextConverter.toText(cell.getNumericCellValue());
                break;
            case FORMULA:
                switch (cell.getCellType()){
                    case STRING:
                        cellValue=cell.getStringCellValue();
                        break;
                    case NUMERIC:
                        cellValue= NumberToTextConverter.toText(cell.getNumericCellValue());
                        break;
                }
        }
        return cellValue;

    }
}
