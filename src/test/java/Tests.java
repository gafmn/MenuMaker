import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Tests {

    @Test
    public void test1() {

        final String bun = "Grey bread";
        final String cheese = "Cheddar";
        final String meat = "Ground beef";

        BurgerBuilder bb = new BurgerBuilder();

        bb.addBun(bun);
        bb.addCheese(cheese);
        bb.addMeat(meat);

        Burger burger = bb.createProduct();

    }

}
