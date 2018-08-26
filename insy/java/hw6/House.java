package insy.java.hw6;

public class House {
    private int streetNumber;
    private String streetName;
    private String town;
    private int constructionYear;
    private int propertyTax;

    public House(int streetNumber, String streetName, String town) {
        this.streetNumber = streetNumber;
        this.streetName = streetName;
        this.town = town;
    }

    public House(int streetNumber, String streetName, String town, int constructionYear, int propertyTax) {
        this.streetNumber = streetNumber;
        this.streetName = streetName;
        this.town = town;
        this.constructionYear = constructionYear;
        this.propertyTax = propertyTax;
    }

    public int getStreetNumber() {
        return streetNumber;
    }

    public void setStreetNumber(int streetNumber) {
        this.streetNumber = streetNumber;
    }

    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    public String getTown() {
        return town;
    }

    public void setTown(String town) {
        this.town = town;
    }

    public int getConstructionYear() {
        return constructionYear;
    }

    public void setConstructionYear(int constructionYear) {
        this.constructionYear = constructionYear;
    }

    public int getPropertyTax() {
        return propertyTax;
    }

    public void setPropertyTax(int propertyTax) {
        this.propertyTax = propertyTax;
    }

    @Override
    public String toString() {
        return streetNumber + " " + streetName +
                "\n" + town +
                "\n" + "Construction Year: " + constructionYear +
                "\n" + "Property Tax: $" + propertyTax;
    }
}
