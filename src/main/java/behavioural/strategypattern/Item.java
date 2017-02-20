package behavioural.strategypattern;

import java.math.BigDecimal;

/**
 * Created by michal on 16.02.17.
 */
public class Item {
    private String name;
    private BigDecimal price;

    public Item(String name, BigDecimal price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public BigDecimal getPrice() {
        return price;
    }
}
