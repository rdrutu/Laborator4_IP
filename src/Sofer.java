public class Sofer {
    private String name;
    private String phoneNumber;
    private Masina masina;
    private boolean status;
    private Comanda comanda;

    public Sofer(String name, String phoneNumber, Masina masina, boolean status) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.masina = masina;
        this.status = status;
    }

    String getName() {
        return name;
    }

    String getPhoneNumber() {
        return phoneNumber;
    }
}
