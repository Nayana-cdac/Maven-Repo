package excelRead;

import java.io.IOException;

public class ExcelMain {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.out.println(ExcelCode.getStringdata(0, 0));
		System.out.println(ExcelCode.getStringdata(0, 1)); 
	    System.out.println(ExcelCode.getIntegerdata(1, 0));
	    System.out.println(ExcelCode.getStringdata(1, 1));
	    System.out.println(ExcelCode.getIntegerdata(2, 0));
	    System.out.println(ExcelCode.getStringdata(2, 1));
	}

}
