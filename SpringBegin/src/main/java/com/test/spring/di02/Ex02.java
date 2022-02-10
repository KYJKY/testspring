package com.test.spring.di02;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Ex02 {

	public static void main(String[] args) {
		
//		//직접 DI 구현
//		Pen pen = new Pen();
//		Hong hong = new Hong(pen); //의존주입(DI)
//		hong.run();
		
		
		
		
//		//Spring DI 구현
		
		// XML 설정 읽기
		ApplicationContext context = new ClassPathXmlApplicationContext("di02.xml");
		
		Pen pen2 = (Pen)context.getBean("pen"); //new Pen() 실행 후 객체 반환
//		pen2.draw();
		
		
		Hong hong2 = (Hong)context.getBean("hong");
		hong2.setPen(pen2);
		hong2.run();
		
		
		
		
//		ApplicationContext context = new ClassPathXmlApplicationContext("di02.xml");
//		
//		Hong hong3 = (Hong)context.getBean("hong");
//		hong3.run();
		
		
	}

}
























