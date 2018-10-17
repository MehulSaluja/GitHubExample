package com.qa.myblackjack;

public class Blackjack {
	public int play (int player, int dealer) 
	{
	if (player > 0 && dealer > 0 && player <32 && dealer <32 ) 
	{
		     if (player > 21 && dealer >21) 
			{ 
		    	 return 0;
		    }
			 else if (dealer <= 21 && player >21) 
		    {
			return dealer;
		    }  
			 else if (player <= 21 && dealer >21) 
		    {
			return player;
		    }else if(player <=21 && dealer<= 21) {	return (player>dealer ? player : dealer);}
		     return 0;


	}else {
		
		return 0;
		
	}

	}
		
}
	
	

