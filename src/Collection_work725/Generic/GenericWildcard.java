package Collection_work725.Generic;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

//类型通配符
public class GenericWildcard {
    public static void main(String[] args){
        //类型通配符：<？>
        List<?> s1=new ArrayList<Object>();
        List<?> s2=new ArrayList<Number>();
        List<?> s3=new ArrayList<Integer>();
        Set<?> s4=new HashSet<>();

        //类型通配符上限：<？ extends 类型>
        List<?extends Number> l1=new ArrayList<Integer>();
        List<?extends Number> l2=new ArrayList<Number>();

        //类型通配符下限：<？ super 类型>
        List<?super Number> m1=new ArrayList<Number>();
        List<?super Number> m2=new ArrayList<Object>();
    }
}
