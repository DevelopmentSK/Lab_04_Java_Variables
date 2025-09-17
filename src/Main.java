public class Main {
    public static void main(String[] args) {
        int intOperandA = 7;
        int intOperandB = 2;
        int intSum;
        int intProduct;
        int intDifference;
        int intQuotient;
        int intModulo;

        intSum = intOperandA + intOperandB;
        intProduct = intOperandA * intOperandB;
        intDifference = intOperandA - intOperandB;
        intQuotient = intOperandA / intOperandB;
        intModulo = intOperandA % intOperandB;

        System.out.println("The sum using ints of " + intOperandA + " + " + intOperandB + " is " + intSum);
        System.out.println("The product using ints of " + intOperandA + " * " + intOperandB + " is " + intProduct);
        System.out.println("The difference using ints of " + intOperandA + " - " + intOperandB + " is " + intDifference);
        System.out.println("The quotient using ints of " + intOperandA + " / " + intOperandB + " is " + intQuotient);
        System.out.println("The modulo using ints of " + intOperandA + " % " + intOperandB + " is " + intModulo);

        System.out.println();

        double doubleOperandA = 7.0;
        double doubleOperandB = 2.0;
        double doubleSum;
        double doubleProduct;
        double doubleDifference;
        double doubleQuotient;

        doubleSum = doubleOperandA + doubleOperandB;
        doubleProduct = doubleOperandA * doubleOperandB;
        doubleDifference = doubleOperandA - doubleOperandB;
        doubleQuotient = doubleOperandA / doubleOperandB;

        System.out.println("The sum using doubles of " + doubleOperandA + " + " + doubleOperandB + " is " + doubleSum);
        System.out.println("The product using doubles of " + doubleOperandA + " * " + doubleOperandB + " is " + doubleProduct);
        System.out.println("The difference using doubles of " + doubleOperandA + " - " + doubleOperandB + " is " + doubleDifference);
        System.out.println("The quotient using doubles of " + doubleOperandA + " / " + doubleOperandB + " is " + doubleQuotient);

        System.out.println();

        double myLunchCost = 15;
        int numberOfKidsInFamily = 3;
        boolean isRaining = false;
        double pricePerGallon = 2.75;
        int myFavoriteNumber = 21;
        double myShoeSize = 9;
        int birthMonth = 10;
        String fullName = "Samir Khatiwada";

        System.out.println("The cost of my lunch is: " + myLunchCost);
        System.out.println("Number of kids in my family: " + numberOfKidsInFamily);
        System.out.println("Is it raining? " + isRaining);
        System.out.println("The price of a gallon of gas is: $" + pricePerGallon);
        System.out.println("My favorite number is: " + myFavoriteNumber);
        System.out.println("My shoe size is: " + myShoeSize);
        System.out.println("My birth month (number) is: " + birthMonth);
        System.out.println("My full name is: " + fullName);
    }
}
