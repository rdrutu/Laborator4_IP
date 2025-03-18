public class Main {
    public static void main(String[] args) {

        Client client = new Client("Pintilie David", "0712345678");
        Sofer sofer1 = new Sofer("Nea Marin", "0723456789", new Masina("Dacia Logan", "Alb"), true);
        Sofer sofer2 = new Sofer("Nicu de la Cazanesti", "0734567890", new Masina("Toyota", "Negru"), true);
        Sofer[] soferi = {sofer1, sofer2};

        AplicatieUber aplicatie = new AplicatieUber(client, soferi);

        client.plaseazaComanda("Piata Unirii", "Aeroport Iasi", 20, 50);
        aplicatie.atribuieComanda(client, soferi, client.getComanda());
    }
}