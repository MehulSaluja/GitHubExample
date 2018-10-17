package com.qa.demo;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.*;
import java.awt.TextField;
import java.awt.event.ActionListener;

public class App 
{
    public static void main( String[] args )
    {
    	Frame f = new Frame();
    	Frame f1 = new Frame();
//    	f.add(f1, BorderLayout.NORTH);
    	Button b1 = new Button("Click 1");
    	TextField t1 = new TextField();
//    	Button b2 = new Button("Click 2");
//    	Button b3 = new Button("Click 3");
    	
    	f.add(t1, BorderLayout.NORTH);
    	f.add(b1, BorderLayout.CENTER);
//    	f.add(b2, BorderLayout.WEST);
//    	f.add(b3, BorderLayout.EAST);
    	
    	Event e = new Event(t1);
    	b1.addActionListener(e);
    
    	f.setSize(400, 400);
    	f.setVisible(true);
    }
    	
}
