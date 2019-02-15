package com.shidebin.mongodb.springAop;

import java.util.HashMap;
import java.util.Map;

import org.apache.log4j.Logger;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.springframework.aop.aspectj.MethodInvocationProceedingJoinPoint;

import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.parser.JSONToken;

public class AopConfiguration {
	Logger logger = null;  
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
	void AftereAdvice(JoinPoint point) {
		//方法名
		Signature signature = point.getSignature();
		logger = Logger.getLogger(signature.getDeclaringType());
		String name = signature.getName();
		logger.info("方法：<"+name+">调用完成");
	}

	void AfterReturnAdvice(JoinPoint point, Object result) {
		// 方法名
		Signature signature = point.getSignature();
		logger = Logger.getLogger(signature.getDeclaringType());
		String name = signature.getName();
		logger.info("调用方法：<" + name + ">的返回值为："+JSONObject.toJSONString(result));
	}
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
	//环绕是before和after的功能相加
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
