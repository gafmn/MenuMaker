import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Tests {

    private Burger createBurger() {
        final String bun = "Grey bread";
        final String meat = "Ground beef";
        final String size = "Small";
        final String cheese = "Cheddar";

        BurgerBuilder builder = new BurgerBuilder();

        builder.addBun(bun);
        builder.addSize(size);
        builder.addCheese(cheese);
        builder.addMeat(meat);

        Burger burger = builder.createProduct();

        assertEquals(burger.getBun(), bun);
        assertEquals(burger.getSize(), size);
        assertEquals(burger.getCheese(), cheese);
        assertEquals(burger.getMeat(), meat);

        return burger;
    }

    private ColdDrink createColdDrink() {
        final String size = "Small";
        final String drink = "Coca Cola";
        final String flavour = "Vanilla";

        ColdDrinkBuilder builder = new ColdDrinkBuilder();

        builder.addSize(size);
        builder.addDrink(drink);
        builder.addFlavour(flavour);

        ColdDrink cold_drink = builder.createProduct();

        assertEquals(cold_drink.getSize(), size);
        assertEquals(cold_drink.getDrink(), drink);
        assertEquals(cold_drink.getFlavour(), flavour);

        return cold_drink;
    }

    @Test
    public void test1() {
        Order order = new Order();
        order.addItem(createBurger());
        order.addItem(createColdDrink());

        assertEquals((int)order.getItemsAmount(), 2);
    }

}
