package text.kadai_028;

public class JyankenExec_Chapter28 {
    public static void main(String[] args) {
        Jyanken_Chapter28 game = new Jyanken_Chapter28();

        String myChoice = game.getMyChoice();       // 自分の手を取得
        String enemyChoice = game.getRandom();      // 相手の手を取得

        game.playGame(myChoice, enemyChoice);       // じゃんけん実行
    }
}
