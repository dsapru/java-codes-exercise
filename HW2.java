/*Deepit Raj Sapru 1001522895
INSY 4305/5309 - HW#2
A year with 366 days is called a leap year. A year is a leap year if it is divisible by 4 (for e.g., 1980), except that it is not a
leap year if it is also divisible by 100 (for e.g., 1900); however, it is a leap year if it is further divisible by 400 (for e.g., 2000).
Write a program that prompts the user (using JOptionPane) to enter a year and displays (using JOptionPane) whether that year is a leap year.
The program should repeatedly prompt the user for a year until the user enters a sentinel value of -99 to quit the program.
Note that you will need to use the mod function (%) to determine divisibility by a number. You CANNOT use the class GregorianCalendar
and any of its methods.
You should name the source code file Hw2.java.
*/


import javax.swing.JOptionPane; //importing Swing for JOptionPane

public class HW2 {

    public static void main(String[] args) {

        int year; // declared variable for year

        final int SENTINEL = -99; // declared variable for SENTINEL value: to exit the program when this value is entered

        year = Integer.parseInt(JOptionPane.showInputDialog("Please enter the year or -99 to exit")); // conversion of string into integer value

        while (year != SENTINEL) { // to check for the input entered

        // Logic to check if the year entered is a leap year or not
            if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0)))
                JOptionPane.showMessageDialog(null, "The year " + year + " is a leap year");
            else
                JOptionPane.showMessageDialog(null, "The year " + year + " is not a leap year");

            year = Integer.parseInt(JOptionPane.showInputDialog("Please enter the year or -99 to exit"));

        }
        System.exit(0);
    }

}