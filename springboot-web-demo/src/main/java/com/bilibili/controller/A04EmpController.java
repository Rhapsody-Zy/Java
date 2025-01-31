package com.bilibili.controller;

import com.bilibili.pojo.Emp;
import com.bilibili.pojo.Result;
import com.bilibili.service.EmpService;
import com.bilibili.service.imlp.EmpServiceA;
import com.bilibili.util.XmlParserUtils;
import jakarta.annotation.Resource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
public class A04EmpController {
    //@Autowired
    //当有多个bean时
    @Resource(name = "empServiceA")
    private EmpService empService;

    @RequestMapping("/listEmp")
    public Result list() {
        //调用service，获取数据
        List<Emp> empList = empService.listEmp();
        //3.响应数据
        return Result.success(empList);

    }


    /*//1.加载并解析emp.xml
    String file = this.getClass().getClassLoader().getResource("emp.xml").getFile();
        System.out.println(file);
    List<Emp> empList = XmlParserUtils.parse(file, Emp.class);

    //2.对数据进行转换处理
        empList.forEach(emp -> {
        String gender = emp.getGender();
        if ("1".equals(gender)) {
            emp.setGender("男");
        } else if ("2".equals(gender)) {
            emp.setGender("女");
        }

        String job = emp.getJob();
        if ("1".equals(job)) {
            emp.setJob("讲师");
        } else if ("2".equals(job)) {
            emp.setJob("班主任");
        }else if ("3".equals(job)) {
            emp.setJob("辅导员");
        }
    });
    //3.响应数据
        return Result.success(empList);
*/
}


