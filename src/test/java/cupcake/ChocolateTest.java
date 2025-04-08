package cupcake;

import org.example.cupcake.Cake;
import org.example.cupcake.Chocolate;
import org.example.cupcake.Cupcake;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ChocolateTest {
    @Test
    void chocolateAddedToCupcakeShouldChangeName() {
        Cake cake = new Chocolate(new Cupcake());
        assertEquals("🧁 con 🍫", cake.getName());
    }

    @Test
    void chocolateAddedToCupcakeShouldIncreasePrice() {
        Cake cake = new Chocolate(new Cupcake());
        assertEquals(1.1, cake.getPrice());
    }
}
