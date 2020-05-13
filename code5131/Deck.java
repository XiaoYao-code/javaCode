package code513;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;



//扑克牌游戏
class Card{
    public int rank;
    public String suit;

    public Card(int rank, String suit) {
        this.rank = rank;
        this.suit = suit;
    }

    @Override
    public String toString() {
        return String.format("[%d,%s]",rank,suit);
    }
}

public class Deck {
    public static final String[]SUITS={"♥","♠","♦","♣"};
    //买牌
    public static List<Card>buyDeck(){
        List <Card> list=new ArrayList<>();
        for (int i = 0; i <4 ; i++) {
            for (int j = 1; j <=13 ; j++) {
                Card card=new Card(j,SUITS[i]);
                list.add(card);
            }
        }
        return list;
    }
    private static void swap(List<Card> deck,int index,int i){
          Card tmp=deck.get(index);
          deck.set(index,deck.get(i));
          deck.set(i,tmp);
    }
    //洗牌
    public static void shuffle(List<Card> deck){
        Random random=new Random();
        for (int i = deck.size()-1; i >0 ; i--) {
            int s=random.nextInt(i);
           swap(deck,s,i);
        }
    }

    public static void main(String[] args) {
        List <Card> deck=buyDeck();
        System.out.println("牌库");
        System.out.println(deck);
        System.out.println("洗牌");
        shuffle(deck);
        System.out.println(deck);
        //三个玩家
        List <Card> person0=new ArrayList<>();
        List <Card> person1=new ArrayList<>();
        List <Card> person2=new ArrayList<>();
        List<List<Card>> person=new ArrayList<>();
        person.add(person0);
        person.add(person1);
        person.add(person2);

        //每个玩家揭五张牌
        for (int i = 0; i <5 ; i++) {
            for (int j = 0; j <3 ; j++) {
                person.get(j).add(deck.get(0));
                deck.remove(0);
            }
        }
        System.out.println("玩家0的牌");
        System.out.println(person0);
        System.out.println("玩家1的牌");

        System.out.println(person1);
        System.out.println("玩家2的牌");

        System.out.println(person2);
        System.out.println("剩余的牌");

        System.out.println(deck);

    }
}
