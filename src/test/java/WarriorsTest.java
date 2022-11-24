import game.Player;
import game.Warrior;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class WarriorsTest {
    Warrior warrior1;
    Warrior warrior2;

    @BeforeEach
    void createPlayers(){
        warrior1 = new Warrior(50,25,4);
        warrior2 = new Warrior(50,25,4);
    }

    @Test
    @DisplayName("Se reduce en 1 las vidas y restaura su vida total")
    void testDecreaseLives(){
        assertEquals(3, Player.decreaseLives(warrior1).getLives());
    }

    @Test
    @DisplayName("Se reduce la vida luego del ataque")
    void testAttack(){
        assertEquals(25,Main.attack(warrior1,warrior2).getHealth());
    }
}
