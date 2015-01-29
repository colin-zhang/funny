package colin.test;

import java.util.Date;
import colin.math.Basic_math;



class TestMath extends Basic_math{
//	public int add(int a,int b){
//		return 0;
//	}
	public int add(int a){
		return 10000;
	}
}

public class My_test {
    
	public static void main(String []args) {
    	TestMath m = new TestMath();
    	
    	Date d = new Date();
    	
    	Test myTest = new Test();
    	
    	
    	//myTest.testDateType();
    	myTest.testPrintVersion();
    	myTest.testPrintEnumTest();
    	
    	int a=1;
    	int b=2;
    	int c = m.add(a, b);
    	
    	System.out.println(m.add(a));
    	
   
    	
        if(d instanceof Date){
        	System.out.println("d is Date type");
        }

    	System.out.println("Hello World");
    	System.out.println(c);
    	
    	System.out.println(d.toString());
    	

    }
}