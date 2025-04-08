package org.example.cupcake;

public abstract class IngredientDecorator implements Cake{
    protected final Cake cake;

    public IngredientDecorator(Cake cake) {
        this.cake = cake;
    }
}
