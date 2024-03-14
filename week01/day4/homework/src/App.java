import java.util.Scanner;

import com.skillstorm.Example;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        Example example1 = new Example();
        // System.out.println(example1.z); // z only exists inside the method inside the class

        // Create another instance of the example class
        Example example2 = new Example();
        System.out.println("example2:");
        System.out.println(example2.x);
        // System.out.println(example2.y);
        System.out.println(Example.y);

        System.out.println("Change the values of example2.x = 10 and example2.y = 20. What happnes?");
        example2.x = 10;
        // example2.y = 20;
        Example.y = 20;

        
        System.out.println("example1:");
        System.out.println(example1.x);
        // System.out.println(example1.y);
        System.out.println(Example.y);
        
        System.out.println("example2:");
        System.out.println(example2.x);
        // System.out.println(example2.y);
        System.out.println(Example.y);

        in.close();
    }
    
    
}
