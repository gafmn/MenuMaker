import java.awt.*;

public abstract class MenuItem {
    private String name;
    private int itemId;
    private String description;
    private Double cost;
    private Image image;

    @Override
    public String toString() {
        return String.format("%d\t%s\t%f\t%s", itemId, name, cost, description);
    }

    public Double getCost() {
        return this.cost;
    }
}
