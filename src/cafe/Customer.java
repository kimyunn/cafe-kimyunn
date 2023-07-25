package cafe;

public class Customer {
    private String nickname;

    private Pay pay;

    public Customer(String nickname, Pay pay) {
        this.nickname = nickname;
        this.pay = pay;
    }

    public void order(SelectMenu selectMenu,Barista barista) {
        System.out.println(selectMenu.getSize()+"사이즈"+selectMenu.getName()+" 한 잔 "+selectMenu.getHotOrIce()+"로 주세요.");
        PickUpTable pickupTable = barista.getOrder(selectMenu, nickname, pay);
        if (pickupTable != null) {
            pickupTable.pickUpCoffee();
        }

    }

}
