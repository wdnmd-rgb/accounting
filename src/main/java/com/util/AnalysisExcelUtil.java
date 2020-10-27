package com.util;

import com.entity.Bill;
import org.apache.poi.ss.usermodel.Cell;
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
    public static List<Bill> readExcel(String excelName) throws IOException {
        List<Bill> users=new ArrayList<Bill>();
        //将文件读入
        InputStream in  = new FileInputStream(new File(excelName));
        //创建工作簿
        XSSFWorkbook wb = new XSSFWorkbook(in);
        //读取第一个sheet
        Sheet sheet = wb.getSheetAt(0);
        int totalRow=sheet.getLastRowNum();
        Row row=null;
        //循环读取科目
        int num = sheet.getRow(0).getPhysicalNumberOfCells();
        for (int i = 1; i <=totalRow; i++) {
            List<String> stringList = new ArrayList<>();
            List<Double> doubleList = new ArrayList<>();
            //获取第i行
            row = sheet.getRow(i);
            //这里封装一个用户对象，对象里面包含了角色，默认为普通用户
            for (int j = 0;j<=num;j++){
                Cell cell = row.getCell(j);
                if(j!=4&&j!=5&&j!=6){
                    if(cell!=null){
                        stringList.add(cell.toString());
                    }else{
                        stringList.add(null);
                    }
                }else{
                    if(cell!=null){
                        doubleList.add(cell.getNumericCellValue());
                    }else{
                        doubleList.add(null);
                    }
                }
            }
            Bill bill = new Bill(stringList,doubleList);
            //添加进入list集合
            users.add(bill);
        }
        return users;
    }

}
