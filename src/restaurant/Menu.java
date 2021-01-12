package restaurant;

import java.util.ArrayList;

public class Menu {

//    String Menu items
    private ArrayList<MenuItem> items = new ArrayList<>();

    public Menu(ArrayList<MenuItem> items) {
        this.items = items;
    }

    public ArrayList<MenuItem> getItems() {
        return items;
    }

    public void setItems(ArrayList<MenuItem> items) {
        this.items = items;
    }
}
