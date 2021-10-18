package work718;

//import java.text.DecimalFormat;

public class concatCON {
    public static void main(String[] args) {
        //int numbers[]=new int[10];
        //DecimalFormat de=new DecimalFormat("#.00");
        //System.out.println(de.format(3.1415926535));
        /*
        String s1="铁海燕";
        String s2="最美";
        String s3=s2.replace("美","丑");
        System.out.println(s1.concat("(一个大聪明)").concat(s2));
        System.out.println(s2.charAt(1));
        System.out.println(s3);
        */
        stringB();
    }

    static void stringB(){
        String result="0";
        long startTime=System.currentTimeMillis();//1970.1.1 0时
        for(int i=1;i<10000;i++){
            result=result+i;
        }
        long endTime=System.currentTimeMillis();
        System.out.println("用了"+(endTime-startTime));

        //StringBuffer是线程安全的，会防止多个线程同时访问String
        StringBuffer sb=new StringBuffer("0");
        startTime=System.currentTimeMillis();//1970.1.1 0时
        for(int i=1;i<10000;i++){
            sb.append(i);
        }
        endTime=System.currentTimeMillis();
        System.out.println("ta用了"+(endTime-startTime));

        //StringBuilder不是线程安全的
        StringBuilder sbuiler=new StringBuilder("0");
        startTime=System.currentTimeMillis();//1970.1.1 0时
        for(int i=1;i<10000;i++){
            sbuiler.append(i);
        }
        endTime=System.currentTimeMillis();
        System.out.println("ta用了"+(endTime-startTime));
    }
}

