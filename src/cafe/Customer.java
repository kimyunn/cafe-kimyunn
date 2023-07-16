package cafe;

public class Customer {
    private String nickname;
    private Pay pay;


    public Customer(String nickname, Pay pay) {
        this.nickname = nickname;
        this.pay = pay;
    }

    public void order(ChoiceMenu choiceMenu, Menu menu, Barista barista) {
        MenuItem menuItem = menu.choose(choiceMenu.getName(), choiceMenu.getSize());
        System.out.println(choiceMenu.getSize() +" "+ choiceMenu.getName() + " 한 잔 " + choiceMenu.getHotOrIce() + "(으)로 주세요." );
        Coffee coffee =  barista.makeCoffee(menuItem, nickname);
        pay.payment(menuItem.getPrice());

    }
}
