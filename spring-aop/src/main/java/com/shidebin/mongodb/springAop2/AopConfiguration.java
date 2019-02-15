package com.shidebin.mongodb.springAop2;

import java.util.HashMap;
import java.util.Map;

import org.apache.log4j.Logger;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.aop.aspectj.MethodInvocationProceedingJoinPoint;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.parser.JSONToken;
@Aspect
@Component
public class AopConfiguration {

	Logger logger = null;  
	//修饰词任意 com.shidebin包及其子包下的方法参数任意的方法
	@Before("execution(* com.shidebin..*.*(..))")
	void beforeAdvice(JoinPoint point) {
		Object[] args = point.getArgs();
		Map<String,Object> argMap = new HashMap<String,Object>();
		for(int i = 0; i<args.length;i++) {
			argMap.put("arg"+i, args[i]);
		}
		Signature signature = point.getSignature();
		logger = Logger.getLogger(signature.getDeclaringType());
		//方法名
		String name = signature.getName();
		String jsonString = JSONObject.toJSONString(argMap);
		logger.info("调用方法：<"+name+">\n方法参数为:\n"+jsonString);
	}
	//修饰词public 任意包下的方法参数任意的方法
	@After("execution(public *  *(..))")
	void AftereAdvice(JoinPoint point) {
		//方法名
		Signature signature = point.getSignature();
		logger = Logger.getLogger(signature.getDeclaringType());
		String name = signature.getName();
		logger.info("方法：<"+name+">调用完成");
	}
	//修饰词public 任意包下的方法参数任意的方法
	@AfterReturning(value = "execution(public * *(..))",returning="result")
	void AfterReturnAdvice(JoinPoint point, Object result) {
		// 方法名
		Signature signature = point.getSignature();
		logger = Logger.getLogger(signature.getDeclaringType());
		String name = signature.getName();
		logger.info("调用方法：<" + name + ">的返回值为："+JSONObject.toJSONString(result));
	}
	//修饰词任意 任意包下的方法参数任意的方法
	@AfterThrowing(value = "execution(**  *(..))",throwing="e")
	void afterThrowingAdvice(JoinPoint point,Exception e) {
		Object[] args = point.getArgs();
		Map<String,Object> argMap = new HashMap<String,Object>();
		for(int i = 0; i<args.length;i++) {
			argMap.put("arg"+i, args[i]);
		}
		Signature signature = point.getSignature();
		logger = Logger.getLogger(signature.getDeclaringType());
		//方法名
		String name = signature.getName();
		String jsonString = JSONObject.toJSONString(argMap);
		logger.info("调用方法：<"+name+">\n方法参数为:\n"+jsonString+"发生异常，异常如下：\n");
		e.printStackTrace();
	}
	//修饰词public 任意包下的方法参数任意的方法
	@Around("execution(public * *(..))")
	Object aroundAdvice(ProceedingJoinPoint point) throws Throwable {
		Object[] args = point.getArgs();
		Map<String,Object> argMap = new HashMap<String,Object>();
		for(int i = 0; i<args.length;i++) {
			argMap.put("arg"+i, args[i]);
		}
		Signature signature = point.getSignature();
		logger = Logger.getLogger(signature.getDeclaringType());
		//方法名
		String name = signature.getName();
		String jsonString = JSONObject.toJSONString(argMap);
		logger.info("调用方法：<"+name+">\n方法参数为:\n"+jsonString);
		Object proceed = point.proceed();
		logger.info("方法：<"+name+">调用完成");
		return proceed;
	}

}
