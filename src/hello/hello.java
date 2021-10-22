package hello;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 *
 * @author : 铁铁
 * @Project : helloIDEA
 * @Package : hello
 * @ClassName : helloT.java
 * @createTime : 2021/8/2 15:43
 * @Description :
 */
public class hello {
    public static void main(String[] args) {
        double cos;
        double[] X =new double[4];
        double[] Y =new double[4];
        Scanner sc = new Scanner(System.in);

        //输入原始X，Y数组
        System.out.println("输入X数组");
        for(int i=0;i<4;i++){
            X[i]=sc.nextDouble();
        }
        System.out.println("X数组输入完毕");
        System.out.println("输入Y数组");
        for(int i=0;i<4;i++){
            Y[i]=sc.nextDouble();
        }
        System.out.println("Y数组输入完毕");

        //减去均值，调整余弦相似度
        double averX=doubleArrAverage(X);
        double averY=doubleArrAverage(Y);
        doubleArrCheckout(X,averX);
        doubleArrCheckout(Y,averY);

        //计算余弦相似度
        double sum=0;
        double temp1=0;
        double temp2=0;
        for(int j=0;j<4;j++){
            sum += X[j]*Y[j];
            temp1+=X[j]*X[j];
            temp2+=Y[j]*Y[j];
        }
        //得出最后结果：
        cos=sum/(Math.sqrt(temp1)*Math.sqrt(temp2));
        System.out.println("余弦相似度为"+cos);
    }

    //得到均值
    public static double doubleArrAverage(double[] arr){
        double sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
        }
        return sum/arr.length;
    }

    //调整余弦相似度
    public static void doubleArrCheckout(double[] arr,double aver){
        for(int i=0;i<arr.length;i++){
            arr[i]=arr[i]-aver;
        }
    }
}
