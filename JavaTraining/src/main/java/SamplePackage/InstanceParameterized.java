package SamplePackage;

public class InstanceParameterized {
	 public  void details(int a,String b) 
     { 
       System.out.println(a); 
       System.out.println(b); 
     } 
     public static void main(String[] args) 
     { 
    	 InstanceParameterized obj=new InstanceParameterized(); 
         obj.details(5,"Hi");
     }
}
