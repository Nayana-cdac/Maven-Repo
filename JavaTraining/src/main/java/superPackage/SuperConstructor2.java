package superPackage;

public class SuperConstructor2 extends SuperConstructor1 {
	public SuperConstructor2() {
	// TODO Auto-generated constructor stub
		super();// no need to give super, default prints the value in super constructor 1
		System.out.println("Super Constructor 2");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SuperConstructor2 obj = new SuperConstructor2();
		
	}

}
