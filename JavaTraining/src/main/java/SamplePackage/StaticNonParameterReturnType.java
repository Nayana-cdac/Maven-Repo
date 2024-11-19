package SamplePackage;

public class StaticNonParameterReturnType {

	public static int details() 
	    { 
	    	int age=18; 
	        return age; 
	    } 
	    public static void main(String[] args) 
	    { 
	       int x=StaticNonParameterReturnType.details(); 
	       System.out.println(x); 
	        
	       //System.out.println(StaticNonParameterReturnType.details()); 

	    }
}
