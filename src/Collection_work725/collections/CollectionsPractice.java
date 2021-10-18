package Collection_work725.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * 需求：ArrayList存储学生对象，使用 Collections对 ArrayList进行排序
 * 要求：按照年龄从小到大排序，年龄相同时，按照姓名的字母顺序排序
 */
public class CollectionsPractice {
    public static void main(String[] args){
        ArrayList<StudentTest> as=new ArrayList<>();
        StudentTest s1=new StudentTest(13,"aa");
        StudentTest s2=new StudentTest(13,"ab");
        StudentTest s3=new StudentTest(14,"bcd");
        StudentTest s4=new StudentTest(15,"bc");
        StudentTest s5=new StudentTest(14,"bc");

        as.add(s1);
        as.add(s2);
        as.add(s3);
        as.add(s4);
        as.add(s5);

        Collections.sort(as,new Comparator<StudentTest>() {
            @Override
            public int compare(StudentTest s1,StudentTest s2){
                return (s1.getAge()==s2.getAge())?(s1.getName().compareTo(s2.getName())):(s1.getAge()-s2.getAge());
            }
        });

        
        for(StudentTest s:as){
            System.out.println(s.getAge()+" "+s.getName());
        }

    }

}
