package SamplePackage;

public class StaticParameterMethod {
	
	 public static void details(int a,int b) //non parameterized static method
     { 
       System.out.println(a+b); 
       
    } 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StaticParameterMethod.details(4,6); //invoke static method
	}
	
}
