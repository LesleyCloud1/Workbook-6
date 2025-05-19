package com.pluralsight;
import java.util.ArrayList;
import java.util.List;
public class Portfolio {
    private List<Valuable> valuables = new ArrayList<>();

    public void addValuable(Valuable valuable) {
        valuables.add(valuable);
    }

    public double getTotalValue() {
        double total = 0;
        for (Valuable v : valuables) {
            total += v.getValue();
        }
        return total;
    }
}
