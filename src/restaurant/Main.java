package restaurant;

import java.util.Date;

public class Main {

    public static void main(String[] args) {
        MenuItem menuItem = new MenuItem( "category", "description", 0.00, true, new Date());
        System.out.println(menuItem.toString());
    }
}
