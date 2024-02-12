/*
take both parameters being passed, divide num1 by num2, and return the result as a 
string with properly formatted commas and 4 significant digits after the decimal place. 
For example: if num1 is 123456789 and num2
is 10000 the output should be "12,345.6789". 
The output must contain a number in the one's place even if it is a zero. 
*/

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.*;
class nearestFormattedDivision {
    public static void main(String[] args) {
        int num1 = 1234567896;
        int num2 = 10000;
        System.out.println(nearestFormattedDivision(num1, num2));
    }

    public static String nearestFormattedDivision(int num1, int num2) {
        // double result = (double) num1 / num2;
        // return String.format("%.4f", result);

         double quotient = (double) num1 / num2;
        DecimalFormat df = new DecimalFormat("#,##0.0000", new DecimalFormatSymbols(Locale.US));
        return df.format(quotient);
    }
}
