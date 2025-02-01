package com.bilibili.mapper;

import com.bilibili.pojo.Dept;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface DeptMapper {
    /*查询全部部门数据*/
    @Select("select * from tlias.dept")
    List<Dept> list();

    /*根据id删除部门*/
    @Delete("delete from tlias.dept where id = #{id}")
    void deleteById(Integer id);

    /*新增部门*/
    @Insert("insert into tlias.dept(name, create_time, update_time) values (#{name},#{createTime},#{updateTime})")
    void insert(Dept dept);

    //根据部门id查找部门
    @Select("select * from tlias.dept where id = #{id}")
    Dept selectById(Integer id);

    //修改数据
    @Update("update tlias.dept set name = #{name}, dept.update_time = NOW() where id = #{id}")
    void update(Integer id, String name);
}
