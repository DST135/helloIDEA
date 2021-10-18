package IO_work801.FileWriter;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * Created with IntelliJ IDEA.
 *
 * @author : 铁铁
 * @Project : helloIDEA
 * @Package : IO_work801.FileWriter
 * @ClassName : cao.java
 * @createTime : 2021/10/1 9:36
 * @Description :字符写入流练习
 */
public class cao {
    public static void main(String[] args) throws IOException {
        RandomAccessFile raf1 = new RandomAccessFile("hello.txt","rw");

        raf1.seek(3);//将指针调到角标为3的位置
        //保存指针3后面的所数据到StringBuilder中
        StringBuilder builder = new StringBuilder((int) new File("hello.txt").length());
        byte[] buffer = new byte[20];
        int len;
        while((len = raf1.read(buffer)) != -1){
            builder.append(new String(buffer,0,len)) ;
        }
        //调回指针，写入“xyz”
        raf1.seek(3);
        raf1.write("xyz".getBytes());

        //将StringBuilder中的数据写入到文件中
        raf1.write(builder.toString().getBytes());

        raf1.close();
    }

}
