public class Comanda {
    private int id;
    private String pickup;
    private String destination;
    private int distance;
    private int price;

    Comanda(String pickup, String destination, int distance, int price) {
        this.pickup = pickup;
        this.destination = destination;
        this.distance = distance;
        this.price = price;
    }

    public int getId() {
        return id;
    }
}
