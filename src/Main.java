//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int intOperandA = 30;
        int intOperandB = 10;
        int intSum = 4;
        int intProduct = 7;
        int intDifference = 10;
        int intQuotient = 5;
        int intModulo = 13;
        double doubleOperandA = 23.5;
        double doubleOperandB = 25.5;
        double doubleSum = 30.5;
        double doubleProduct = 33.5;
        double doubleDifference = 35.5;
        double doubleQuotient = 44.5;
        double doubleModulo = 50.5;
        intSum = intOperandA + intOperandB; // Assignment that uses the arithmetic operator +
        intProduct = intOperandA * intOperandB; // Assignment that uses the arithmetic operator *
        intDifference = intOperandA - intOperandB; // Assignment that uses the arithmetic operator -
        intQuotient = intOperandA / intOperandB; // Assignment that uses the arithmetic operator /
        intModulo = intOperandA % intOperandB; // Assignment that uses the arithmetic operator %
        System.out.println("The sum using ints of " + intOperandA + " " + intOperandB + " is " + intSum); // Output statement
        System.out.println("The product using ints of " + intOperandA + " " + intOperandB + " is " + intProduct); // Output statement
        System.out.println("The difference using ints of " + intOperandA + " " + intOperandB + " is " + intDifference); // Output statement
        System.out.println("The quotient using ints of " + intOperandA + " " + intOperandB + " is " + intQuotient); // Output statement
        System.out.println("The modulo using ints of " + intOperandA + " " + intOperandB + " is " + intModulo); // Output statement
        doubleSum = doubleOperandA + doubleOperandB; // Assignment that uses the arithmetic operator +
        doubleProduct = doubleOperandA * doubleOperandB; // Assignment that uses the arithmetic operator *
        doubleDifference = doubleOperandA - doubleOperandB; // Assignment that uses the arithmetic operator -
        doubleQuotient = doubleOperandA / doubleOperandB; // Assignment that uses the arithmetic operator /
        doubleModulo = doubleOperandA % doubleOperandB; // Assignment that uses the arithmetic operator %
        System.out.println("The sum using doubles of " + doubleOperandA + " " + doubleOperandB + " is " + doubleSum); // Output statement
        System.out.println("The product using doubles of " + doubleOperandA + " " + doubleOperandB + " is " + doubleProduct); // Output statement
        System.out.println("The difference using doubles of " + doubleOperandA + " " + doubleOperandB + " is " + doubleDifference); // Output statement
        System.out.println("The quotient using doubles of " + doubleOperandA + " " + doubleOperandB + " is " + doubleQuotient); // Output statement
        System.out.println("The modulo using doubles of " + doubleOperandA + " " + doubleOperandB + " is " + doubleModulo); // Output statement
    }
}