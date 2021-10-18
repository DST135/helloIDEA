package IO_work801.FileInputStream;

import java.io.FileInputStream;
import java.io.IOException;

/**
 * Created with IntelliJ IDEA.
 *
 * @author : 铁铁
 * @Project : helloIDEA
 * @Package : IO_work801.FileInputStream
 * @ClassName : FINtest2.java
 * @createTime : 2021/8/3 16:57
 * @Description :字节流读数据（一次读一个字节数组数据）
 * 需求：把文件copy.txt中的内容读取出来在控制台输出
 */
public class FINtest2 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis=new FileInputStream("copy.txt");
        /// int read（ byte b）：从该输入流读取最多b. Length个字节的数据到一个字节数组
        //如果由于文件末尾已到达而没有更多数据， -1
        byte[] b=new byte[1024];//一般是1024及其整数倍
       /* int len=fis.read(b);//len是read()读取的实际长度，不是数组长度

        System.out.println(new String(b));//String(byte[] bytes) 通过使用平台的默认字符集解码指定的字节数组构造新的 String
        System.out.println(len);*/
        //循环
        int len;
        while ((len=fis.read(b))!=-1){
            System.out.print(new String(b,0,len));
        }
        fis.close();


    }
}
