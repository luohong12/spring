package com.shidebin.mongodb.springAop;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.shidebin.mongodb.springAop.Computer;
import com.shidebin.mongodb.springAop.User;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class AopConfigureTest {
	@Autowired
	public Computer computer;
	@Test
	public void test() {
		User user = new User();
		user.setUsername("shidebin");
		user.setCountry("china");
		user.setAge(29);
		computer.work(user,"win7");
		System.out.println("test method runing");
	}
	@Test 
	public void testReturn() {
		User user = new User();
		user.setUsername("shidebin");
		user.setCountry("china");
		user.setAge(29);
		computer.getWork(user);
	}
	@Test
	public void testException() {
		User user = null;
		computer.generateThrow(user);
	}
}
