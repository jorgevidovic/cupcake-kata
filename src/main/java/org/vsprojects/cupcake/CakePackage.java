package org.vsprojects.cupcake;

import java.util.ArrayList;
import java.util.List;

public class CakePackage implements Cake{
    private final List<Cake> cakes = new ArrayList<>();

    public void add(Cake cake) {
        cakes.add(cake);
    }

    @Override
    public String getName() {
        if (cakes.isEmpty()) {
            return "Paquete vacío";
        }

        StringBuilder sb = new StringBuilder("Paquete de pasteles:\n");
        for (Cake cake : cakes) {
            sb.append("- ").append(cake.getName()).append("\n");
        }
        return sb.toString().trim();
    }

    @Override
    public double getPrice() {
        double total = cakes.stream()
                .mapToDouble(Cake::getPrice)
                .sum();
        return Math.round(total * 0.9 * 100.0) / 100.0;
    }

}
