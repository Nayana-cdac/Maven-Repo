package interfaceExample;

public class MultipleInheritanceChildClass implements MultipleInheritance1, MultipleInheritance2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MultipleInheritanceChildClass obj = new MultipleInheritanceChildClass();
		obj.display();
		obj.display1();
	}

	@Override
	public void display1() {
		// TODO Auto-generated method stub
		System.out.println("Hi");
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("Hello");
	}

}
