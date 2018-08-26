
import java.util.InputMismatchException;
import java.util.Scanner;

public class HomeDriver {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int streetNumber = 0;
        boolean validInput = false;
        while (!validInput) {
            System.out.print("Please provide the street number: ");
            try {
                streetNumber = in.nextInt();
                validInput = true;
            } catch (InputMismatchException e) {
                validInput = false;
                in.nextLine();
            }
        }
        in.nextLine();
        System.out.print("Please provide the street name: ");
        String streetName = in.nextLine();

        System.out.print("Please provide the town name: ");
        String town = in.nextLine();

        System.out.print("Please provide the family name: ");
        String familyName = in.nextLine();

        int constructionYear = 0;
        validInput = false;
        while (!validInput) {
            System.out.print("Please provide the construction year: ");
            try {
                constructionYear = in.nextInt();
                validInput = true;
            } catch (InputMismatchException e) {
                validInput = false;
                in.nextLine();
            }
        }

        int propertyTax = 0;
        validInput = false;
        while (!validInput) {
            System.out.print("Please provide the property tax: ");
            try {
                propertyTax = in.nextInt();
                validInput = true;
            } catch (InputMismatchException e) {
                validInput = false;
                in.nextLine();
            }
        }

        int month = 0;
        validInput = false;
        while (!validInput) {
            System.out.print("Please provide the moved in month: ");
            try {
                month = in.nextInt();
                validInput = true;
            } catch (InputMismatchException e) {
                validInput = false;
                in.nextLine();
            }
        }

        int day = 0;
        validInput = false;
        while (!validInput) {
            System.out.print("Please provide the moved in day: ");
            try {
                day = in.nextInt();
                validInput = true;
            } catch (InputMismatchException e) {
                validInput = false;
                in.nextLine();
            }
        }
        int year = 0;
        validInput = false;
        while (!validInput) {
            System.out.print("Please provide the moved in year: ");
            try {
                year = in.nextInt();
                validInput = true;
            } catch (InputMismatchException e) {
                validInput = false;
                in.nextLine();
            }
        }

        in.close();
        insy.java.hw6.Home home = new insy.java.hw6.Home(streetNumber, streetName, town, constructionYear, propertyTax, familyName, new insy.java.hw6.OurDate(month, day, year));
        System.out.println(home);
    }
}
