package com.shidebin.mongodb.springAop2;

import org.springframework.stereotype.Component;

@Component
public class Windows7 implements ComputerSystem {
	public void run(){
		System.out.println("电脑工作在Windows7系统上。");
	}
}
