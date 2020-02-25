public class Burger extends MenuItem {
    private String size;
    private String bun;
    private String meat;
    private String salad;
    private String cheese;
    private String sauce;

    Burger(BurgerBuilder burgerBuilder) {
        this.size = burgerBuilder.getSize();
        this.bun = burgerBuilder.getBun();
        this.meat = burgerBuilder.getMeat();
        this.salad = burgerBuilder.getSalad();
        this.cheese = burgerBuilder.getCheese();
        this.sauce = burgerBuilder.getSauce();
    }

    public String getSize() {
        return size;
    }

    public String getBun() {
        return bun;
    }

    public String getMeat() {
        return meat;
    }

    public String getSalad() {
        return salad;
    }

    public String getCheese() {
        return cheese;
    }

    public String getSauce() {
        return sauce;
    }
}
