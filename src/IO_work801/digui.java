package IO_work801;

import java.io.File;

//递归：确定出口和规则
//遍历目录
//需求：给定一个路径(E:\joice\Java\core code)，请通过递归完成遍历该目录下的所有内容，并把所有文件的绝对路径输出在控制台
public class digui {
    public static void main(String[] args){
        System.out.println(jiecheng(6));
        gan("E:/joice/Java/core code");
    }

    public static int jiecheng(int n){
        if(n<=2) return n;
        else return n*jiecheng(n-1);
        
    }

    public static void gan(String s){
        File f=new File(s);
        File[] F=f.listFiles();
        if(F!=null){//加上if判断增强程序健壮性，如果不加，字符串为空时会导致程序抛出异常
            for(File fi:F){
                if(fi.isFile()){
                    System.out.println(fi.getAbsolutePath());
                }
                else{
                    gan(fi.getPath());
                }
            }
        }
    }
    
}
