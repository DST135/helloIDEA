package IO_work801.FileInputStream;

import java.io.*;

/**
 * Created with IntelliJ IDEA.
 *
 * @author : 铁铁
 * @Project : helloIDEA
 * @Package : IO_work801.FileInputStream
 * @ClassName : BufferedF.java
 * @createTime : 2021/8/5 17:05
 * @Description :字节缓冲流测试
 */
public class BufferedF {
    public static void main(String[] args) throws IOException {
        BufferedOutputStream bo=new BufferedOutputStream(new FileOutputStream("copy.txt"));
        bo.write("我傻了".getBytes());
        bo.close();

        byte[] b=new byte[1024];
        int len;
        BufferedInputStream bi=new BufferedInputStream(new FileInputStream("C:\\Users\\chen9\\Desktop\\黑马.txt"));
        while((len=bi.read(b))!=-1){
            System.out.println(new String(b,0,len));
        }
        bi.close();
    }
}
