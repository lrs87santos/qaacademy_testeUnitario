package teste_unitario;

import org.junit.Test;
import static org.junit.Assert.*;

public class Text_Ex02 {

    @Test
    public void testIsEven() {
        assertTrue(Ex02.isEven(2));
        assertTrue(Ex02.isEven(10));
        assertTrue(Ex02.isEven(100));
    }
    
}