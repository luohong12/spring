package com.shidebin.mongodb.springAop2;

import org.springframework.stereotype.Component;

@Component
public class Windows2000 implements ComputerSystem {
	public void run(){
		System.out.println("电脑工作在Windows 2000系统上。");
	}
	
}
