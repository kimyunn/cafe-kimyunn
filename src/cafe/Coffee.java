package cafe;

public class Coffee {
    private String name;
    private String size;
    private int price;

    public Coffee(Menu menuItem) {
        this.name = menuItem.getName();
        this.size = menuItem.getSize();
        this.price = menuItem.getPrice();
    }

    public String getName() {
        return name;
    }
}
