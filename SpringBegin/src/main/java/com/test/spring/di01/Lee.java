package com.test.spring.di01;

public class Lee {
	private Pen pen;
	
	public Lee(Pen pen) {
		this.pen=pen;
	}
	
	public void run() {
		//Pen 생성 후 그림 그리기
		pen.draw();
	}
}
