package org.vsprojects.cupcake;

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
