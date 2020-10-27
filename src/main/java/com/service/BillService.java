package com.service;

import com.entity.Bill;

import java.util.List;

/**
 * (Bill)表服务接口
 *
 * @author makejava
 * @since 2020-10-26 19:50:50
 */
public interface BillService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    Bill queryById(Integer id);

    /**
     * 通过实体作为筛选条件查询
     *
     * @param bill 实例对象
     * @return 对象列表
     */
    List<Bill> queryAll(Bill bill);

    /**
     * 通过实体作为筛选条件查询
     *
     * @param bill 实例对象
     * @return 条数
     */
    int queryAllNum(Bill bill);

    /**
     * 新增数据
     *
     * @param bill 实例对象
     * @return 实例对象
     */
    Bill insert(Bill bill);

    /**
     * 修改数据
     *
     * @param bill 实例对象
     * @return 实例对象
     */
    Bill update(Bill bill);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Integer id);

}