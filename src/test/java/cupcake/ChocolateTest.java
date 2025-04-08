package cupcake;

import org.vsprojects.cupcake.Cake;
import org.vsprojects.cupcake.Chocolate;
import org.vsprojects.cupcake.Cupcake;
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
