package cafe;

public class Barista {

    public Coffee makeCoffee(MenuItem menuItem, String nickname) {
        Coffee coffee = new Coffee(menuItem);
        System.out.println(nickname + "고객님 주문하신" + coffee.getName() + "한 잔 나왔습니다.");
        return coffee;
    }
}
