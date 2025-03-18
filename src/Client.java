public class Client {
    private String name;
    private String phoneNumber;
    private Comanda comanda;
    private String currentLocation;
    private String destination;

    public Client(String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    String getName() {
        return name;
    }

    String getPhoneNumber() {
        return phoneNumber;
    }

    public Comanda getComanda() {
        return comanda;
    }

    public void plaseazaComanda(String pickup, String destination, int distance, int price) {
        this.comanda = new Comanda(pickup, destination, distance, price);
        System.out.println("Comanda a fost plasata de " + name + " de la " + pickup + " la " + destination);
    }

}
