package com.test.spring.di05;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Ex03 {

	public static void main(String[] args) {
		
		//Ex03.java
		//AAA -> (의존) -> BBB -> (의존) -> CCC -> (의존) -> DDD
		
		// DI 구현 
		
		
		//EX03이 필요한 것은 단지 AAA인데 위의 b, c ,d 를 만들었어야 했다.
		
		
		//XML에서 설정한 의존 주입 관계를 적용하려면 스프링DI를 사용하여 객체를 생성해야 한다.
		ApplicationContext context = new ClassPathXmlApplicationContext("di03.xml");
		
		AAA a = (AAA)context.getBean("a");
		a.run();
		
		
		
		
		
		
		
		

		

	}

}
