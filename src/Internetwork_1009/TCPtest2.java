package Internetwork_1009;

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
 * @ClassName : Internetwork_1009.TCPtest.java
 * @createTime : 2021/10/12 12:28
 * @Description : TCP网络编程练习
 * 例题2:客户端发送文件给服务端，服务端将文件保存在本地。
 */
class TCPtest2 {

    @org.junit.jupiter.api.Test
    public void client() throws IOException {
        InetAddress inetAddress =InetAddress.getByName("127.0.0.1");
        Socket socket=new Socket(inetAddress,899);
        //获取输出流
        OutputStream os = socket.getOutputStream();
        FileInputStream fis = new FileInputStream("test.txt");
        byte[] bytes=new byte[1024];
        int len;
        while((len=fis.read(bytes))!=-1){
            os.write(bytes,0,len);
        }
        fis.close();
        os.close();
        socket.close();
    }

    @org.junit.jupiter.api.Test
    public void server() throws IOException {
        ServerSocket ss = new ServerSocket(899);
        Socket socket=ss.accept();
        InputStream is = socket.getInputStream();
        FileOutputStream fos = new FileOutputStream("F:\\money\\test.txt",true);
        byte[] bytes = new byte[10];
        int len;
        while((len=is.read(bytes))!=-1){
            fos.write(bytes,0,len);
        }
        ss.close();
        is.close();
        fos.close();
        socket.close();
    }
}