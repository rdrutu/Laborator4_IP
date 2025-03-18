public class Sofer {
    private String name;
    private String phoneNumber;
    private Masina masina;

    public Sofer(String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    String getName() {
        return name;
    }

    String getPhoneNumber() {
        return phoneNumber;
    }
}
