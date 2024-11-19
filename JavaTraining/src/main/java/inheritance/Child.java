package inheritance;

public class Child extends Parent {
	 public void run() 
	 	{ 
	 	 
	 	System.out.println("running"); 
	 	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child obj = new Child();
		obj.display();
		obj.show();
		obj.run();
	}

}
