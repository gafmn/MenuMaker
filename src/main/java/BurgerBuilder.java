public class BurgerBuilder extends MenuItemBuilder {
    private String size;
    private String bun;
    private String meat;
    private String cheese;
    private String salad;
    private String sauce;

    public Burger createProduct() {
        return new Burger(this);
    }


    public void addBun(String bun) {
        this.bun = bun;
    }

    public void addMeat(String meat) {
        this.meat = meat;
    }

    public void addSalad(String salad) {
        this.salad = salad;
    }

    public void addCheese(String cheese) {
        this.cheese = cheese;
    }

    public String getBun() {
        return bun;
    }

    public String getMeat() {
        return meat;
    }

    public String getCheese() {
        return cheese;
    }

    public String getSalad() {
        return salad;
    }

    public String getSauce() {
        return sauce;
    }

    public void addSauce(String sauce) {
        this.sauce = sauce;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }
}
