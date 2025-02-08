package com.singoltone;

public class Samosa {
	private  static Samosa samosa;
	private Samosa()
	
	{
		
	}
	public static Samosa getSamosa() //object of this class
	{ 
	if (samosa==null) {
	samosa=	new Samosa();
		
	}
		return samosa;
		
	}

}
//constructor are private
//object create with the help of method
//create filed to store object in private
