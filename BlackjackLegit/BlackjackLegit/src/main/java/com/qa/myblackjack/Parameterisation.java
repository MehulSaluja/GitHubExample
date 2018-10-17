package com.qa.myblackjack;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)

public class Parameterisation 
{
	@Parameters
	
	public static Collection <Object[]> data() 
	{
		return Arrays.asList(new Object[][] {{0,-10,-3},{0,-10,5},{0,-10,25},{0,-10,45},{0,4,0},{4,4,30},{0,4,50},{0,23,-10},{18,25,18},{0,27,28},{0,28,60},{0,34,-10},{0,38,10},{0,39,28},{0,43,70},{20,20,18}});
	}
	
	private int expected;
	private int player;
	private int dealer;
	
	
	public Parameterisation( int expected1, int player1, int dealer1 )
	{
		expected=expected1;
		player=player1;
		dealer=dealer1;
	}
	
	@Test 
	public void test() 
	{
		Blackjack j = new Blackjack();
		assertEquals(expected, j.play(player,dealer)); 
	}
	

}
