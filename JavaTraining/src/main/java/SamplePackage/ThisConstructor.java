package SamplePackage;

public class ThisConstructor {

	ThisConstructor() 
 	{ 
 		System.out.println("hello a"); 
 		}   
	ThisConstructor(int x) 
 	{   
 	this();   // invoke the default constructor first and then print value of x
 	System.out.println(x);   
 	}   
 	 
 	 
 	public static void main(String args[]) 
 	{   
 		ThisConstructor a=new ThisConstructor(10);   
 	}

}
