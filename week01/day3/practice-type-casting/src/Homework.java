public class Homework {

    public static void main(String[] args) {
        int p1 = 5 + 7 % 6;
        System.out.println(p1);
        int p2 = 6 % 12;
        System.out.println(p2);
        // 3 % 5
        // 5 % 3
        // 5 % 5
        // 1 % -2
        // -1 % 2
        // -1 % -2
        // 0 % 2
        // 2 % 0
        // 6 * 2 % 6
        // 12 % 4
        // 7 % 3 % 2

        // Integer Arithmetic - Division Truncated
        System.out.println("Calculate side length of a square given a perimeter of of 1");
        int perimeter = 1;
        int side = perimeter / 4;
        System.out.println("The side length must be " + side); // prints 0

        // 2 workarounds
        // Method 1: Make one of the operands a double
        double correctSide = perimeter / 4.0;
        System.out.println("The side length must be " + correctSide);
        // Method 2: Use explicit casting
        correctSide = (double) perimeter / 4; // cast happens first then the division
        System.out.println("The side length must be " + correctSide);

        // Note: Casting happens before arithmetic
        double orangesPerPerson = 2.5;
        int people = 10;
        System.out.println("\nGiven there are " + orangesPerPerson + " oranges per person and " + people + " people.");
        int totalOranges = (int) orangesPerPerson * people;
        System.out.println("The total number of oranges is " + totalOranges);
        // corrected version
        int correctTotalOranges = (int) (orangesPerPerson * people);
        System.out.println("The correct total number of oranges is " + correctTotalOranges);
    }

}
