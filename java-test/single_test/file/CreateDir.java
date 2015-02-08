import java.io.File;

public class CreateDir {
   public static void main(String args[]) {
      String dirname = "fucking";
      File d = new File(dirname);
      // 现在创建目录
      d.mkdirs();
	  if(d.isDirectory()){
		System.out.println(d.getName());
	  }
  }
}