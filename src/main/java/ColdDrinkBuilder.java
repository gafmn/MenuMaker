public class ColdDrinkBuilder extends MenuItemBuilder {
    private String size;
    private String drink;
    private String flavour;

    @Override
    public ColdDrink createProduct() {
        return new ColdDrink(this);
    }

    public String getSize() {
        return size;
    }

    public void addSize(String size) {
        this.size = size;
    }

    public String getDrink() {
        return drink;
    }

    public void addDrink(String drink) {
        this.drink = drink;
    }

    public String getFlavour() {
        return flavour;
    }

    public void addFlavour(String flavour) {
        this.flavour = flavour;
    }
}
