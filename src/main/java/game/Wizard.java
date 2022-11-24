package game;

public class Wizard extends Player{
    public Wizard(int health, int strength, int lives) {
        super(health, strength, lives);
    }

    public void skill(){
        setHealth(getHealth()+50);
    }

}
