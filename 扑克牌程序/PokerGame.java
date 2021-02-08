package 扑克牌程序;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class PokerGame {
    //suits数组装花色
    public static final String[] suits = {"♥", "♠", "♣", "♦"};
    public static List<Card> buyPoker() {

        ArrayList<Card> poker = new ArrayList<>();
        // 这个循环处理四种花色
        for (int i = 0; i < 4; i++) {
            // 里面再处理每种花色的十三张牌
            for (int j = 2; j <= 10; j++) {
                poker.add(new Card(suits[i], "" + j));
            }
            poker.add(new Card(suits[i], "J"));
            poker.add(new Card(suits[i], "Q"));
            poker.add(new Card(suits[i], "K"));
            poker.add(new Card(suits[i], "A"));
        }
        poker.add(new Card("", "big Joker"));
        poker.add(new Card("", "small Joker"));
        return poker;
    }




//    private static void swap(List<Card> poker, int i, int j) {
//        Card tmp = poker.get(i);
//        poker.set(i, poker.get(j));
//        poker.set(j, tmp);
//    }


}
