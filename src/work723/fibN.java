package work723;

public class fibN {
    public static void main(String[] args){
        System.out.println(fib(10));
    }
    static long fib(int num){
        if(num<=1){
            return 1;
        }
        else{
            return fib(num-2)+fib(num-1);
        }
    }
}

class liuzi {
    public String name;
    private String Chara="shabi";
    public fibN fib;
    public String getChara() {
        return Chara;
    }
    public void setChara(String chara) {
        Chara = chara;
    }
    public liuzi(String name,String Chara){
        this.name=name;  
    }
    

}