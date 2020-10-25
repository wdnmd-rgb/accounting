package com.service.impl;

import com.entity.Accounting;
import com.dao.AccountingDao;
import com.service.AccountingService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (Accounting)表服务实现类
 *
 * @author makejava
 * @since 2020-10-21 17:01:29
 */
@Service("accountingService")
public class AccountingServiceImpl implements AccountingService {
    @Resource
    private AccountingDao accountingDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public Accounting queryById(Integer id) {
        return this.accountingDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<Accounting> queryAllByLimit(int offset, int limit) {
        return this.accountingDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param accounting 实例对象
     * @return 实例对象
     */
    @Override
    public Accounting insert(Accounting accounting) {
        this.accountingDao.insert(accounting);
        return accounting;
    }

    /**
     * 修改数据
     *
     * @param accounting 实例对象
     * @return 实例对象
     */
    @Override
    public Accounting update(Accounting accounting) {
        this.accountingDao.update(accounting);
        return this.queryById(accounting.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        return this.accountingDao.deleteById(id) > 0;
    }
}