package cafe;

public class Pay {

    private int balance; // 잔액

    public Pay(int balance) {
        this.balance = balance;
    }

    public void payment(int price) {  // 결제 기능
        balance -= price;
        if (balance < 3000) {
            System.out.println("금액 충전이 필요합니다.");
        }
    }

}
