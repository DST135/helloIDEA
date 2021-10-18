package IO_work801.FileInputStream;

import java.io.FileInputStream;
import java.io.IOException;

/**
 * Created with IntelliJ IDEA.
 *
 * @author : 铁铁
 * @Project : helloIDEA
 * @Package : IO_work801.FileInputStream
 * @ClassName : FIINtest.java
 * @createTime : 2021/8/3 15:59
 * @Description :把文件 test. txt中的内容读取出来在控制台输出
 */
public class FINtest {
    public static void main(String[] args) throws IOException {
        FileInputStream fis=new FileInputStream("test.txt");
        //int read()：从输入流读取一个字节的数据
        //如果达到文件的末尾，返回-1
        /*System.out.println(fis.read());
        System.out.println((char)fis.read());*/

        //循环输出所有数据
/*        int i=fis.read();
        while(i!=-1){
            System.out.print(i);
            i=fis.read();
        };*/
        //优化
        int i;
        while((i=fis.read())!=-1){
            System.out.print((char)i);
        };
        fis.close();
    }

}
