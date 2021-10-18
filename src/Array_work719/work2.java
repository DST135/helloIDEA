package Array_work719;

import java.util.Random;

public class work2 {
    public static void main(String[] args){
        test();
    }
    public static void test(){
        int[] a=new int[100];
        Random r=new Random();
        for(int i=0;i<a.length;i++){
            a[i]=r.nextInt(9)+1;
            System.out.println(a[i]);
        }
        int count=0;
        for(int i=0;i<a.length;i++){
            if(a[i]==8){
                count++;
            }
        }
        System.out.println(count);
    }
}
