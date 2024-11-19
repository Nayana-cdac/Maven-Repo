package superPackage;

public class SuperVariable2 extends SuperVariable1 {
	String name = "Neethu";
	 public void show() 
	 { 
	 	System.out.println(super.name); 
	 	System.out.println(name); 
	 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SuperVariable2 obj = new SuperVariable2();
		obj.show();
	}

}
