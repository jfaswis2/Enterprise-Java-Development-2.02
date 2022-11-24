package game;

public class Elf extends Player{

    public Elf(int health, int strength, int lives) {
        super(health, strength, lives);
    }

    public void superAttack(){
        setStrength(getStrength()* 5);
    }
}
