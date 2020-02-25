import java.util.ArrayList;

public class Menu {
    private ArrayList<MenuItem> items;

    @Override
    public String toString() {
        StringBuilder items = new StringBuilder();
        items.append("Menu:\n");
        for (MenuItem item : this.items) {
            items.append(item.toString());
        }
        return items.toString();
    }
}
