package org.example.cupcake;

public class Cupcake implements Cake {

    @Override
    public String getName() {
        return "🧁";
    }

    @Override
    public double getPrice() {
        return 1.0;
    }
}
