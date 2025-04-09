package cupcake;

import org.junit.jupiter.api.Test;
import org.vsprojects.cupcake.*;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class CakePackageTest {
    @Test
    void packageWithOneCupcake() {
        Cake cupcake = new Cupcake();
        CakePackage pack = new CakePackage();
        pack.add(cupcake);

        assertTrue(pack.getName().contains("🧁"));
        assertEquals(0.9, pack.getPrice(), 0.0001); // 10% de descuento
    }

    @Test
    void packageWithCupcakeAndCookie() {
        Cake cupcake = new Cupcake();
        Cake cookie = new Cookie();
        CakePackage pack = new CakePackage();
        pack.add(cupcake);
        pack.add(cookie);

        // (1.0 + 2.0) * 0.9 = 2.7
        assertEquals(2.7, pack.getPrice(), 0.0001);
    }

    @Test
    void packageWithDecoratedCake() {
        Cake fancyCake = new Candy(new Nuts(new Chocolate(new Cupcake())));
        CakePackage pack = new CakePackage();
        pack.add(fancyCake);

        // 1.0 + 0.1 + 0.1 + 0.1 = 1.3 -> 10% desc = 1.17
        assertEquals(1.17, pack.getPrice(), 0.0001);
    }

    @Test
    void packageWithinPackage() {
        CakePackage subPack = new CakePackage();
        subPack.add(new Cupcake());
        subPack.add(new Cookie());

        CakePackage mainPack = new CakePackage();
        mainPack.add(subPack);
        mainPack.add(new Chocolate(new Cupcake()));

        // subPack = (1.0 + 2.0) * 0.9 = 2.7
        // chocoCupcake = 1.1
        // total = (2.7 + 1.1) * 0.9 = 3.42
        assertEquals(3.42, mainPack.getPrice(), 0.0001);
    }
}
