import game.Player;

public class Main {
    public static void main(String[] args) {

    }
    public static Player attack(Player playerA, Player playerB){
        playerB.setHealth(playerB.getHealth() - playerA.getStrength());
        return playerB;
    }
}