public class CharExamples {


    public static void main(String[] args) {
        char c1 = 'a';
        char c2 = 'b';

        // Example 1
        // You can treat a char as a number
        short s = (short) c1;
        System.out.println(c1 + " is " + s);
        s = (short) c2;
        System.out.println(c2 + " is " + s);

        
        // Example 2
        // You can convert a number to a character
        s = 100;
        char c3 = (char) s;
        System.out.println(s + " is " + c3);

        // Example 3
        // Converting char -> short -> char
        char e = 'e';
        char h = 'h';
        char l = 'l';
        char p = 'p';
        /* short */ s = (short)(e + 5); // (short) int;
        char eRotated5 = (char) (e + 5);
        char hRotated5 = (char) (h + 5);
        char lRotated5 = (char) (l + 5);
        char pRotated5 = (char) (p + 5);
        System.out.println("e rotated by 5 is " + eRotated5);
        System.out.println("help encoded is " + hRotated5 + eRotated5 + lRotated5 + pRotated5);
    }
}
