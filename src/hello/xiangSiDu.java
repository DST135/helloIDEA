package hello;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 *
 * @author : 铁铁
 * @Project : helloIDEA
 * @Package : hello
 * @ClassName : xiangSiDu.java
 * @createTime : 2021/10/18 15:13
 * @Description :协同过滤算法练习
 */
public class xiangSiDu {
    public static void main(String[] args) {
        double l=0;
        Scanner sc = new Scanner(System.in);

        System.out.println("U数组大小：");
        int sizeU=sc.nextInt();
        System.out.println("\nV数组大小：");
        int sizeV=sc.nextInt();
        double[] U = new double[sizeU];
        double[] V = new double[sizeV];

        //输入U数组数据
        for(int i=0;i<U.length;i++){
            U[i]=sc.nextDouble();
        }
        //输入V数组数据
        for(int i=0;i<V.length;i++){
            V[i]=sc.nextDouble();
        }
        System.out.println("U,V数组输入完毕");

        double averU=doubleArrAverage(U);
        double averV=doubleArrAverage(V);

        double sum=0;
        double temp1=0;
        double temp2=0;
        for(int j=0;j<4;j++){
            sum+=(U[j]-averU)*(V[j]-averV);
            System.out.println("sum结果为："+sum);
            temp1+=(U[j]-averU)*(U[j]-averU);
            temp2+=(V[j]-averV)*(V[j]-averV);
        }
        l=sum/(Math.sqrt(temp1)*Math.sqrt(temp2));
        System.out.println("皮尔逊相似系数为"+l);

    }

    public static double doubleArrAverage(double[] arr){
        double sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
        }
        return sum/arr.length;
    }
}
