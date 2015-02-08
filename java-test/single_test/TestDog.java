/*
当需要在子类中调用父类的被重写方法时，要使用super关键字。

重写与重载之间的区别
区别点     重载方法  重写方法
参数列表   必须修改  一定不能修改
返回类型   可以修改  一定不能修改
异常       可以修改  可以减少或删除，一定不能抛出新的或者更广的异常
访问       可以修改  一定不能做更严格的限制（可以降低限制）
*/

class Animal{

   public void move(){
      System.out.println("动物可以移动");
   }
}

class Dog extends Animal{

   public void move(){
      super.move();
      System.out.println("狗可以跑和走");
   }
   public void bark(){
      System.out.println("狗可以吠叫");
   }
}

public class TestDog{

   public static void main(String args[]){
      Animal a = new Animal(); // Animal 对象
      Dog b = new Dog(); // Dog 对象

      a.move();// 执行 Animal 类的方法
      b.move();//执行 Dog 类的方法
      b.bark();
   }
}