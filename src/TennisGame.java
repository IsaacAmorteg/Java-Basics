public class TennisGame {
    public static void main(String[] args) {
        int totalGames = 6;
        int gamer_1 = 5;
        int gamer_2 = 5;
        String winMessage_1 = "The Winner is Player 1";
        String winMessage_2 = "The Winner is Player 2";
        String draw = "Game extended to 7, no winners yet!";

        if ((gamer_1 == 5) && (gamer_2 == 5)) {
            totalGames = 7;
            System.out.println(draw);
        }else if ((gamer_1 == 5) || (gamer_2 == 5)) {
            System.out.println("");
        }
    }
}
