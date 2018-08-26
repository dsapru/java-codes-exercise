/*
Deepit Raj Sapru 1001522895
INSY 4305/5309 - HW #5
Notes:
1. In Java you can allocate an array using a variable for the size, i.e., int[] intArray = new int[size]; where size is an int variable.
2. You SHOULD NOT use any methods from either the String or the Array class in your program.

You should only use JOptionPane for all the input/output. You should name the source code file Hw5.java.
*/

import javax.swing.JOptionPane;

public class HW5 {

    private static int getSize(int num) {
        if (num == 0)
            return 1;
        int a;
        num = Math.abs(num);
        for (a = 0; num > 0; ++a)
            num = num / 10;
        return a;
    }

    private static int[] fillArray(int num, int[] intArray) {
        int i = 0;
        int len = (int) Math.log10(num);
        int divisor = (int) Math.pow(10, len);
        while (num != 0) {
            intArray[i] = num / divisor;
            if (i < len) {
                ++i;
            }
            num = num % divisor;
            if (i != 0) {
                divisor = divisor / 10;
            }
        }
        return intArray;
    }


    private static boolean isPalindrome(int[] intArray) {
        for (int i = 0, j = intArray.length - 1; i < j; i++, j--) {
            if (intArray[i] != intArray[j]) {
                return false;
            }
        }
        return true;
    }


    public static void main(String[] args) {
        int num;
        int n1;
        int SENTINEL = -99;

        num = Integer.parseInt(JOptionPane.showInputDialog("Enter the number to check or -99 TO EXIT"));

        while (num != SENTINEL) {
            n1 = getSize(num);
            int temp1[] = new int[n1];
            int temp2[] = fillArray(num, temp1);
            if (isPalindrome(temp2)) {
                JOptionPane.showMessageDialog(null, "Number entered is a palindrome");
                JOptionPane.showMessageDialog(null, "Number of digits in the number is: " + n1);
                num = Integer.parseInt(JOptionPane.showInputDialog("Enter the number to check or -99 TO EXIT"));

            } else {
                JOptionPane.showMessageDialog(null, "Number entered is not a palindrome");
                JOptionPane.showMessageDialog(null, "Number of digits in the number is: " + n1);
                num = Integer.parseInt(JOptionPane.showInputDialog("Enter the number to check or -99 TO EXIT"));
            }
        }
        System.exit(0);
    }

}
