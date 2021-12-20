package com.greatlearning.dsa.service;

public class NotesCount {
	public void implimentNotesCount(int notes[], int amt)
	{
		int noteCounter[] = new int[notes.length];
		try
		{
			for(int i=0; i<notes.length ;i++) 
			{
				if(amt > notes[i])
				{
					noteCounter[i] = amt/notes[i];
					amt = amt- noteCounter[i] * notes[i] ;
					
				}
				
				if(amt >0)
				{
					System.out.println("Exact amount cannot be given with the highest denomination:");
					
				}
				
				else
				{
					System.out.println("Your payment in order to give minimum number of note will be: ");
					for(int i1=0; i1<notes.length ;i1++)
					{
						if(noteCounter[i1] !=0 )
						{
							System.out.println(notes[i1]+ ":" + noteCounter[i1]);
							
						}
					}
						
				}
			}
		}
		catch(ArithmeticException ae)
		{
			System.out.println(ae +"Notes of denomination 0 is invalid");
			
		}
	}
	
}
