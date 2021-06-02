package strategy.problema;

public class Payment {

    public void pay(String method){
        if("CIELO".equalsIgnoreCase(method)){
            System.out.println("CIELO");
        } else if ("STONE".equalsIgnoreCase(method)){
            System.out.println("STONE");
        } else {
            System.out.println("REDE");
        }
    }
}
