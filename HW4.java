/*
Deepit Raj Sapru 1001522895
INSY 4305/5309 - HW #4

Write a java program (a driver application) that tests the above class by providing the users with the following menu options:

1 - to set the length
2 - to set the width
3 - to get the length
4 - to get the width
5 - to get the perimeter
6 - to get the area
7 - to print the object as string
0 - to quit

Your program should create one Rectangle object at the beginning using the default constructor, and then repeatedly call the appropriate method for that object depending on the user selection from the above menu. Use JOptionPane for all input/output.

You should name the application file Hw4.java and submit it along with the Rectangle.java file.
*/

import javax.swing.JOptionPane;


public class HW4 {

    public static void main(String[] args) {

        int opt = 9;
        int SENTINEL = -99;

//object creation rect for class Rectangle
        Rectangle rect = new Rectangle();

       while (opt != SENTINEL) {
           opt = Integer.parseInt(JOptionPane.showInputDialog("Enter your choice- \r\n" + "1: To set the length \r\n" +
                    "2: To set the width \r\n" +
                    "3: To get the length \r\n" +
                    "4: To get the width \r\n" +
                    "5: To get the perimeter \r\n" +
                    "6: To get the area \r\n" +
                    "7: To print the object as string \r\n" +
                    "0: To quit "));
            if (opt == 1) {
                rect.setLength(Integer.parseInt(JOptionPane.showInputDialog("Set the length of the Rectangle")));
            }
            if (opt == 2) {
                rect.setWidth(Integer.parseInt(JOptionPane.showInputDialog("Set the width of the Rectangle")));
            }
            if (opt == 3) {
                JOptionPane.showMessageDialog(null, "Length of the rectangle: " + rect.getLength());
            }
            if (opt == 4) {
                JOptionPane.showMessageDialog(null, "Width of the rectangle: " + rect.getWidth());
            }
            if (opt == 5) {
                JOptionPane.showMessageDialog(null, "Perimeter of the rectangle: " + rect.perimeter(rect.getLength(), rect.getWidth()));
            }
            if (opt == 6) {
                JOptionPane.showMessageDialog(null, "Area of the rectangle: " + rect.area(rect.getLength(), rect.getWidth()));
            }
            if (opt == 7) {
                JOptionPane.showMessageDialog(null, rect.toString());
            }
            if (opt == 0) {
                break;
            }


        }

    }

}


