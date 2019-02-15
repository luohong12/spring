package com.shidebin.spring;

import java.beans.PropertyDescriptor;

import org.springframework.beans.BeanUtils;

import com.shidebin.vo.AgentInfoEntity;

public class BeanUtilsTest {
	public static void main(String[] args) {
		PropertyDescriptor propertyDescriptor = BeanUtils.getPropertyDescriptor(AgentInfoEntity.class, "tradeCode");
	}
}
