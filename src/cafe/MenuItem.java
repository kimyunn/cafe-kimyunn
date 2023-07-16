package cafe;

public class MenuItem {

    private String name;
    private String size;
    private int price;
    public MenuItem(String name, String size, int price) {
        this.name = name;
        this.size = size;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public String getSize() {
        return size;
    }

    public int getPrice() {
        return price;
    }



}
