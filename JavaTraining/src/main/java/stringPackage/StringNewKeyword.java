package stringPackage;

public class StringNewKeyword {

	 public void StringNew() 
	 	{ 
	 		String s=new String("hello"); 
	 		System.out.println(s); 
	 	}
	 
	 public void StringLength() 
	 	{ 
	 		String s="hai"; 
	 		System.out.println(s.length()); 
	 	}
	 
	 public void StringSubString() 
	 	{ 
	 		String s="helloworld"; 
	 		System.out.println(s.substring(2, 4));// include 2 exclude 4 (2 and 3rd position) 
	 	}
	 
	 public void StringContains() 
	 	{ 
	 		String s="java is a programming language"; 
	 		System.out.println(s.contains("java is")); //case sensitive
	 	}
	 public void StringIsEmpty() 
	 	{ 
	 		String s1=""; //no space - space is considered as a character
	 		String s="hai"; 
	 		System.out.println(s1.isEmpty()); 
	 		System.out.println(s.isEmpty()); 
	 		 
	 		 
	 	}
	 public void StringEquals() //case sensitive
	 	{ 
	 		String s="hai"; 
	 		String s1="Hai"; 
	 		System.out.println(s.equals(s1)); 
	 	}
	 public void StringEqualsIgnoreCase() 
	 	{ 
	 		String s="hai"; 
	 		String s1="Hai"; 
	 		System.out.println(s.equalsIgnoreCase(s)); //case insensitive - only checks content of the string
	 	}
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringNewKeyword obj = new StringNewKeyword();
	     //  obj.StringNew();
	     //  obj.StringLength();
	     //  obj.StringSubString();
	     //  obj.StringContains();
	     //  obj.StringIsEmpty();
	     //  obj.StringEquals();
	     //  obj.StringEqualsIgnoreCase();
	}

}
