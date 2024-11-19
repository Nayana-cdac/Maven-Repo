package SamplePackage;

public class ThisMethod {

	 void show() 
		{ 
			System.out.println("hello m"); 
		}   
		void display() 
		{   
		System.out.println("hello n");  
		  
		this.show();   // to invoke method of current class 
		//show();  // this keyword is not mandatory to invoke 
		}   
		   
		 
		public static void main(String args[]) 
		{   
			ThisMethod  a=new ThisMethod ();   
			a.display();  //call display and need to print both hello m and hello n by invoking show() method using this in display function 
		}

}
