package sponsors;

import java.util.Objects;

public class Sponsor {
    private final boolean company;
    private final String name;
    private final int moneyOnSponsoring;

    public Sponsor(boolean company, String name, int moneyOnSponsoring) {
        this.company = company;
        this.name = name;
        this.moneyOnSponsoring = moneyOnSponsoring;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Sponsor)) return false;
        Sponsor sponsor = (Sponsor) o;
        return Objects.equals(name, sponsor.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    public void Sponsoring() {
        System.out.printf("%s спонсирует на %s", name, moneyOnSponsoring) ;
    }

}
