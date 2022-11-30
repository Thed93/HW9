package mechanics;

import someTransport.Transport;

import java.util.Objects;

public class Mechanics {
    private final String firstName;
    private final String lastName;
    private final String company;
    private final MechanicsTransportTypes type;

    public Mechanics(String firstName, String lastName, String company, MechanicsTransportTypes type) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.company = company;
        this.type = type;
    }

    public void makeTO() {
        System.out.printf("Механик %s %s проводит ТО", firstName, lastName);
    }
    public void repair(Transport transport) {
        System.out.printf("Механик %s %s ремонтирует %s %s", firstName, lastName, transport.getBrand(), transport.getModel());
    }


    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getCompany() {
        return company;
    }

    public MechanicsTransportTypes getType() {
        return type;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Mechanics)) return false;
        Mechanics mechanics = (Mechanics) o;
        return Objects.equals(firstName, mechanics.firstName) && Objects.equals(lastName, mechanics.lastName) && Objects.equals(company, mechanics.company);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, company);
    }
}
