package EmailApp;

public class EmailApp {
    public static void main(String[] args) {

        Email email1 = new Email("Stefano", "Devoti");
        System.out.println(email1.showInfo());

        Email email2 = new Email("Valentina", "Magoni");
        System.out.println(email2.showInfo());

    }
}