/*
����Ҫ�������е��ø���ı���д����ʱ��Ҫʹ��super�ؼ��֡�

��д������֮�������
�����     ���ط���  ��д����
�����б�   �����޸�  һ�������޸�
��������   �����޸�  һ�������޸�
�쳣       �����޸�  ���Լ��ٻ�ɾ����һ�������׳��µĻ��߸�����쳣
����       �����޸�  һ�����������ϸ�����ƣ����Խ������ƣ�
*/

class Animal{

   public void move(){
      System.out.println("��������ƶ�");
   }
}

class Dog extends Animal{

   public void move(){
      super.move();
      System.out.println("�������ܺ���");
   }
   public void bark(){
      System.out.println("�����Էͽ�");
   }
}

public class TestDog{

   public static void main(String args[]){
      Animal a = new Animal(); // Animal ����
      Dog b = new Dog(); // Dog ����

      a.move();// ִ�� Animal ��ķ���
      b.move();//ִ�� Dog ��ķ���
      b.bark();
   }
}