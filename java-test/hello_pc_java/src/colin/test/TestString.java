package colin.test;


/*ע��:String���ǲ��ɸı�ģ�������һ��������String����������ֵ���޷��ı��ˡ� 
�����Ҫ���ַ������ܶ��޸ģ���ôӦ��ѡ��ʹ��StringBuffer & StringBuilder �ࡣ*/


public class TestString {
	//char[] hello = {"hello world"};
	static char[] hello = {'h','e','l','l','o',' ','w','o','r','l','d'};
	
	private String helloWorld = new String(hello);
	
	
	void printStringHelloWord(){
		System.out.println(helloWorld);
	}
 }
