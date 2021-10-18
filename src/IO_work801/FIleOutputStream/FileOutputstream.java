package IO_work801.FIleOutputStream;


import java.io.FileOutputStream;
import java.io.IOException;

//FileOutputStream(String name):创建文件输出流以写入具有指定名称的文件。 
public class FileOutputstream{
    public static void main(String[] args) throws IOException{
        FileOutputStream fos=new FileOutputStream("test.txt");
        /**
         * 做了三件事情：
            A：调用系统功能创建了文件
            B：创建了字节输出流对象
            C：让字节输出流对象指向创建好的文件
         */

        // void write（int b）：将指定的字节写入此文件输出流
        fos.write(97);//写入a

        //最后都要释放资源
        //void close（）：关闭此文件输岀流并释放与此流相关联的任何系统资源。
        fos.close();
    }
}