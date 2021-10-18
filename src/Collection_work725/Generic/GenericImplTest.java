package Collection_work725.Generic;


public class GenericImplTest{
    public static void main(String[] args){
        GenericImplClass<String> g1=new GenericImplClass<String>();
        g1.show("dadadjk");

        GenericImplClass<Double> g2=new GenericImplClass<Double>();
        g2.show(3.14159);
    }
}
