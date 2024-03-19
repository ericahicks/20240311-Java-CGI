import java.util.Scanner;

public class App {

    public static void main(String[] args) throws Exception {
        System.out.println("Let's see if it's a good time to bike to the library");
        Scanner scanner = new Scanner(System.in);
        boolean open, weather;
        
        open = libraryOpen(scanner);
        if (!open) {
            System.out.println("Nope, the libary is not open.");
        } else { // is open
            weather = goodWeather(scanner);
            if (!weather) {
                System.out.println("Nope, it is raining.");
            } else {
                System.out.println("Yes! You should bike to the library. Have a nice ride :)");
            }
        }

        scanner.close();
    }

    // Open 10am - 8pm
    public static boolean libraryOpen(Scanner scanner) {
        System.out.println("What time is it? (Use military time 0-2400)");
        int time = scanner.nextInt();
        scanner.nextLine(); // as soon read in number, clear the buffer with nextLine()
        if (time >= 1000 && time < 2000) {
            return true;
        }  // else keywork optional because if return statement ends the method
        return false;
    }

    public static boolean goodWeather(Scanner scanner) {
        System.out.println("Is it raining? (yes or no)");
        String response = scanner.nextLine();
        if ( response.equalsIgnoreCase("yes") ) {
            return false;
        }
        return true;
    }
}
