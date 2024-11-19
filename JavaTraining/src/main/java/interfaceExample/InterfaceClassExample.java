package interfaceExample;

public class InterfaceClassExample implements InterfaceExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InterfaceClassExample obj = new InterfaceClassExample();
		obj.display();
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("Hello");
	}

}
