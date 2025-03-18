public class AplicatieUber {
    private Client client;
    private Sofer[] soferi;
    private Comanda comanda;

    public AplicatieUber(Client client, Sofer[] soferi) {
        this.client = client;
        this.soferi = soferi;
    }

    void atribuieComanda(Client client, Sofer[] soferi, Comanda comanda) {
        for (Sofer sofer : soferi) {
            if (sofer.isAvailable()) {
                sofer.gestioneazaComanda(comanda);
                System.out.println("Comanda a fost atribuita soferului " + sofer.getName());
                return;
            }
        }
        System.out.println("Nu exista soferi disponibili in acest moment.");
    }
}
