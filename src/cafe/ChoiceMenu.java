package cafe;

public class ChoiceMenu {
    private String name;
    private String size;
    private String hotOrIce;

    public ChoiceMenu(String name, String size, String hotOrIce) {
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
