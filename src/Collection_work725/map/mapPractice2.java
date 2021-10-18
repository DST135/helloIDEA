package Collection_work725.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class mapPractice2 {
    public static void main(String[] args){
        StudentTest s1=new StudentTest(12,"da");
        StudentTest s2=new StudentTest(15,"d33");
        StudentTest s3=new StudentTest(11,"d44");
        StudentTest s4=new StudentTest(11,"d44");
        Map<StudentTest,String> ms=new HashMap<>();
        ms.put(s1,"U01");
        ms.put(s2,"U02");
        ms.put(s3,"U03");
        ms.put(s4,"U04");

        Set<StudentTest> se=ms.keySet();
        for(StudentTest i:se){
            System.out.println("key:"+i.getAge()+i.getName()+" "+"value:"+ms.get(i));
        }
    }
}
