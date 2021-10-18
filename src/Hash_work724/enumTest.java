package Hash_work724;

enum Language {
    CHINESE(5),ENGLISH(1),TIETIE(100);
    public int level;
    private Language(int level){
        this.level=level;
    }
    public String fullName(){
        return this.name()+level;//继承name方法，返回实例名
    }
}
class test{
    public static void main(String[] args){
        System.out.println(Language.CHINESE.level);
        System.out.println(Language.TIETIE.fullName());
    }
}
