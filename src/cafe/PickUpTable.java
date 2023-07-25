package cafe;

public class PickUpTable {

    private Coffee coffee;

    public PickUpTable(){

    }

    public void setCoffee(Coffee coffee) {
        this.coffee = coffee;
    }

    public Coffee pickUpCoffee() {
        return coffee;
    }
}
