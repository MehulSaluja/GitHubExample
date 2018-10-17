package com.qa.demo;

public class QAConsulting {
	int pounds;
	static {
		int dollar = 100;
	}
	static QAConsulting R;
	private QAConsulting() {
		pounds = 20;
	}
	
	public static QAConsulting createAUser() {
		if (R == null) {
			R = new QAConsulting();
		}
		return R;
	}

	
}
