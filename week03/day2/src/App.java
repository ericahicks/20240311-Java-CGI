import com.skillstorm.Person;
/**
 * Program for practicing using constructors for classes that represent Entities
 * 
 * Examples
 * 1. Person - name
 * 2. Car - make, model, year
 * 2.5 JeepRangler
 *     - instance property: amount of gas in the tank
 *     - static property: size of gas tank
 * 3. Bank 
 *    - instance properties: list of customers, how much money is in the bank, name, address
 *    - static properties: account types, fdic insured true
 * 3.5 credit union 
 *    -static properties: fdic insured false
 * 4. House - squr ft, address, how many rooms, resident, pets
 * 5. Cat - breed, weight, fur color, spayed or neutered, name, owner
 *        - static: genus species, averageLifespan
 *        - instance: breed, age
 * 
 * Challenge: Make a class for one of these examples and a constructor
 */
public class App {
    public static void main(String[] args) throws Exception {
        ///////////////////////////
        // Example 1: Calling constructor
        // com.skillstorm.Person person = new com.skillstorm.Person();
        Person person1 = new Person("Erica");
        // System.out.println(person.name); // unknown

        //////////////////////////////
        // Example 2: Printing out contents
        System.out.println(person1); // prints out information about the reference by default
                                    // not the contents of the object
        System.out.println(person1.toString());

        ////////////////////////////
        // Example 3: Static vs instance properties
        System.out.println("> Creating a second person");
        Person person2 = new Person("Erin");
        System.out.println(person2); // should be population = 2
        System.out.println(person1);

        
        ////////////////////////////
        // Example 3: Static vs instance methods
        Person bob = new Person("bob");
        System.out.println(bob); // Person: bob
        System.out.println(bob.getName()); // Bob
    }


}
