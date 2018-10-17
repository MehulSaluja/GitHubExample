package com.qa.demo;

import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Event implements ActionListener {
	
	TextField t;

	public void actionPerformed(ActionEvent e) {
		
		System.out.println("Hello");
		t.setText("Hello");
		
	}
	
	public Event(TextField txt) {
		t= txt;
	}
	
	

}
