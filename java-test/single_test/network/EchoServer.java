import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class EchoServer {

    @SuppressWarnings("null")
    public static void main(String args[]){
        
        //���ȶ����ĸ�����
        ServerSocket serversocket = null; //���ڴ���TCP������
        Socket socket = null;             //���ڻ�������׽���
        BufferedReader in = null;   //���ڽ�������
        PrintWriter out = null;           //���ڷ�������
        //���������ж�ȡ�ͷ�����Ӧ���������ݶ���Ҫ�Լ���IO����
        
        try {
            
            serversocket = new ServerSocket(9998);   //ʵ���������׽���,�󶨶˿�9998
            
            while(true){        
                //��ӡ������Ϣ
                //���ｫ���ӡIP��ַ�Ͷ˿���ص���Ϣ
                System.out.println("The Server is start:" +serversocket);
                
                //�ȴ��ͻ�������,���ӳɹ�֮��,����һ��socket���͵ı���,���е����ݴ��䶼�Ǻ�socket����.    

                socket = serversocket.accept();
                
                //��ӡ�ͻ��˵������Ϣ
                System.out.println("Accept the Client:" + socket);
                
                //ʵ����BufferedReader �������ڽ��տͻ��˷���������Ϣ
                //InputStreamReader�������ǽ��ֽ���ת����Ϊ�ַ���
                //�������еõ������ݽ�������inBuffer��������
                in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
                
                //�õ������
                out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(socket.getOutputStream())),true);
                
                //ͨ������Ĺ���,�Ҷ�����Ķ�д������׼������
                while(true){
                    String instr  = in.readLine(); //���ж�ȡ����
    
                    if(instr == null){
                        break; //���ͻ��˹ر�ʱ����ѭ��
                    }
    
                    System.out.println("In server received the info:" + instr);//��ӡ��õ�����
                    out.println(instr);//���������еõ������ݻ�д
                }
            
            }
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        
        try {
            socket.close();
            serversocket.close();
            in.close();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        out.close();
        System.out.println("Server is exit");
    }
}