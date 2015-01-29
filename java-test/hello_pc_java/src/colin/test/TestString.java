package colin.test;


/*注意:String类是不可改变的，所以你一旦创建了String对象，那它的值就无法改变了。 
如果需要对字符串做很多修改，那么应该选择使用StringBuffer & StringBuilder 类。*/


public class TestString {
	//char[] hello = {"hello world"};
	static char[] hello = {'h','e','l','l','o',' ','w','o','r','l','d'};
	
	private String helloWorld = new String(hello);
	
	
	void printStringHelloWord(){
		System.out.println(helloWorld);
	}
 }
