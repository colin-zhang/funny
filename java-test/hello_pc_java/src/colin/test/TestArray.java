package colin.test;

import java.util.Arrays;

public class TestArray {
	
	void printIntArray(int[] a){
		for(int aa:a){
			System.out.print(aa+" ");
		}		
		System.out.println();
	}
	
	void testPrintEmptyArray(){
		int[] aInt = new int[10];
		printIntArray(aInt);		
	}
	
	void testPrintSortArray(){
		int[] a = {9,3,45,2,12,54,4,4,11,5};
		
		Arrays.sort(a);
		
		this.printIntArray(a);
	}
	
	
}
