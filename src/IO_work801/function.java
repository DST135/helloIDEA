package IO_work801;

import java.io.File;

/**
 *构造方法
Fite（ String pathname）：通过将给定的路径名字符串转换为抽象路径名来创建新的FiLe实例。
FiLe（ String parent, String child）：从父路径名字符串和子路径名宇符串创建新的Fie实例
FiLe（ FiLe parent, String child）：从父抽象路径名和子路径名字符串创建新的FiLe实例。
 */
public class function {
    public static void main(String[] args){
        //Fite（ String pathname） 文件可以不存在，封装的只是路径转化成的字符串
        File f1=new File("E:/joice/Java/fileTest/test.txt");
        System.out.println(f1);//输出：E:\joice\Java\fileTest\test.txt说明file类重写了toString方法）

        //FiLe（ String parent, String child）
        File f2=new File("E:/joice/Java/fileTest", "test.txt");
        System.out.println(f2);//同上

        //FiLe（ FiLe parent, String child）
        File f3=new File("E:/joice/Java/fileTest");
        File f4=new File(f3,"test.txt");
        System.out.println(f4);//同上
    }
}
