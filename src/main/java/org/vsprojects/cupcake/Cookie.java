package org.vsprojects.cupcake;

public class Cookie implements Cake{
    @Override
    public String getName() {
        return "🍪";
    }

    @Override
    public double getPrice() {
        return 2.0;
    }
}
