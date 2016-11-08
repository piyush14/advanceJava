package com.callback;

import org.springframework.context.weaving.LoadTimeWeaverAware;
import org.springframework.core.io.ResourceLoader;
import org.springframework.instrument.classloading.LoadTimeWeaver;
import org.springframework.jmx.export.notification.NotificationPublisher;
import org.springframework.jmx.export.notification.NotificationPublisherAware;
import org.springframework.context.*;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;

public class ExampleBean implements ApplicationContextAware,
ApplicationEventPublisherAware, BeanClassLoaderAware, BeanFactoryAware,
BeanNameAware, LoadTimeWeaverAware, MessageSourceAware,
NotificationPublisherAware, ResourceLoaderAware  {

	
	public void initBean() {
		System.out.println("Inside initBean()");
	}
	public void afterPropertiesSet() throws Exception {
		System.out.println("afterPropertiesSet");
	}

	public void destroy() throws Exception {
		System.out.println("destroy()");

	}

	public ExampleBean(){
		System.out.println("In constructor");
	}

	public void setBeanName(String arg0) {
		System.out.println("bean name : "+arg0);
	}

	public void setBeanFactory(BeanFactory arg0) throws BeansException {
		System.out.println("bean factory : "+ arg0);		
	}

	public void setBeanClassLoader(ClassLoader arg0) {
		System.out.println("bean class loader : "+arg0);
		
	}

	public void setApplicationContext(ApplicationContext arg0) throws BeansException {
		// TODO Auto-generated method stub
		
	}

	public void setResourceLoader(ResourceLoader arg0) {
		// TODO Auto-generated method stub
		
	}

	public void setNotificationPublisher(NotificationPublisher arg0) {
		// TODO Auto-generated method stub
		
	}

	public void setMessageSource(MessageSource arg0) {
		// TODO Auto-generated method stub
		
	}

	public void setLoadTimeWeaver(LoadTimeWeaver arg0) {
		// TODO Auto-generated method stub
		
	}

	public void setApplicationEventPublisher(ApplicationEventPublisher arg0) {
		// TODO Auto-generated method stub
		
	}
}