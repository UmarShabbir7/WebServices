package org.spring.invo8.httpInvoker;

import java.rmi.RemoteException;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Client {
	
	public static void main(String[] args) throws RemoteException{  
		ApplicationContext context = new ClassPathXmlApplicationContext("client-beans.xml");
//		ApplicationContext context = new ClassPathXmlApplicationContext("/WEB-INF/spring-config.xml");  
		Calculation calculation = (Calculation)context.getBean("clientBean");  
		System.out.println(calculation.cube(5));  
	}  
}
