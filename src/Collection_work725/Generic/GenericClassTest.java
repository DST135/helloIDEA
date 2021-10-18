package Collection_work725.Generic;

public class GenericClassTest {
    public static void main(String[] args){
        //StudentTest s1=new StudentTest();
        //StudentTest s2=new StudentTest();

        GenericClass<String> ff1=new GenericClass<String>();
        ff1.setT("dalao");
        System.out.println(ff1.getT());

        GenericClass<Integer> ff2=new GenericClass<Integer>();
        ff2.setT(18);
        System.out.println(ff2.getT());
    }
    
}
