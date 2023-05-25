package com;
import java.util.*;
import java.util.random.*;
public class NoGussesing {
	
	int guess_no ;
	int RandomNo;
	
	public void guess_no()
	{
		Scanner sc =new Scanner(System.in);
		
		System.out.println("The Game Begins.....");
		System.out.println("Guess the number between 1 to 100");
		 Random r = new Random();
	        int RandomNo = r.nextInt(100) + 1;
		
	        
	        
	        for(int i=0; i<=6; i++)
	        {
	        	
	        	System.out.println("Guess the Number:-");
	        	guess_no=sc.nextInt();
	        	
	        	if(RandomNo == guess_no)
	        	{
	        		System.out.println("Excellent!...You guess it correctly");
	        		 System.out.println("You guess the number "+RandomNo+" in "+i+"th guesse");
	        		
	        		 if(i==1)
	        		 {
	        			 System.out.println("You get 100 points.....NICE KEEP IT UP"); 
	        			 break;
	        		 }
	        		 
	        		 else if(i==2)
	        		 {
	        			 System.out.println("You get 70 points.....NICE KEEP IT UP"); 
	        			 break;
	        		 }
	        		 else if(i==3)
	        		 {
	        			 System.out.println("You get 55 points.....NICE KEEP IT UP"); 
	        			 break;
	        		 }
	        		 else if(i==4)
	        		 {
	        			 System.out.println("You get 40 points.....NICE KEEP IT UP"); 
	        			 break;
	        		 }
	        		 else if(i==5)
	        		 {
	        			 System.out.println("You get 25 points.....NICE KEEP IT UP");
	        			 break;
	        		 }
	        		 else if(i==6)
	        		 {
	        			 System.out.println("You get 10 points.....NICE KEEP IT UP"); 
	        			 break;
	        		 }
	        	}
	        	
	        	else if(RandomNo > guess_no)
	        	{
	        		System.out.println("The number is bigger than your number");
	        		
	        	}
	        	
	        	
	        	else if(RandomNo < guess_no)
	        	{
	        		System.out.println("The number is lesser than your number");
	        		
	        	}
	        }
	        
	        if(RandomNo!= guess_no){
                System.out.println("You tried 6 times...\nYou lose the game!....\n Better Luck Next Time..");
                System.out.println("GAME ENDS");
	        
	}
	
	    
	
	}
}