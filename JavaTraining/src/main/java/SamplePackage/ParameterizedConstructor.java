package SamplePackage;

public class ParameterizedConstructor {

	public ParameterizedConstructor(int a,int b) 
	 { 
	 	System.out.println(a+b); 
	 } 
	    
	   public static void main(String args[]) 
	   { 
		   ParameterizedConstructor obj =new ParameterizedConstructor(4,5); 
		   ParameterizedConstructor obj1 =new ParameterizedConstructor(6,9); 
	   }
}
