package com.hellojava.demo;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Demo {
	public static void main(String[] args) {
		//����Spring Bean������
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
		//1.����id��Spring�����е�bean��ȡ����
		//A a=(A) context.getBean("aclass");
		//2. ��̬������������
		//A a=(A) context.getBean("springFactory");
		//a.display();
		//3. ʵ������
		//B b=(B) context.getBean("hehe");
		//b.display();
		
		A a=(A) context.getBean("aclass");
		//�������رջ�����ʱ,ִ��destroy
		//context.close();
		context.destroy();
	}
}
