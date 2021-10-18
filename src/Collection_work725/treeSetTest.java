package Collection_work725;

import java.util.TreeSet;

/*
	• 元素有序，这里的顺序不是指存储和取出的顺序，而是按照一定的规则进行排序，
	具体排序方式取决于构造方法
		○ TreeSet（）:根据其元素的自然排序进行排序
		○ TreeSet(Comparator comparator):根据指定的比较器进行排序
	• 没有带索引的方法，所以不能使用普通for循环遍历
    ·由于是Set集合，所以不包含重复元素的集合
*/
public class treeSetTest {
    public static void main(String[] args) {
        // TreeSet<Integer> in = new TreeSet<Integer>();

        // in.add(10);
        // in.add(30);
        // in.add(40);
        // in.add(20);

        // in.add(20);

        // for (Integer i : in) {
        //     System.out.println(i);
        // }


        //ClassCastException类转换异常 StudentTest类需要实现Comparator(自然排序接口)接口
        TreeSet<StudentTest> st = new TreeSet<StudentTest>();
        StudentTest s1=new StudentTest(17,"打野");
        StudentTest s2=new StudentTest(13,"好的哈");
        StudentTest s3=new StudentTest(19,"达到");
        StudentTest s4=new StudentTest(16,"达到2");
        StudentTest s5=new StudentTest(19,"答案啊嗷嗷");
        StudentTest s6=new StudentTest(19,"答案啊嗷嗷");

        st.add(s1);
        st.add(s2);
        st.add(s3);
        st.add(s4);
        st.add(s5);
        st.add(s6);

        for(StudentTest s:st){
            System.out.println(s.getAge()+" "+s.getName());
        }

        

    }
}
