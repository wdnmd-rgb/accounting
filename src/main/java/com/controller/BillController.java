package com.controller;

import com.entity.Bill;
import com.service.BillService;
import com.util.AnalysisExcelUtil;
import com.util.Result;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * (Bill)表控制层
 *
 * @author makejava
 * @since 2020-10-26 19:50:50
 */
@RestController
@RequestMapping("bill")
public class BillController {
    /**
     * 服务对象
     */
    @Resource
    private BillService billService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public Bill selectOne(Integer id) {
        return this.billService.queryById(id);
    }

    @RequestMapping("update")
    public boolean update(@RequestParam("file") MultipartFile file, HttpServletRequest request)throws IOException {
        String fileName = file.getOriginalFilename();
        FileOutputStream out =null;
        String path = "d:\\files";
        File dir = new File(path);
        if(!dir.exists()) {
            dir.mkdir();
        }

        path = path + File.separator + fileName;
        //将临时文件写入到真实文件中去
        try {
            out = new FileOutputStream(path);
            out.write(file.getBytes());
            //同时解析excle文件
            List<Bill> list= AnalysisExcelUtil.readExcel(path);
            System.out.println(list.size());
            for(int i = 0;i<list.size();i++){
                Bill bill = list.get(i);
                billService.insert(bill);
            }
            //解析之后将返回得结果扔给消息服务器
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            return false;
        }
        finally {
            try {
                out.flush();
                out.close();
            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }

        }
        return true;
    }

    @RequestMapping("queryAll")
    public Object queryAll(Bill bill){
        List<Bill> list = billService.queryAll(bill);
        int num = billService.queryAllNum(bill);
        return Result.getStringObjectMap(num,list);
    }

}