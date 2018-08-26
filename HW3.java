/*Deepit Raj Sapru 1001522895
INSY 4305/5309 - HW#3
*/

import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import java.text.DecimalFormat;

public class HW3 {

    // takes kwh and calculates the total charge for that customer.
    public static double findCharge(int kwh1) {
        double first3, second3, third4, after1K;
        first3 = kwh1 * .09;
        second3 = (kwh1 - 300) * .08 + 27;
        third4 = (kwh1 - 400) * .06 + 39;
        after1K = (kwh1 - 1000) * .05 + 75;

//calculating the charges according to usage
        if (kwh1 <= 300)
            return first3;

        if (kwh1 <= 600)
            return second3;

        if (kwh1 <= 1000)
            return third4;

        if (kwh1 > 1000)
            return after1K;

        return .1;
    }


    public static void main(String[] arg) {
        int cust = 0, kwh1 = 0, count = 0, totalkwh = 0;
        double totalcharge = 0;
        double findCharge;
        double SENTINEL = -999.0;
        JTextArea area = new JTextArea(15, 22);
        String message = "";
        String message2 = "";
        DecimalFormat myFormat;
        myFormat = new DecimalFormat("0.00");

        message = "Customer No.   Usage in Kwh.   Total Charges\n" + "\n" + "------------------------------------------------------------------";
        area.setText(message);

        while (cust != SENTINEL) {


            cust = Integer.parseInt(JOptionPane.showInputDialog("Please enter a customer number or -999 to quit"));
//To exit the loop if -999 is entered
            if (cust == SENTINEL) {
                break;
            }
            kwh1 = Integer.parseInt(JOptionPane.showInputDialog("Please enter the usage in KWH"));

            if (cust != SENTINEL) {

                findCharge = findCharge(kwh1);
                totalkwh = totalkwh + kwh1;
                totalcharge = totalcharge + findCharge;
                count++;
                area.append("\n" + cust + "                        " + kwh1 + "                         " + myFormat.format(findCharge));
            }

        }
//Displaying the final output
        message2 = "\n" + "--------------------------------------------------------------------" + "\n" + count + "                        " + totalkwh + "                        " + myFormat.format(totalcharge);
        area.append(message2);
        JOptionPane.showMessageDialog(null, new JScrollPane(area));
        System.exit(0);

    }
}

