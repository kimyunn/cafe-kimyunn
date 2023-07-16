package cafe;

import java.util.ArrayList;

public class CafeTest {
    public static void main(String[] args) {
        ArrayList<MenuItem> menuItems = new ArrayList<>();
        menuItems.add(new MenuItem("아메리카노","tall", 4500));
        menuItems.add(new MenuItem("아메리카노","Grande", 5000));
        menuItems.add(new MenuItem("아메리카노","Venti", 5500));
        menuItems.add(new MenuItem("카페라떼","tall", 5000));
        menuItems.add(new MenuItem("카페라떼","Grande", 5500));
        menuItems.add(new MenuItem("카페라떼","Venti", 6000));

        Menu menu = new Menu(menuItems);
        Barista barista = new Barista();
        Pay pay = new Pay(5000);

        ChoiceMenu choiceMenu = new ChoiceMenu("아메리카노", "tall", "hot");

        Customer customer = new Customer("제리", pay);
        customer.order(choiceMenu, menu, barista);


    }
}
