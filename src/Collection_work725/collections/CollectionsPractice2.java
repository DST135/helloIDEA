package Collection_work725.collections;

import java.util.ArrayList;
import java.util.Collections;

/**
 * 需求：通过程序实现斗地主过程中的洗牌，发牌和看牌
 * 思路：
①创建一个牌盒，也就是定义一个集合对象，用 ArrayList集合实现
②往牌盒里面装牌
③洗牌，也就是把牌打撒，用 Collections的 shuffled方法实现
④发牌，也就是遍历集合，给三个玩家发牌
⑤看牌，也就是三个玩家分别遍历自己的牌
 */

public class CollectionsPractice2 {
    public static void main(String[] args){
        ArrayList<String> card=new ArrayList<>();
        
        String[] colors={"♥","♦","♠","♣"};
        String[] num={"2","3","4","5","6","7","8","9","10","J","Q","K","A"};
        //装牌
        for(String color:colors){
            for(String n:num){
                card.add(color+n);
            }
        }
        card.add("大王");
        card.add("小王");

        //洗牌
        Collections.shuffle(card);
        //System.out.println(card);

        //发牌
        ArrayList<String> player1=new ArrayList<>();
        ArrayList<String> player2=new ArrayList<>();
        ArrayList<String> player3=new ArrayList<>();
        ArrayList<String> dipai=new ArrayList<>();

        for(int i=0;i<card.size();i++){
            if(i>=card.size()-3){
                dipai.add(card.get(i));
            }
            else if(i%3==0){
                player1.add(card.get(i));
            }
            else if(i%3==1){
                player2.add(card.get(i));
            }
            else if(i%3==2){
                player3.add(card.get(i));
            }
        }

        //看牌
        lookpoker("玩家1",player1);
        lookpoker("玩家2",player2);
        lookpoker("玩家3",player3);
        lookpoker("底牌",dipai);
    }

    public static void lookpoker(String name,ArrayList<String> li){
        System.out.println(name+"的牌是："+li);
    }

}
