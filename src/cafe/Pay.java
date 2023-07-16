package cafe;

public class Pay {
    private int balance; // 잔액

    public Pay(int balance) {
        this.balance = balance;
    }

    // 결제 기능
    public void payment(int price) {
        balance -= price;
        if (balance < 3000) {
            System.out.println("금액 충전이 필요합니다.");
        }
    }

}
