package classroom;

import java.util.Arrays;

public class PrimitiveTypes {
    public static void main(String[] args) {

//        Floating point example

        // Float
        float floatExample = 999999.8F;
        System.out.println(floatExample);
        System.out.println(999999.8F);

        // Double
        double doubleExample = 2000000.9876D;
        System.out.println(doubleExample);
        System.out.println(2000000.9876D);

//        Integral example

        // Byte
        byte handCount = 2;
        System.out.println(handCount);
        System.out.println(Byte.MIN_VALUE);
        System.out.println(Byte.MAX_VALUE);

        // Short
        short distanceBetweenKievAndRiga = 1011;
        System.out.println(distanceBetweenKievAndRiga);

        // Integer
        int populationOfLatvia = 1900000;
        System.out.println(populationOfLatvia);

        // Long
        long currentWorldPopulation = 7900000000L;
        System.out.println(currentWorldPopulation);

        // Char
        char ch = '\u03A9';
        char pUnicode = '\u0070';
        char[] arrayOfChars = {'a', 'b', 'c'};
        System.out.println(Arrays.toString(arrayOfChars));
        char p = 'p';
        System.out.println(ch);
        System.out.println(p);


        int[] arrayOfPeopleAges = {21, 22, 23, 24};
        System.out.println(Arrays.toString(arrayOfPeopleAges));

        // String variables

        String myName = "Nikita";
        System.out.println(myName);

        String loremIpsum = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Aenean tempus pharetra iaculis. Quisque at feugiat sem.";
        System.out.println(loremIpsum);

        String mySurname = "Milka";

//        String myNameAndUsername = myName + mySurname;
//        String myNameAndUsername = myName + " " + mySurname;
//        System.out.println(myNameAndUsername);

        // %s = string
        // %d = int

        System.out.printf("My name is %s. My surname is %s.\n", myName, mySurname);
        System.out.println("My name is " + myName + "." + " " + "My surname is " + mySurname + ".");


        // Operators

        int sumOfTwoNumbers = 10 + 30;
        System.out.println(sumOfTwoNumbers);

        System.out.println(5 + 10);
        System.out.println("5 + 10");

        int a = 30;
        int b = 5;

        System.out.println(a / b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(a + b);

        System.out.println(9 % 4);

        // 4 4 = 8
        // Result: 1

        float doubleDivision = 100 / 13F;
        System.out.println(doubleDivision);
    }
}
