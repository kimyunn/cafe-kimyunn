package cafe;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Menu> menu = new ArrayList<>();
        menu.add(new Menu("아메리카노", "tall", 4500));
        menu.add(new Menu("아메리카노","Grande", 5000));
        menu.add(new Menu("아메리카노","Venti", 5500));
        menu.add(new Menu("카페라떼","tall", 5000));
        menu.add(new Menu("카페라떼","Grande", 5500));
        menu.add(new Menu("카페라떼","Venti", 6000));

        Pay pay = new Pay(50000);

        Customer customer = new Customer("제리", pay);
        SelectMenu selectMenu = new SelectMenu("아메리카노", "tall", "Ice");
        PickUpTable pickupTable = new PickUpTable();
        Barista barista = new Barista(menu,pickupTable);
        customer.order(selectMenu,barista);

    }
}
