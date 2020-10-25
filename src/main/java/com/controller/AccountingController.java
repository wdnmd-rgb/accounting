package com.controller;

import com.entity.Accounting;
import com.service.AccountingService;
import com.util.AnalysisExcelUtil;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * (Accounting)表控制层
 *
 * @author makejava
 * @since 2020-10-21 17:01:29
 */
@RestController
@RequestMapping("accounting")
public class AccountingController {
    /**
     * 服务对象
     */
    @Resource
    private AccountingService accountingService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public void
    selectOne(Integer id) {
        System.out.println(id);
    }

    @RequestMapping("update")
    public boolean update(@RequestParam("file") MultipartFile file, HttpServletRequest request)throws IOException {
        String fileName = file.getOriginalFilename();
        FileOutputStream out =null;
        System.out.println(fileName);
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
            List<Accounting> list= AnalysisExcelUtil.readExcel(path);
            System.out.println(list.size());
            for(int i = 0;i<list.size();i++){
                Accounting accounting = list.get(i);
                System.out.println(accounting);
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

}