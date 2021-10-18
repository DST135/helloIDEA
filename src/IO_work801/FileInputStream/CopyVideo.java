package IO_work801.FileInputStream;

import java.io.*;

/**
 * Created with IntelliJ IDEA.
 *
 * @author : 铁铁
 * @Project : helloIDEA
 * @Package : IO_work801.FileInputStream
 * @ClassName : CopyVideo.java
 * @createTime : 2021/8/5 17:32
 * @Description :复制视频
 * 思路：
 * 1：根据数据源创建字节输入流对象
 * 2：根据目的地创建字节输出流对象
 * 3：读写数据，复制图片（一次读取一个字节数组，一次写入一个字节数组）
 * 4：释放资源
 * 四种方式实现复制视频，并记录每种方式复制视频的时间
 * 1：基本字节流一次读写个字节
 * 2：基本字节流一次读写一个字节数组
 * 3：字节缓冲流一次读写一个字节
 * 4：字节缓冲流一次读写一个字节数组
 */
public class CopyVideo {
    public static void main(String[] args) throws IOException {
        long startTime=System.currentTimeMillis();

        //复制图片
        BufferedInputStream bi=new BufferedInputStream(new FileInputStream("F:\\小组作业素材\\MVI_9816.MOV"));
        BufferedOutputStream bo=new BufferedOutputStream(new FileOutputStream("CopyVideo.MOV"));
        byte[] b=new byte[1024];
        int len;
        while((len=bi.read(b))!=-1){
            bo.write(b);
        }

        bi.close();
        bo.close();
    }
}
