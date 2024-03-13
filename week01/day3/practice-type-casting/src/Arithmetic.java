public class Arithmetic {

    public static void main(String[] args) {
        int x = 10; // 
        int y = ++x; // y = (x = x + 1);
        System.out.println(x + ", " + y);

        // order of operations
        int sum = 1 + 2 % 3; // 1 + 2 * 3;
        System.out.println("\nsum = " + sum);

        // assignment operators (shorthand)
        int num = 20;
        // num *= 100; // num = num * 100 = 20 * 100 = 2000
        num /= 10; // num = num / 10 = 20 / 10 = 2
        System.out.println("\nnum = " + num);

        // nested equation
        int i, j, k;
        i = 1;
        j = 1 + (k = 2);

        int side = 10;
        double area = Math.pow(side, 2);
        System.out.println("\nArea of a square with side length 10 is " + area);
        System.out.println();
        int a = 1;
        int b = a++; // b becomes 1 and a = a + 1 = 2
        System.out.println(a + ", " + b); // 2, 1

        a = 1;
        b = ++a; // b becomes 2 and a = a + 1 = 2
        System.out.println(a + ", " + b); // 2, 2
    }
}
