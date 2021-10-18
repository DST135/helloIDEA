package Collection_work725.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.TreeSet;

/**
 * 需求:通过程序实现斗地主过程中的洗牌，发牌和看牌。要求:对牌进行排序
思路:
①创建HashMap,键是编号,值是牌
②创建ArrayList, 存储编号
③创建花色数组和点数数组
④从0开始往HashMap里面存储编号,并存储对应的牌。同时往ArrayList埋面存储编号
⑤洗牌(洗的是编号),用Collections的shuffle（）方法实现
⑥发牌(发的也是编号，为了保证编号是排序的，创建TreeSet集合接收)
⑦定义方法看牌(遍历TreeSet集合,获取编号，到HashMap集合找对应的牌)
 */

public class CollectionsPractice3 {
    public static void main(String[] args){
        HashMap<Integer,String> card=new HashMap<>();
        ArrayList<Integer> number=new ArrayList<>();
        String[] colors={"♥","♦","♠","♣"};
        String[] num={"3","4","5","6","7","8","9","10","J","Q","K","A","2"};
        //装牌
        int t=0;
        for(String n:num){//将数字放在外围
            for(String color:colors){          
                card.put(t, color+n);
                number.add(t);
                t++;
            }
        }
        
        card.put(52,"大王");
        card.put(53,"小王");
        number.add(t);
        t++;
        number.add(t);

        //洗牌
        Collections.shuffle(number);
        System.out.println(card);
        //System.out.println(number);

        //发牌
        TreeSet<Integer> player1=new TreeSet<Integer>();
        TreeSet<Integer> player2=new TreeSet<Integer>();
        TreeSet<Integer> player3=new TreeSet<Integer>();
        TreeSet<Integer> dipai=new TreeSet<Integer>();

        for(int i=0;i<number.size();i++){
            if(i>=number.size()-3){
                dipai.add(number.get(i));
            }
            else if(i%3==0){
                player1.add(number.get(i));
            }
            else if(i%3==1){
                player2.add(number.get(i));
            }
            else if(i%3==2){
                player3.add(number.get(i));
            }
        }

        //看牌
        lookpoker("玩家1",player1,card);
        lookpoker("玩家2",player2,card);
        lookpoker("玩家3",player3,card);
        lookpoker("底牌",dipai,card);
    }

    public static void lookpoker(String name,TreeSet<Integer> li,HashMap<Integer,String> ha){
        // StringBuffer sb=new StringBuffer();
        // for(Integer i:li){
        //     sb.append(ha.get(i));
        // }
        System.out.println(name+"的牌是：");
        for(Integer i:li){
            System.out.print(ha.get(i)+" ");
        }
        System.out.println();
        
    }

}
