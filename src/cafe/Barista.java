package cafe;

import java.util.List;

public class Barista {
    private List<Menu> menu;
    private PickUpTable pickupTable;

    public Barista(List<Menu> menu, PickUpTable pickupTable) {
        this.menu = menu;
        this.pickupTable = pickupTable;
    }
    public PickUpTable getOrder(SelectMenu selectMenu, String nickname, Pay pay) {
        for (int i = 0; i < menu.size(); i++) {
            Menu menuItem = menu.get(i);
            if (menuItem.getName().equals(selectMenu.getName())) {
                payment(pay, menuItem.getPrice());
                makeCoffee(menuItem);
                System.out.println(nickname + "고객님 주문하신 " +menuItem.getName() + "한 잔 나왔습니다.");
            }

        }

        return pickupTable;
    }

    public void makeCoffee(Menu menuItem) {
        Coffee coffee = new Coffee(menuItem);
        pickupTable.setCoffee(coffee);

    }

    public void payment(Pay pay, int price) {
        pay.payment(price);
    }
}
