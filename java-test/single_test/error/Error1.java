/*
Java �����쳣��
Java ���Զ�����һЩ�쳣����java.lang��׼���С�

��׼����ʱ�쳣���������������쳣�ࡣ����java.lang����Ĭ�ϼ��ص����е�Java����ģ����Դ󲿷ִ�����ʱ�쳣��̳ж������쳣������ֱ��ʹ�á�

Java���ݸ������Ҳ������һЩ�������쳣������ı����г���Java�ķǼ�����쳣��

�쳣	����
ArithmeticException	 �������쳣����������ʱ���׳����쳣�����磬һ������"������"ʱ���׳������һ��ʵ����
ArrayIndexOutOfBoundsException	 �÷Ƿ�������������ʱ�׳����쳣���������Ϊ������ڵ��������С���������Ϊ�Ƿ�������
ArrayStoreException	 ��ͼ���������͵Ķ���洢��һ����������ʱ�׳����쳣��
ClassCastException	 ����ͼ������ǿ��ת��Ϊ����ʵ��������ʱ���׳����쳣��
IllegalArgumentException	 �׳����쳣�����򷽷�������һ�����Ϸ�����ȷ�Ĳ�����
IllegalMonitorStateException	 �׳����쳣����ĳһ�߳��Ѿ���ͼ�ȴ�����ļ�������������ͼ֪ͨ�������ڵȴ�����ļ�����������û��ָ�����������̡߳�
IllegalStateException	 �ڷǷ����ʵ���ʱ����÷���ʱ�������źš����仰˵���� Java ������ Java Ӧ�ó���û�д������������Ҫ����ʵ�״̬�¡�
IllegalThreadStateException	 �߳�û�д������������Ҫ����ʵ�״̬ʱ�׳����쳣��
IndexOutOfBoundsException	 ָʾĳ������������������顢�ַ��������������򣩳�����Χʱ�׳���
NegativeArraySizeException	 ���Ӧ�ó�����ͼ������СΪ�������飬���׳����쳣��
NullPointerException	 ��Ӧ�ó�����ͼ����Ҫ����ĵط�ʹ�� null ʱ���׳����쳣
NumberFormatException	 ��Ӧ�ó�����ͼ���ַ���ת����һ����ֵ���ͣ������ַ�������ת��Ϊ�ʵ���ʽʱ���׳����쳣��
SecurityException	 �ɰ�ȫ�������׳����쳣��ָʾ���ڰ�ȫ�ַ���
StringIndexOutOfBoundsException	 ���쳣�� String �����׳���ָʾ��������Ϊ�������߳����ַ����Ĵ�С��
UnsupportedOperationException	 ����֧������Ĳ���ʱ���׳����쳣��
����ı����г���Java������java.lang���еļ�����쳣�ࡣ

�쳣	����
ClassNotFoundException	 Ӧ�ó�����ͼ������ʱ���Ҳ�����Ӧ���࣬�׳����쳣��
CloneNotSupportedException	 ������ Object ���е� clone ������¡���󣬵��ö�������޷�ʵ�� Cloneable �ӿ�ʱ���׳����쳣��
IllegalAccessException	 �ܾ�����һ�����ʱ���׳����쳣��
InstantiationException	 ����ͼʹ�� Class ���е� newInstance ��������һ�����ʵ������ָ�����������Ϊ��һ���ӿڻ���һ����������޷�ʵ����ʱ���׳����쳣��
InterruptedException	 һ���̱߳���һ���߳��жϣ��׳����쳣��
NoSuchFieldException	 ����ı���������
NoSuchMethodException	 ����ķ���������

*/
																		
	
import java.lang.Error;
class Error1{
	public static void main(String[] args){
		try
		{
		   // �������
		   System.out.println(1/0);
		}catch(ArithmeticException e1){
		   //Catch ��
		   System.out.println("colin"+ " " + e1);
		}
	}
}