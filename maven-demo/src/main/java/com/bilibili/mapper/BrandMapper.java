package com.bilibili.mapper;

import com.bilibili.pojo.Brand;
import com.bilibili.pojo.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface BrandMapper {
    List<Brand> selectAll();

    Brand selectById(int id);

    /*条件查询
        1.散装参数
        2.对象参数
        3.map集合参数
        */

    //List<Brand> selectByCondition(@Param("status") int status, @Param("companyName") String companyName, @Param("brandName") String brandName);
    List<Brand> selectByCondition(Map map);

    /*单条件查询*/
    List<Brand> selectByConditionSingle(Brand brand);

    /*添加数据*/
    void add(Brand brand);

    /*修改数据*/
    int update(Brand brand);

    /*删除数据*/
    void deleteById(int id);

    /*批量删除*/
    void deleteByIds(@Param("ids") int[] ids);
}
