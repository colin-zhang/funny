import java.io.*;
public class FileRead{
   public static void main(String args[])throws IOException{
      File file = new File("Hello1.txt");
      // �����ļ�
      //file.createNewFile();
      // creates a FileWriter Object
      FileWriter writer = new FileWriter(file); 
      // ���ļ�д������
      writer.write("Hello world!\n e"); 
      writer.flush();
      writer.close();
      //���� FileReader ����
      FileReader fr = new FileReader(file); 
      char [] a = new char[50];
      fr.read(a); // �������ж�ȡ����
      for(char c : a)
          System.out.print(c); // һ������ӡ�ַ�
      fr.close();
   }
}