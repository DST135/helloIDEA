package Internetwork_1009;

import org.junit.Test;

import java.io.*;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Created with IntelliJ IDEA.
 *
 * @author : 铁铁
 * @Project : helloIDEA
 * @Package : Internetwork_1009
 * @ClassName : TCPtest3.java
 * @createTime : 2021/10/13 15:57
 * @Description :TCP网络编程练习
 * 从客户端发送文件给服务端，服务端保存到本地。并返回“发送成功”给客户端。并关闭相应的连接。
 * 补充：
 * （1）读常规文件是不会阻塞的，不管读多少字节，read一定会在有限的时间内返回。
 * 从终端设备或网络读则不一定，如果从终端输入的数据没有换行符，调用read读终端设备就会阻塞，
 * 如果网络上没有接收到数据包，调用read从网络读就会阻塞，至于会阻塞多长时间也是不确定的，
 * 如果一直没有数据到达就一直阻塞在那里。同样，写常规文件是不会阻塞的，而向终端设备或网络写则不一定。
 * （2）现在明确一下阻塞（Block）这个概念。
 * 当进程调用一个阻塞的系统函数时，该进程被置于睡眠（Sleep）状态，这时内核调度其它进程运行，
 * 直到该进程等待的事件发生了（比如网络上接收到数据包，或者调用sleep指定的睡眠时间到了）它才有可能继续运行。
 */
public class TCPtest3 {
    @Test
    public void client() throws IOException {
        Socket socket = new Socket(InetAddress.getByName("127.0.0.1"),9090);
        OutputStream os = socket.getOutputStream();
        FileInputStream fis = new FileInputStream("test.txt");
        byte[] butter = new byte[10];
        int len;
        while((len=fis.read(butter))!=-1){
            os.write(butter,0,len);
        }

        //关闭socket输出,客户端没有明确指示发送数据终止，服务端调用read函数发生阻塞
        socket.shutdownOutput();

        //接受来自服务端的反馈,并在控制台输出
        InputStream is1 = socket.getInputStream();
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        byte[] bytes = new byte[10];
        int len1;
        while ((len1=is1.read(bytes))!=-1){
            baos.write(bytes,0,len1);
        }
        System.out.println(baos.toString());

        socket.close();
        os.close();
        fis.close();
        is1.close();
        baos.close();

    }

    @Test
    public void server() {
        ServerSocket ss = null;
        Socket socket = null;
        InputStream is = null;
        FileOutputStream fos = null;
        OutputStream os = null;
        try {
            ss = new ServerSocket(9090);
            socket = ss.accept();
            is = socket.getInputStream();
            fos = new FileOutputStream("text899.txt");
            byte[] butter = new byte[10];
            int len;
            while((len=is.read(butter))!=-1){
                fos.write(butter,0,len);
            }

            //证明下面语句执行
            System.out.println("图片传输完成");

            //反馈
            os = socket.getOutputStream();
            os.write("收到！".getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if(ss!=null){
                    ss.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                if(socket!=null){
                    socket.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                if(is!=null){
                    is.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                if(os!=null){
                    os.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                if(fos!=null){
                    fos.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }






    }


}
