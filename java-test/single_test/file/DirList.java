/*
1	public String getName()
�����ɴ˳���·������ʾ���ļ���Ŀ¼�����ơ�
2	public String getParent()
 ���ش˳���·�����ĸ�·������·�����ַ����������·����û��ָ����Ŀ¼���򷵻� null��
3	public File getParentFile()
���ش˳���·�����ĸ�·�����ĳ���·�����������·����û��ָ����Ŀ¼���򷵻� null��
4	public String getPath()
���˳���·����ת��Ϊһ��·�����ַ�����
5	public boolean isAbsolute()
���Դ˳���·�����Ƿ�Ϊ����·������
6	public String getAbsolutePath()
���س���·�����ľ���·�����ַ�����
7	public boolean canRead()
����Ӧ�ó����Ƿ���Զ�ȡ�˳���·������ʾ���ļ���
8	public boolean canWrite()
����Ӧ�ó����Ƿ�����޸Ĵ˳���·������ʾ���ļ���
9	public boolean exists()
���Դ˳���·������ʾ���ļ���Ŀ¼�Ƿ���ڡ�
10	public boolean isDirectory()
���Դ˳���·������ʾ���ļ��Ƿ���һ��Ŀ¼��
11	public boolean isFile()
���Դ˳���·������ʾ���ļ��Ƿ���һ����׼�ļ���
12	public long lastModified()
���ش˳���·������ʾ���ļ����һ�α��޸ĵ�ʱ�䡣
13	public long length()
�����ɴ˳���·������ʾ���ļ��ĳ��ȡ�
14	public boolean createNewFile() throws IOException
���ҽ��������ھ��д˳���·����ָ�������Ƶ��ļ�ʱ��ԭ�ӵش����ɴ˳���·����ָ����һ���µĿ��ļ���
15	public boolean delete()
 ɾ���˳���·������ʾ���ļ���Ŀ¼��
16	public void deleteOnExit()
���������ֹʱ������ɾ���˳���·������ʾ���ļ���Ŀ¼��
17	public String[] list()
�����ɴ˳���·��������ʾ��Ŀ¼�е��ļ���Ŀ¼������������ַ������顣
18	public String[] list(FilenameFilter filter)
�����ɰ�����Ŀ¼�е��ļ���Ŀ¼����������ɵ��ַ������飬��һĿ¼��ͨ������ָ���������ĳ���·��������ʾ�ġ�
19	public File[] listFiles()
  ����һ������·�������飬��Щ·������ʾ�˳���·��������ʾĿ¼�е��ļ���
20	public File[] listFiles(FileFilter filter)
���ر�ʾ�˳���·��������ʾĿ¼�е��ļ���Ŀ¼�ĳ���·�������飬��Щ·���������ض���������
21	public boolean mkdir()
�����˳���·����ָ����Ŀ¼��
22	public boolean mkdirs()
�����˳���·����ָ����Ŀ¼�������������赫�����ڵĸ�Ŀ¼��
23	public boolean renameTo(File dest)
 ���������˳���·������ʾ���ļ���
24	public boolean setLastModified(long time)
�����ɴ˳���·������ָ�����ļ���Ŀ¼�����һ���޸�ʱ�䡣
25	public boolean setReadOnly()
��Ǵ˳���·����ָ�����ļ���Ŀ¼���Ա�ֻ�ɶ�����ж�������
26	public static File createTempFile(String prefix, String suffix, File directory) throws IOException
��ָ��Ŀ¼�д���һ���µĿ��ļ���ʹ�ø�����ǰ׺�ͺ�׺�ַ������������ơ�
27	public static File createTempFile(String prefix, String suffix) throws IOException
��Ĭ����ʱ�ļ�Ŀ¼�д���һ�����ļ���ʹ�ø���ǰ׺�ͺ�׺���������ơ�
28	public int compareTo(File pathname)
����ĸ˳��Ƚ���������·������
29	public int compareTo(Object o)
����ĸ˳��Ƚϳ���·�������������
30	public boolean equals(Object obj)
���Դ˳���·��������������Ƿ���ȡ�
31	public String toString()
 ���ش˳���·������·�����ַ�����


*/


import java.io.File;
public class DirList {
   public static void main(String args[]) {
      String dirname = "./";
      File f1 = new File(dirname);
	  System.out.println(f1.getParent());
      if (f1.isDirectory()) {
         System.out.println( "Directory of " + dirname);
         String s[] = f1.list();
         for (int i=0; i < s.length; i++) {
            File f = new File(dirname + "/" + s[i]);
            if (f.isDirectory()) {
               System.out.println(s[i] + " is a directory");
            } else {
               System.out.println(s[i] + " is a file"+"length is "+f.length());
            }
         }
      } else {
         System.out.println(dirname + " is not a directory");
    }
  }
}