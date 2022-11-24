import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestTDD {

    @Test
    @DisplayName("Devuelve un array con los números impares")
    void oddArrayTest(){
        List<Integer> integerList;
        integerList = new ArrayList<>(List.of(7,5,3,1));
        assertEquals(integerList,TDDClass.oddArray(7));
    }

    @Test
    @DisplayName("Devuelve true si hay una palabra prohibida")
    void testKeyWords(){
        assertEquals(true,TDDClass.keyWords("Hola soy un int"));
    }
}
