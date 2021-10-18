package Internetwork_1009;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Created with IntelliJ IDEA.
 *
 * @author : 铁铁
 * @Project : helloIDEA
 * @Package : Internetwork_1009
 * @ClassName : TCPtest.java
 * @createTime : 2021/10/10 21:12
 * @Description :TCP网络编程练习
 * 例子1：客户端发送信息给服务端，服务端将数据显示在控制台
 */
public class TCPtest {

    @Test
    public void client() {
        Socket so = null;
        OutputStream os= null;
        try {
            InetAddress Inet=InetAddress.getByName("127.0.0.1");
            so = new Socket(Inet,90);
            os = so.getOutputStream();
            os.write("hello world".getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if(os!=null){
                try {
                    os.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if(so!=null){
                try {
                    so.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    @Test
    public  void server() {
        InputStream is= null;
        ServerSocket ss=null;
        ByteArrayOutputStream baos=null;
        Socket socket=null;
        try {
            //1.创建服务器端的ServerSocket，指明自己的端口号
            ss = new ServerSocket(90);
            //2.调用accept（）表示接收来自于客户端的socket
            socket=ss.accept();
            //获取输入流
            is = socket.getInputStream();

            baos=new ByteArrayOutputStream();
            byte[] b=new byte[5];
            int len;
            while((len=is.read(b))!=-1){
                baos.write(b,0,len);  //将信息全部写入baos里再解码输出
            }
            System.out.println(baos.toString());
            System.out.println("收到来自"+socket.getInetAddress().getHostAddress()+"的数据");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if(ss!=null){
                try {
                    ss.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if(is!=null){
                try {
                    is.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if(baos!=null){
                try {
                    baos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if(socket!=null){
                try {
                    socket.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

        //可能会造成汉字乱码，不建议
//        byte[] b=new byte[5];
//        int len;
//        while((len=is.read(b))!=-1){
//            String s=new String(b,0,len);
//            System.out.print(s);
//        }


    }
}
