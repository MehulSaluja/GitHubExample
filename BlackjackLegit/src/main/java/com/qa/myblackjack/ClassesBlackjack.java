package com.qa.myblackjack;


import static org.junit.Assert.assertEquals;

import org.junit.*;

public class ClassesBlackjack 

{
	

	@Test
	public void Testy1 () 
	{
		Blackjack b = new Blackjack();
		
		assertEquals ("2 low invalid entries",0, b.play(-10, -3));
		
	}
	
	@Test
	public void Testy2 () 
	{
		Blackjack b = new Blackjack();
		assertEquals ("1 low invalid entry",0, b.play(-10, 5));
		
	}
	
	@Test 
	public void Testy3 ()
	{
		Blackjack b = new Blackjack();
		assertEquals ("1 low invalid entry a nd 1 valid high entry",0, b.play(-10, 25));
	}
	
	@Test 
	public void Testy4 ()
	{
		Blackjack b = new Blackjack();
		assertEquals ("1 low invalid entry and 1 invalid high entry",0, b.play(-10, 45));
	}
	
	@Test 
	public void Testy5 ()
	{
		Blackjack b = new Blackjack();
		assertEquals ("1 valid entry and 1 invalid low entry",0, b.play(4, 0));
	}
	
	@Test 
	public void Testy9 ()
	{
		Blackjack b = new Blackjack();
		assertEquals ("1 valid entry but bust and 1 low invalid entry ",0, b.play(23, -10));
	}
	
	@Test 
	public void Testy12 ()
	{
		Blackjack b = new Blackjack();
		assertEquals ("1 valid entry bust and 1 invalid high entry",0, b.play(28, 60));
	}
	
	@Test 
	public void Testy13 ()
	{
		Blackjack b = new Blackjack();
		assertEquals ("2 invalid entries, one too high and one too low",0, b.play(34, -10));
	}
	
	@Test 
	public void Testy8 ()
	{
		Blackjack b = new Blackjack();
		assertEquals ( "1 valid entry and 1 invalid high entry",0, b.play(4, 50));
	}
	
	@Test 
	public void Testy14 ()
	{
		Blackjack b = new Blackjack();
		assertEquals ("one invalid high entry and 1 valid entry",0, b.play(38, 10));
	}
	
	@Test 
	public void Testy15 ()
	{
		Blackjack b = new Blackjack();
		assertEquals ("1 invalid high entry and 1 valid entry but bust ",0, b.play(39, 28));
	}
	
	@Test 
	public void Testy16 ()
	{
		Blackjack b = new Blackjack();
		assertEquals ("2 high entries, both invalid",0, b.play(43, 70));
	}
	
	
}
