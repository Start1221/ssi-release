package com.jshand.ssi.action;

import com.jshand.ssi.service.TestService;
import com.opensymphony.xwork2.Action;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;

/**
 * @file_name	TestAction.java
 * @project		ssi-release
 * @author  	jshand
 * @createDate	Jun 2, 2013  12:37:18 PM
 * @version 	1.0
 * http://www.jshand.com
 *
 */

public class ExcelAction implements Action{

    private InputStream excelStream;

    private String fileName;

    //http://localhost:8080/ssi-release/test.action
    public String execute() throws Exception{
        Workbook xls = new HSSFWorkbook();
        Sheet sheet = xls.createSheet();
        Row row = sheet.createRow(0);
        Cell cell = row.createCell(0);
        cell.setCellValue("你好");
        workbook2InputStream(xls,"Excel");
        return SUCCESS;
    }

    private void workbook2InputStream(Workbook workbook,String fileName)throws Exception{
        this.fileName = fileName; //设置fileName
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        workbook.write(baos);
        baos.flush();
        byte[] aa = baos.toByteArray();
        excelStream = new ByteArrayInputStream(aa, 0, aa.length);
        baos.close();
    }

    public InputStream getExcelStream() {
        return excelStream;
    }

    public void setExcelStream(InputStream excelStream) {
        this.excelStream = excelStream;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }
}
