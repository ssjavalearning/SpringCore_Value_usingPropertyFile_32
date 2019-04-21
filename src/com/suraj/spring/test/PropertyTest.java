package com.suraj.spring.test;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.suraj.spring.beans.Login;

public class PropertyTest {

	public static void main(String[] args) {
		ApplicationContext context = null;
		try {
			context = new ClassPathXmlApplicationContext("spring.xml");
			Login login = context.getBean("login", Login.class);
			System.out.println(login.getUsername()+"\t"+login.getPassword());
		}catch(BeansException e) {
			e.printStackTrace();
		}finally {
			((AbstractApplicationContext) context).close();
		}
	}

}
