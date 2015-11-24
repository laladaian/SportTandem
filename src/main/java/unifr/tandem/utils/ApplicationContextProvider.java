package main.java.unifr.tandem.utils;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 */
public class ApplicationContextProvider implements ApplicationContextAware {

	private static ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");;

	public static ApplicationContext getApplicationContext() {
		return ctx;
	}

	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		this.ctx = ctx;
	}
}
