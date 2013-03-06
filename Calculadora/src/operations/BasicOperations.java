/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package operations;

import java.text.DecimalFormat;

/**
 *
 * @author berik
 */
public class BasicOperations {

    private static double roundToDecimals(double num, int dec) {
        return Math.round(num * Math.pow(10, dec)) / Math.pow(10, dec);
    }

    private static double add(double num1, double num2) {
        return num1 + num2;
    }

    private static double less(double num1, double num2) {
        return num1 - num2;
    }

    private static double multiply(double num1, double num2) {
        return num1 * num2;
    }

    private static double divide(double num1, double num2) {
        return num1 / num2;
    }

    private static double percent(double num1, double num2) {
        return (num1 * num2) / 100;
    }

    public static double makeOperation(OperationType operation, double num1, double num2, int decimalCounter) {
        double result;
        switch (operation) {
            case ADD:
                result = add(num1, num2);
                break;
            case LESS:
                result = less(num1, num2);
                break;
            case MULTIPLY:
                result = multiply(num1, num2);
                break;
            case DIVIDE:
                result = divide(num1, num2);
                break;
            case PERCENT:
                result = percent(num1, num2);
                break;
            default:
                throw new AssertionError();

        }
        return roundToDecimals(result, decimalCounter);
    }
}
