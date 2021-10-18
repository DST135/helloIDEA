package Collection_work725.Generic;

public class StudentTest implements Comparable<StudentTest>{
    private int age;
    private String name;
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    
    @Override
    public int compareTo(StudentTest s) {
        
        //return 0; //返回0，代表元素重复，如果不改写只能存进一个元素
        //return 1; //返回1，代表后存入的元素比现存入的元素"大"，故输出顺序和输入顺序相同
        //return -1; //返回-1，代表后存入的元素比现存入的元素"小"，故输出顺序和输入顺序相反

        //按照年龄排序
        //return this.age-s.age;
        //年龄相同则无法存入，故需要补充姓名条件
        return (this.age==s.age)?(this.name.compareTo(s.name)):(this.age-s.age);
    }
}
