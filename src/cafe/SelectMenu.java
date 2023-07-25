package cafe;

public class SelectMenu {
    private String name;
    private String size;
    private String hotOrIce;

    public SelectMenu(String name, String size, String hotOrIce) {
        this.name = name;
        this.size = size;
        this.hotOrIce = hotOrIce;
    }

    public String getName() {
        return name;
    }

    public String getSize() {
        return size;
    }

    public String getHotOrIce() {
        return hotOrIce;
    }
}
