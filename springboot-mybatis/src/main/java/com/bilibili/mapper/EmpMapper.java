package com.bilibili.mapper;

import com.bilibili.pojo.Emp;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface EmpMapper {

    //根据id删除
    @Delete("delete from mybatis.emp where id = #{id}")
    public void delete(Integer id);

    @Insert("insert into mybatis.emp(username, name, gender, image, job, entrydate, dept_id, create_time, update_time) " +
            "value (#{username},#{name},#{gender},#{image},#{job},#{entryDate},#{deptId},#{createTime},#{updateTime},)")
    public void insert(Emp emp);
}
