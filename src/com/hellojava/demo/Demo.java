package com.hellojava.demo;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Demo {
	public static void main(String[] args) {
		//创建Spring Bean的容器
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
		//1.根据id将Spring容器中的bean提取出来
		//A a=(A) context.getBean("aclass");
		//2. 静态工厂创建对象
		//A a=(A) context.getBean("springFactory");
		//a.display();
		//3. 实例工厂
		//B b=(B) context.getBean("hehe");
		//b.display();
		
		A a=(A) context.getBean("aclass");
		//在容器关闭或销毁时,执行destroy
		//context.close();
		context.destroy();
	}
}
