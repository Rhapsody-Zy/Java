package com.bilibili;

import com.bilibili.mapper.EmpMapper;
import com.bilibili.pojo.Emp;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringbootMybatisApplicationTests {

	@Autowired
	private EmpMapper empMapper;

	@Test
	public void testDelete(){
		empMapper.delete(17);
	}

	@Test
	public void testInsert() {
		empMapper.insert(new Emp());
	}
}
