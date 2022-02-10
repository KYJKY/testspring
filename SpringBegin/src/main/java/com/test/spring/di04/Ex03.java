package com.test.spring.di04;

public class Ex03 {

	public static void main(String[] args) {
		
		//Ex03.java
		//AAA -> (의존) -> BBB -> (의존) -> CCC -> (의존) -> DDD
		
		// DI 구현 
		DDD d = new DDD();
		CCC c = new CCC(d);
		BBB b = new BBB(c);
		
		//EX03이 필요한 것은 단지 AAA인데 위의 b, c ,d 를 만들었어야 했다.
		AAA a = new AAA(b);
		a.run();
		
		
		
		
		
		
		
		

		

	}

}
