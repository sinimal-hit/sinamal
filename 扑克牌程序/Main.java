package 扑克牌程序;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static 扑克牌程序.PokerGame.buyPoker;

public class Main {
    public static void main(String[] args) {
        // 1. 需要先创建出一副扑克牌
        List<Card> poker = buyPoker();
        // 2. 洗牌
        Collections.shuffle(poker);
        System.out.println(poker);
        // 3. 发牌, 假设有三个玩家, 每个玩家, 给发 5 张牌

        List<List<Card>> players = new ArrayList<>();
        // 每次 add 的元素都是一个 ArrayList<Card> 类型
        players.add(new ArrayList<>());
        players.add(new ArrayList<>());
        players.add(new ArrayList<>());
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 3; j++) {
                Card top = poker.remove(0);
                List<Card> player = players.get(j);
                player.add(top);
            }
        }

        // 4. 展示手牌
        for (int i = 0; i < players.size(); i++) {
            List<Card> player = players.get(i);
            System.out.println("玩家" + i + " 的手牌是: " + player);
        }
    }
}
