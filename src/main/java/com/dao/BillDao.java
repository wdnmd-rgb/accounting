package com.dao;

import com.entity.Bill;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * (Bill)表数据库访问层
 *
 * @author makejava
 * @since 2020-10-26 19:50:49
 */
@Mapper
public interface BillDao {

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
     * @return 影响行数
     */
    int insert(Bill bill);


    /**
     * 修改数据
     *
     * @param bill 实例对象
     * @return 影响行数
     */
    int update(Bill bill);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Integer id);

}