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
}
