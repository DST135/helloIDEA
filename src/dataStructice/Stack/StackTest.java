package dataStructice.Stack;

/**
 * Created with IntelliJ IDEA.
 *
 * @author : 铁铁
 * @Project : helloIDEA
 * @Package : dataStructice.Stack
 * @ClassName : StackTest.java
 * @createTime : 2021/10/11 19:56
 * @Description :栈练习
 */
public class StackTest {
    public static void main(String[] args) {
        ArrayStack arrayStack = new ArrayStack(5);
        arrayStack.push(90);
        arrayStack.push(20);
        arrayStack.push(94);
        arrayStack.push(80);
        arrayStack.push(34);
        arrayStack.list();
        arrayStack.push(36);
        arrayStack.list();
    }
}

class ArrayStack {
    private int maxsize;
    private int[] Data;
    private int top=-1;

    //构造方法
    public ArrayStack(int maxsize){
        this.maxsize=maxsize;
        Data=new int[this.maxsize];
    }

    //栈满
    public boolean isFull(){
        return top==maxsize-1;
    }

    //栈空
    public boolean isEmpty(){
        return top==-1;
    }

    //入栈
    public void push(int data){
        if(isFull()) return;
        top++;
        Data[top]=data;
    }

    //出栈
    public int pop(){
        if(isEmpty()){
            throw new RuntimeException("栈空，没有数据");
        }
        int value=Data[top];
        top--;
        return value;
    }

    //显示栈
    public void list(){
        if(isEmpty()){
            System.out.println("栈空，没有数据");
            return;
        }
        //需要从栈顶返回数据
        for(int i=top;i>=0;i--){
            System.out.printf("Data[%d]=%d ",i,Data[i]);
        }

    }
}