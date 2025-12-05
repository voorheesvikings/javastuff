// lesson on accumulation and increment, decrement

class ScoreBoard {

    int playerXP = 0;
    int playerLevel = 0;
    int playerHealth = 100;
    String playerName;

    //constructor
    public ScoreBoard(String username) {
        playerName = username;

    }

    void gainXP(int amount) {
        playerXP = playerXP + amount; // accumulation, long way of doing it.
        System.out.println("Player " + playerName + " Gained " + amount + " XP!");
    }

    void heal() {
        playerHealth += 50; //compound addition, compound accumulation
    }

    void damage() {
        playerHealth -= 10; // compound subtraction
    }

    // note you can also *=, /=, and %= */

    void levelUp() {
        playerLevel++;   //increment
    }

      void levelDown() {
        playerLevel--;    //decrement
    }

    static String NAME = "Minecraft";

    void getName() {
        System.out.println(NAME);
    }

}

public class Math2 {
    public static void main(String[] args){

        ScoreBoard player1 = new ScoreBoard("Borbin");
        ScoreBoard player2 = new ScoreBoard("Bob");

        player1.gainXP(100);
        player1.gainXP(200);
        player1.heal();
        player1.damage();
        player1.levelUp();
        player1.levelUp();
        player1.levelDown();

        System.out.println("Player1 XP: " + player1.playerXP);
        System.out.println("Player1 Level: " + player1.playerLevel);

        player2.gainXP(200);
        player2.gainXP(900);
        player2.heal();
        player2.damage();
        player2.levelUp();
        player2.levelUp();
        player2.levelDown();

        System.out.println("Player2 XP: " + player2.playerXP);
        System.out.println("Player2 Level: " + player2.playerLevel);

        player1.getName();
        player2.getName();

    }
}
