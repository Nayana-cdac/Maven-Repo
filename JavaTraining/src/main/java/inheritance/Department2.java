package inheritance;

public class Department2 extends College {
	 public void subject() 
	 	{ 
	 	 
	 	System.out.println("datastructure"); 
	 	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Department2 obj = new Department2();
		obj.student();// method of  college
		obj.subject();// method of Department2
		Department1 obj2 = new Department1();
		obj2.student();// method of  college
		obj2.branch();// method of Department1
	}

}
