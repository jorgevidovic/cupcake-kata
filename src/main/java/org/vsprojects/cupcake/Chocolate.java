package org.vsprojects.cupcake;

public class Chocolate extends IngredientDecorator{
    public Chocolate(Cake cake) {
        super(cake);
    }

    @Override
    public String getName() {
        return cake.getName() + " con 🍫";
    }

    @Override
    public double getPrice() {
        return cake.getPrice() + 0.1;
    }
}
