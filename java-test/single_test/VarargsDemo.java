/*
�ɱ����

JDK 1.5 ��ʼ��Java֧�ִ���ͬ���͵Ŀɱ������һ�������� 

�����Ŀɱ����������������ʾ��
typeName... parameterName


�ڷ��������У���ָ���������ͺ��һ��ʡ�Ժ�(...) �� 

һ��������ֻ��ָ��һ���ɱ�������������Ƿ��������һ���������κ���ͨ�Ĳ�����������֮ǰ����

*/

public class VarargsDemo {

   public static void main(String args[]) {
      // ���ÿɱ�����ķ���
	  printMax(34, 3, 3, 2, 56.5);
      printMax(new double[]{1, 2, 3});
   }

   public static void printMax( double... numbers) {
   if (numbers.length == 0) {
      System.out.println("No argument passed");
      return;
   }

   double result = numbers[0];

   for (int i = 1; i <  numbers.length; i++)
      if (numbers[i] >  result)
      result = numbers[i];
      System.out.println("The max value is " + result);
   }
}
