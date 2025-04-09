package cupcake;

import org.junit.jupiter.api.Test;
import org.vsprojects.cupcake.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CandyTest {
    @Test
    void candyAddedToCupcakeShouldChangeName() {
        Cake cake = new Candy(new Cupcake());
        assertEquals("🧁 con 🍬", cake.getName());
    }

    @Test
    void candyAfterNutsShouldAddY() {
        Cake cake = new Candy(new Nuts(new Cupcake()));
        assertEquals("🧁 con 🥜 y 🍬", cake.getName());
    }

    @Test
    void candyShouldIncreasePrice() {
        Cake cake = new Candy(new Cupcake());
        assertEquals(1.1, cake.getPrice());
    }

    @Test
    void candyAfterNutsAndChocolate() {
        Cake cake = new Candy(new Nuts(new Chocolate(new Cupcake())));
        assertEquals("🧁 con 🍫 y 🥜 y 🍬", cake.getName());
        assertEquals(1.3, cake.getPrice(), 0.0001);
    }

}
