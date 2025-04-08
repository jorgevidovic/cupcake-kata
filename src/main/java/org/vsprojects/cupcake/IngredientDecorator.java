package org.vsprojects.cupcake;

public abstract class IngredientDecorator implements Cake{
    protected final Cake cake;

    public IngredientDecorator(Cake cake) {
        this.cake = cake;
    }
}
