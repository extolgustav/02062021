package strategy.solucao;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Pay cieloPay = new CieloPay();
        Pay stonePay = new StonePay();
        Pay redePay = new StonePay();

        List<Pay> pays = Arrays.asList(cieloPay, stonePay, redePay);

        pays.forEach(Pay::pay);
    }
}
