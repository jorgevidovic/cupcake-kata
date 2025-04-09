package cupcake;

import org.junit.jupiter.api.Test;
import org.vsprojects.cupcake.Cake;
import org.vsprojects.cupcake.Chocolate;
import org.vsprojects.cupcake.Cupcake;
import org.vsprojects.cupcake.Nuts;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NutsTest {

    @Test
    void nutsAddedToCupcakeShouldChangeName() {
        Cake cake = new Nuts(new Cupcake());
        assertEquals("🧁 con 🥜", cake.getName());
    }

    @Test
    void nutsAfterChocolateShouldAddY() {
        Cake cake = new Nuts(new Chocolate(new Cupcake()));
        assertEquals("🧁 con 🍫 y 🥜", cake.getName());
    }

    @Test
    void nutsShouldIncreasePrice() {
        Cake cake = new Nuts(new Cupcake());
        assertEquals(1.1, cake.getPrice());
    }

    @Test
    void nutsAfterChocolateShouldIncreasePrice() {
        Cake cake = new Nuts(new Chocolate(new Cupcake()));
        assertEquals(1.2, cake.getPrice(), 0.0001);
    }
}
