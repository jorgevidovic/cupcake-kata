package org.vsprojects.cupcake;

public class Nuts extends IngredientDecorator{

    public Nuts(Cake cake) {
        super(cake);
    }

    @Override
    public String getName() {
        if (cake.getName().contains("con")) {
            return cake.getName() + " y 🥜";
        } else {
            return cake.getName() + " con 🥜";
        }
    }

    @Override
    public double getPrice() {
        return cake.getPrice() + 0.1;
    }
}
