package com.qa.myblackjack;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ValidBlackjack 

{
	@Test 
	public void Testy6 ()
	{
		Blackjack b = new Blackjack();
		assertEquals ("2 valid entries",7, b.play(4, 7 )); //
	}
	
	@Test 
	public void Testy17 ()
	{
		Blackjack b = new Blackjack();
		assertEquals ("2 valid entries",20, b.play(20, 18)); //
	}
	

}
