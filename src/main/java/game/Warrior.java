package game;

import game.Player;

public class Warrior extends Player {
    public Warrior(int health, int strength, int lives) {
        super(health, strength, lives);
    }

    public void superAttack(){
        setStrength(getStrength()* 2);
    }
}
