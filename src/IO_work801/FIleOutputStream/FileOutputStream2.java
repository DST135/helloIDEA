package IO_work801.FIleOutputStream;

//import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 构造方法Fileoutputstream(String name)：创建文件输出流以指定的名称写入文件
 * Fileoutputstream(File file)：创建文件输出流以写入由指定的FiLe对象表示的文件
 * 写数据的三种方式：
void write(int b)：将指定的字节写入此文件输出流
    一次写一个宇节数据
void write(byte[] b)：将b.Length字节从指定的字节数组写入此文件输出流
    一次写一个字节数组数据
void write(byte[])b, int off, int Len)：将Len宇节从指定的宇节数组开始，从偏移量off併开始写入此文件输岀流
    一次写一个字节数组的部分数据
 */
public class FileOutputStream2 {
    public static void main(String[] args) throws IOException{
        FileOutputStream fos=new FileOutputStream("test.txt");
        //底层实现
        //FileOutputStream fos1=new FileOutputStream(new File("test.txt"));

        //void write(byte[] b)
        byte[] bys={12,33,45,67,99};
        //byte[] getBytes()返回字符串对应的字节数组
        byte[] bys2="abahd".getBytes();
        fos.write(bys2);

        //void write(byte[])b, int off, int Len)
        fos.write(bys2, 1, 4);

        fos.close();
    }
}
