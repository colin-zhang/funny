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
        
        //首先定义四个变量
        ServerSocket serversocket = null; //用于创建TCP服务器
        Socket socket = null;             //用于获得连接套接字
        BufferedReader in = null;   //用于接收数据
        PrintWriter out = null;           //用于发送数据
        //在网络编程中读取和发送相应的网络数据都需要自己的IO变量
        
        try {
            
            serversocket = new ServerSocket(9998);   //实例化监听套接字,绑定端口9998
            
            while(true){        
                //打印帮助消息
                //这里将会打印IP地址和端口相关的信息
                System.out.println("The Server is start:" +serversocket);
                
                //等待客户端连接,连接成功之后,返回一个socket类型的变量,所有的数据传输都是和socket进行.    

                socket = serversocket.accept();
                
                //打印客户端的相关消息
                System.out.println("Accept the Client:" + socket);
                
                //实例化BufferedReader 对象用于接收客户端发送来的消息
                //InputStreamReader的作用是将字节流转换成为字符流
                //从网络中得到的数据将会存放在inBuffer变量当中
                in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
                
                //得到输出流
                out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(socket.getOutputStream())),true);
                
                //通过上面的工作,我对网络的读写操作都准备好了
                while(true){
                    String instr  = in.readLine(); //按行读取数据
    
                    if(instr == null){
                        break; //当客户端关闭时跳出循环
                    }
    
                    System.out.println("In server received the info:" + instr);//打印获得的数据
                    out.println(instr);//将从网络中得到的数据回写
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