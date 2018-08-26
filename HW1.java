/*Deepit Raj Sapru 1001522895
INSY 4305/5309 - HW#1
Write a java program that prompts the user (using JOptionPane) to enter first name, last name and age for two persons.
You need to use separate dialog boxes for each input (i.e., six separate dialog boxes for the inputs).
You should store the names in String variables and the ages in int variables.
*/

import javax.swing.JOptionPane;

public class HW1 {

    public static void main(String[] args) {
        String firstname1, firstname2, lastname1, lastname2, age_1, age_2;
        int age1, age2;

        //Input using JoptionPane for both the person.
        firstname1 = JOptionPane.showInputDialog("Enter the first name of the first person.");
        lastname1 = JOptionPane.showInputDialog("Enter the last name of the first person.");
        age_1 = JOptionPane.showInputDialog("Enter the age name of the first person.");
        firstname2 = JOptionPane.showInputDialog("Enter the first name of the second person.");
        lastname2 = JOptionPane.showInputDialog("Enter the last name of the second person.");
        age_2 = JOptionPane.showInputDialog("Enter the agef of the second person.");

        //Conversion of the age of each person from string to integer.
        age1 = Integer.parseInt(age_1);
        age2 = Integer.parseInt(age_2);


        //If and else if to check which person is younger/older or if their age is the same
        if (age1 < age2) {

            JOptionPane.showMessageDialog(null, "First Person : " + lastname1 + ", " + firstname1 + " (" + age1 + ")\n" + "Second Person :" + lastname2 + ", " + firstname2 + " (" + age2 + ")" + "\n" + firstname2 + " is older than " + firstname1);
        } else if (age1 > age2) {

            JOptionPane.showMessageDialog(null, "First Person : " + lastname1 + ", " + firstname1 + " (" + age1 + ")\n" + "Second Person : " + lastname2 + ", " + firstname2 + " (" + age2 + ")" + "\n" + firstname2 + " is younger than " + firstname1);

        } else //age1 == age2
        {
            JOptionPane.showMessageDialog(null, "First Person : " + lastname1 + ", " + firstname1 + " (" + age1 + ")\n" + "Second Person : " + lastname2 + ", " + firstname2 + " (" + age2 + ")" + "\n" + firstname2 + " is the same age as " + firstname1);

        }


    }

}
