package com.shidebin.mongodb.springAop;

/**
 * 
 * @author Five老师
 * @createTime 2017年12月7日 下午5:56:23
 * 
 */
public class Computer {

	private ComputerSystem system;
	
	//依赖注入---构造注入
	public Computer(ComputerSystem system){
		this.system = system;
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
