package strategy.solucao;

public class Main {
    public static void main(String[] args) {

        Payment cieloPay = new CieloPay();
        Payment stonePay = new StonePay();
        Payment redePay = new StonePay();

        redePay.pay();
        cieloPay.pay();
        stonePay.pay();

    }
}
