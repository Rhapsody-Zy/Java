package com.bilibili.mapper;

import com.bilibili.pojo.Emp;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.time.LocalDate;
import java.util.List;

@Mapper
public interface EmpMapper {

    /*//获取总记录数
    @Select("select count(*) from tlias.emp")
    public Long count();

    //分页查询获取总记录
    @Select("select * from tlias.emp limit #{start},#{pageSize}")
    public List<Emp> page(Integer start, Integer pageSize);*/

    //@Select("select * from tlias.emp")
    public List<Emp> list(String name, Short gender, LocalDate begin, LocalDate end);


    void delete(List<Integer> ids);

    @Insert("insert into tlias.emp(username, name, gender, image, job, entrydate, dept_id, create_time, update_time) " +
            "values(#{username},#{name},#{gender},#{image},#{job},#{entrydate},#{deptId},#{createTime},#{updateTime}) ")
    void save(Emp emp);
}
