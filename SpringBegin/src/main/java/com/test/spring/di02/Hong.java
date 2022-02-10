package com.test.spring.di02;

public class Hong {

	private Pen pen;

	public Hong() {
		this.pen = null;
	}

	public Hong(Pen pen) {
		this.pen = pen;
	}

	public void setPen(Pen pen) {
		this.pen = pen;
	}
	
	public void run() {
		pen.draw();
	}

}
