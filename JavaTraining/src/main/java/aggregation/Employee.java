package aggregation;

public class Employee {
	 	String book; 
	 	College agg; // reference object of College class
	 	 
	 	Employee(String book,College agg) 
	 	{ 
	 		this.book=book; 
	 		this.agg=agg; 
	 	} 
	 	public void display() {
	 		System.out.println(book);
	 		System.out.println(agg.age);// call the variable in first class age using the reference variable agg
	 		System.out.println(agg.name);//call the variable in first class name using the reference variable agg
	 	}
	  
	 	public static void main(String[] args)  
	 	{ 
	 		College obj1=new College("anu",10); 
	 		Employee obj=new Employee("novel",obj1);
	 		obj.display();
	 		 
	 	}


}
