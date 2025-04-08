package cupcake;

import org.example.cupcake.Cake;
import org.example.cupcake.Cupcake;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CupcakeTest {
    @Test
    void testName() {
        Cake cupcake = new Cupcake();
        assertEquals("🧁", cupcake.getName());
    }

    @Test
    void testPrice() {
        Cake cupcake = new Cupcake();
        assertEquals(1.0, cupcake.getPrice());
    }
}
