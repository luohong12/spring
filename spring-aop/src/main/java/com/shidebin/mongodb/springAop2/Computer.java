package com.shidebin.mongodb.springAop2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Computer {
	
	public Computer() {
	}

	
	public void work(User user,String systemName){
		System.out.println(user.getUsername()+"正在使用"+systemName);
	}
	public User getWork(User user) {
		return user;
	}
	public int generateThrow(User user) {
		return user.getAge();
	}
}
