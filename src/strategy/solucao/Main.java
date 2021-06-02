package strategy.solucao;

public class Main {
    public static void main(String[] args) {

        CieloPay cieloPay = new CieloPay();
        StonePay stonePay = new StonePay();
        StonePay redePay = new StonePay();

        redePay.pay();
        cieloPay.pay();
        stonePay.pay();

    }
}
