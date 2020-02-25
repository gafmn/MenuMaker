import java.util.ArrayList;

public class Order {
    private Integer OrderID;
    private java.util.ArrayList<MenuItem> items;
    private String created_at;

    Order() {
        items = new ArrayList<MenuItem>();
    }

    public void addItem(MenuItem item) {
        items.add(item);
    }

    public Double getCost() {
        Double sum = 0.0;
        for (MenuItem item : items) {
            sum += item.getCost();
        }
        return sum;
    }

    public Integer getItemsAmount() {
        return items.size();
    }
}
