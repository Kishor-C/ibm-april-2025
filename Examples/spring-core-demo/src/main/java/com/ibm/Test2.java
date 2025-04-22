package com.ibm;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Test2 implements InitializingBean, DisposableBean{

	@Override
	public void destroy() throws Exception {
		System.out.println("destroy() in Test2");
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("afterPropertiesSet() in Test2");
	}

}
