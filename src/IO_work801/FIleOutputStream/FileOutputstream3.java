package IO_work801.FIleOutputStream;

import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

/**
 * Created with IntelliJ IDEA.
 *
 * @author : 铁铁
 * @Project : helloIDEA
 * @Package : IO_work801.FIleOutputStream
 * @ClassName : FileOutputstream3.java
 * @createTime : 2021/8/2 16:52
 * @Description :字节流写数据的两个小问题：
 * 1：字节流写数据如何实现换行呢？
     * 不同系统对换行符识别不同
     *  window:\r\n
     *  Linux：\n
     *  mac:\r
 * 2：字节流写数据如何实现追加写入呢？
 * public FiLeOutputStream（String name, boolean append）
 *创建文件输出流以指定的名称写入文件。如果第二个参数为true，则字节将写入文件的末尾而不是开头
 */
public class FileOutputstream3 {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos=new FileOutputStream("test.txt",true);
        for(int i=0;i<10;i++){
            fos.write("hello".getBytes(StandardCharsets.UTF_8));
            fos.write("\n".getBytes(StandardCharsets.UTF_8));
        }

        fos.close();
    }

}
