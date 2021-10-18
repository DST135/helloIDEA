package Collection_work725.Generic;

public class GenericFunctionTest {
    public static void main(String[] args){
        // GenericFunction<String> s1=new GenericFunction<>();
        // s1.show("heel");
        
        // GenericFunction<Integer> s2=new GenericFunction<>();
        // s2.show(18);

        // GenericFunction<Boolean> s3=new GenericFunction<>();
        // s3.show(true);

        GenericFunction g=new GenericFunction();
        g.show("heel");
        g.show(18);
        g.show(4.44);
        g.show(true);
    }
}

// class GenericFunction<T>{
//     public void show(T t){
//         System.out.println(t);
//     }
// }

class GenericFunction{
    public<T> void show(T t){
        System.out.println(t);
    }
}