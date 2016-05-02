package com.ttdev.spring.server;

import org.apache.axis2.extensions.spring.receivers.ApplicationContextHolder;
import org.springframework.context.ApplicationContext;

import com.ttdev.spring.middletier.ConcatService;

public class SpringServiceImpl implements SpringServiceSkeletonInterface {

	@Override
	public String concat(String s1, String s2) {
		ApplicationContext ctx = ApplicationContextHolder.getContext();
		ConcatService bean = (ConcatService)ctx.getBean("concatBean");
		return bean.concat(s1, s2);
	}

}
