package com.util;

import com.entity.Accounting;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

public class AnalysisExcelUtil {
    public static List<Accounting> readExcel(String excelName) throws IOException {
        List<Accounting> users=new ArrayList<Accounting>();
        //将文件读入
        InputStream in  = new FileInputStream(new File(excelName));
        //创建工作簿
        XSSFWorkbook wb = new XSSFWorkbook(in);
        //读取第一个sheet
        Sheet sheet = wb.getSheetAt(0);
        int totalRow=sheet.getLastRowNum();
        Row row=null;
        //循环读取科目
        for (int i = 1; i <=totalRow; i++) {
            //获取第i行
            row = sheet.getRow(i);
            //这里封装一个用户对象，对象里面包含了角色，默认为普通用户
            Accounting accounting = new Accounting();
            accounting.setAccountName(row.getCell(0).toString());
            accounting.setAccount(row.getCell(1).toString());


            //添加进入list集合
            users.add(accounting);

        }
        return users;
    }

}
