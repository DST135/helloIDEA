package Collection_work725.Generic;

//可变参数
public class VArgs {
    public static void main(String[] args){
        System.out.println(sum(12,31,44,55));
    }
    public static int sum(int b,int...a){ //第一个值赋给b,其他封装进数组a,如果一个方法有多个参数，包含可变参数，可变参数要放在最后
        //System.out.println(a); //[I@73a28541  说明a是一个数组，可变参数是把参数封装进一个数组
        int num=0;
        for(int i:a){
            num=num+i;
        }
        return num;
    }
}
