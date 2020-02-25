import jdk.nashorn.internal.runtime.OptimisticReturnFilters;

public class ColdDrink extends MenuItem {
    private String size;
    private String drink;
    private String flavour;

    ColdDrink(ColdDrinkBuilder drinkBuilder) {
        this.size = drinkBuilder.getSize();
        this.drink = drinkBuilder.getDrink();
        this.flavour = drinkBuilder.getFlavour();
    }
}
