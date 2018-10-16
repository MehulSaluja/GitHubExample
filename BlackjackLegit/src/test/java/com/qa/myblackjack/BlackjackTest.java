package com.qa.myblackjack;

import static org.junit.Assert.assertEquals;

import org.junit.*;


public class BlackjackTest 

{
	static int x=1;
	
	@BeforeClass 
	
	public static void Before ()
	{
		System.out.println("Welcome to my test");
	}
	
	
	@AfterClass
	
	public static void After ()
	{
		System.out.println("Test class complete");
	}
	
	@Before
	public void setup ()
	{
		System.out.println(" Test " + ( x ) + " out of 17 is currently running");
		
	}
	
	@After
	public void teardown ()
	{
		System.out.println("  Test " + ( x ) + " out of 17 completed");
		x++;
	}
	
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
	public void Testy6 ()
	{
		Blackjack b = new Blackjack();
		assertEquals ("2 valid entries",7, b.play(4, 7 )); //
	}
	
	@Test 
	public void Testy7 ()
	{
		Blackjack b = new Blackjack();
		assertEquals ("1 valid entry and 1 valid entry but bust",4, b.play(4, 30));
	}
	
	@Test 
	public void Testy8 ()
	{
		Blackjack b = new Blackjack();
		assertEquals ( "1 valid entry and 1 invalid high entry",0, b.play(4, 50));
	}
	
	@Test 
	public void Testy9 ()
	{
		Blackjack b = new Blackjack();
		assertEquals ("1 valid entry but bust and 1 low invalid entry ",0, b.play(23, -10));
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
	
	@Test 
	public void Testy17 ()
	{
		Blackjack b = new Blackjack();
		assertEquals ("2 valid entries",20, b.play(20, 18)); //
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
