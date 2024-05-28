/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bo;

/**
 *
 * @author ADMIN
 */
public class NumberSystemManager {

    public static final char[] hexDigits = {
        '0', '1', '2', '3', '4', '5', '6', '7',
        '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'
    };

    public boolean checkDouble(double num) {
        return num != Math.floor(num); //neu la double thi true
    }
    
    public static String convertBinaryToDecimal(String binary) { //2->10
        
        int decimal = Integer.parseInt(binary, 2);
        return Integer.toString(decimal);
    }

    //allow user convert from binary to decimal
    public static String convertBinaryToHexa(String binary) { //2->16
        String decimal = convertBinaryToDecimal(binary);
        String hexa = convertDecimalToHexa(decimal);
        return hexa;
    }

    //allow user convert from hexa to decimal
    public static int convertHexaToDecimal(String hexadecimal) { //16->10
        int decimal = Integer.parseInt(hexadecimal, 16);
        return decimal;
    }

    //allow user convert from binary to decimal
    public static String convertHexaToBinary(String hexadecimal) { //16->2
        String binary = Integer.toBinaryString(convertHexaToDecimal(hexadecimal));
        return binary;
    }

    //allow user convert from binary to decimal
    public static String convertDecimalToBinary(String decimal) { //10->2
        String binary = Integer.toBinaryString(Integer.parseInt(decimal));
        return binary;
    }

    //allow user convert from decimal to hexa
    public static String convertDecimalToHexa(String decimal) { //10->16
        String hexa = "";
        int deci = Integer.parseInt(decimal);
        while (deci != 0) {
            hexa = hexDigits[deci % 16] + hexa;
            deci /= 16;
        }
        return hexa;
    }

    public static String convertDoubleDecimaltoHexa(double decimalNumber) {
        int integerPart = (int) decimalNumber;
        double fractionalPart = decimalNumber - integerPart;
        String binaryString = "";

        // Convert integer part
        while (integerPart > 0) {
            int remainder = integerPart % 2;
            binaryString = remainder + binaryString;
            integerPart = integerPart / 2;
        }

        binaryString = binaryString + ".";

        // Convert fractional part
        while (fractionalPart > 0) {
            fractionalPart = fractionalPart * 2;
            int bit = (int) fractionalPart;
            if (bit == 1) {
                fractionalPart = fractionalPart - bit;
                binaryString = binaryString + "1";
            } else {
                binaryString = binaryString + "0";
            }
        }

        return binaryString;
    }

}
