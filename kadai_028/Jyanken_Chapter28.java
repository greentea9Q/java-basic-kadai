package text.kadai_028;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Jyanken_Chapter28 {
    private Scanner scanner = new Scanner(System.in);
    private String[] choices = {"r", "s", "p"};
    private Map<String, String> choiceMap = new HashMap<>();

    public Jyanken_Chapter28() {
        choiceMap.put("r", "グー");
        choiceMap.put("s", "チョキ");
        choiceMap.put("p", "パー");
    }

    // 自分の手を入力
    public String getMyChoice() {
        String input = "";
        while (true) {
            System.out.print("自分のじゃんけんの手を入力してください（r: グー, s: チョキ, p: パー）: ");
            input = scanner.nextLine().toLowerCase();
            if (choiceMap.containsKey(input)) {
                break;
            } else {
                System.out.println("無効な入力です。もう一度入力してください。");
            }
        }
        return input;
    }

    // ランダムに相手の手を選ぶ
    public String getRandom() {
        int index = (int) Math.floor(Math.random() * 3);
        return choices[index];
    }

    // じゃんけんを実行
    public void playGame(String myChoice, String enemyChoice) {
        System.out.println("自分の手: " + choiceMap.get(myChoice));
        System.out.println("相手の手: " + choiceMap.get(enemyChoice));

        if (myChoice.equals(enemyChoice)) {
            System.out.println("あいこです。");
        } else if (
            (myChoice.equals("r") && enemyChoice.equals("s")) ||
            (myChoice.equals("s") && enemyChoice.equals("p")) ||
            (myChoice.equals("p") && enemyChoice.equals("r"))
        ) {
            System.out.println("自分の勝ちです。");
        } else {
            System.out.println("自分の負けです。");
        }
    }
}