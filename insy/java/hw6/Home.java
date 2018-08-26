package insy.java.hw6;

public class Home extends House {
    private OurDate movedIn;
    private String family;

    public Home(int house, String street, String town, String family, OurDate movedIn) {
        super(house, street, town);
        this.family = family;
        this.movedIn = movedIn;
    }

    public Home(int house, String street, String town, int yearConstructed, int propertyTax, String family, OurDate movedIn) {
        super(house, street, town, yearConstructed, propertyTax);
        this.family = family;
        this.movedIn = movedIn;
    }

    public OurDate getDateMovedIn() {
        return movedIn;
    }

    public void setDateMovedIn(OurDate movedIn) {
        this.movedIn = movedIn;
    }

    public String getFamily() {
        return family;
    }

    public void setFamily(String family) {
        this.family = family;
    }

    @Override
    public String toString() {
        return super.toString() + "\nhas been occupied by: " + family + "since: " + movedIn;
    }
}
