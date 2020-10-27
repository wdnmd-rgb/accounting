package com.service.impl;

import com.dao.BillDao;
import com.entity.Bill;
import com.service.BillService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (Bill)表服务实现类
 *
 * @author makejava
 * @since 2020-10-26 19:50:50
 */
@Service("billService")
public class BillServiceImpl implements BillService {
    @Resource
    private BillDao billDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public Bill queryById(Integer id) {
        return this.billDao.queryById(id);
    }

    @Override
    public List<Bill> queryAll(Bill bill) {
        return this.billDao.queryAll(bill);
    }

    @Override
    public int queryAllNum(Bill bill) {
        return this.billDao.queryAllNum(bill);
    }


    /**
     * 新增数据
     *
     * @param bill 实例对象
     * @return 实例对象
     */
    @Override
    public Bill insert(Bill bill) {
        this.billDao.insert(bill);
        return bill;
    }

    /**
     * 修改数据
     *
     * @param bill 实例对象
     * @return 实例对象
     */
    @Override
    public Bill update(Bill bill) {
        this.billDao.update(bill);
        return this.queryById(bill.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        return this.billDao.deleteById(id) > 0;
    }
}