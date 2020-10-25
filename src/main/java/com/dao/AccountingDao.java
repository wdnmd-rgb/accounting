package com.dao;

import com.entity.Accounting;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * (Accounting)表数据库访问层
 *
 * @author makejava
 * @since 2020-10-21 17:01:29
 */
@Mapper
public interface AccountingDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    Accounting queryById(Integer id);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<Accounting> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param accounting 实例对象
     * @return 对象列表
     */
    List<Accounting> queryAll(Accounting accounting);

    /**
     * 新增数据
     *
     * @param accounting 实例对象
     * @return 影响行数
     */
    int insert(Accounting accounting);

    /**
     * 修改数据
     *
     * @param accounting 实例对象
     * @return 影响行数
     */
    int update(Accounting accounting);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Integer id);

}