package colin.test;



public class My_test {
    
	public static void main(String []args) {    
    
    	Test myTest = new Test(); 
    	TestArray myTestArray = new TestArray();
    	TestString myTestString = new TestString();
    	TestDate myTestDate = new TestDate();
    	
    	//myTest.testDateType();
    	myTest.printVersion();
    	myTest.printEnumTest();
    
    	myTestArray.testPrintEmptyArray();
    	myTestArray.testPrintSortArray();
    	
    	myTestString.printStringHelloWord();
    	
//    	int a =1;
//    	Integer b = 2;
//    	b.

    }
}