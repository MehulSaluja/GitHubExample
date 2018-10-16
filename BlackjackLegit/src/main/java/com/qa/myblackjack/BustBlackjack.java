package com.qa.myblackjack;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class BustBlackjack

{
	@Test 
	public void Testy7 ()
	{
		Blackjack b = new Blackjack();
		assertEquals ("1 valid entry and 1 valid entry but bust",4, b.play(4, 30));
	}
	
	@Test 
	public void Testy10 ()
	{
		Blackjack b = new Blackjack();
		assertEquals ("1 valid entry but bust and 1 valid entry",18, b.play(25, 18));
	}
	
	@Test 
	public void Testy11 ()
	{
		Blackjack b = new Blackjack();
		assertEquals ("2 valid entries, both bust",0, b.play(27, 28));
	}
	
}
