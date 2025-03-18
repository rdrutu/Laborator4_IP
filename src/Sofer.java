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

    public String getName() {
        return name;
    }

    public boolean isAvailable() {
        return status;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void gestioneazaComanda(Comanda com) {
        if (status) {
            this.comanda = com;
            this.status = false;
            System.out.println("Soferul " + name + " a acceptat comanda");
        } else {
            System.out.println("Soferul " + name + " a respins cursa");
        }
    }
}
