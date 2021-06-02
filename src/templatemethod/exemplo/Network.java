package templatemethod.exemplo;

public abstract class Network {
    String userName;
    String password;

    Network() {}

    public boolean post(String message) {

        if (logIn(this.userName, this.password)) {
            System.out.println("Publicação criada: "+message);
            return true;
        }
        return false;
    }

    abstract boolean logIn(String userName, String password);

}