package cafe;

import java.util.List;

public class Menu {
    private List<MenuItem> items;

    public Menu(List<MenuItem> items) {
        this.items = items;
    }

    public MenuItem choose(String menuName, String menuSize) {
        for (MenuItem each : items) {
            if (each.getName().equals(menuName) && each.getSize().equals(menuSize)) {
                return each;
            }
        }
        return null;
    }

}
