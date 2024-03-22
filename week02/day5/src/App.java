public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Salsa Ingredients: ");
        String[] salsaIngredients = { "tomato", "jalapeno", "onion", "lemon juice", "salt" };
        // Iterate through an array using while loop
        int index = 0;
        // while (index < salsaIngredients.length) {
        // // Access each element using the index
        // String ingredient = salsaIngredients[index];
        // System.out.println((index + 1) + ". " + ingredient);
        // index++;
        // }
        // Iterate backwards through an array
        index = salsaIngredients.length - 1;
        while (index >= 0) {
            String ingredient = salsaIngredients[index];
            System.out.println((salsaIngredients.length - index) + ". " + ingredient);
            index--;
        }
        // Use a while loop to search an array for negatives
        int[] nums = { 1, 2, 3 }; // true
        System.out.println(allPositives(nums));
        int[] nums2 = { 1, 2, -1 }; // false
        System.out.println(allPositives(nums2));
        int[] nums3 = {}; // true
        System.out.println(allPositives(nums3));
        int[] nums4 = null; // true
        System.out.println(allPositives(nums4));
    }

    // Use a while loop to search an array for negatives
    // searching forwards through the array of numbers
    // returns true if no elements or array is null
    public static boolean allPositives(int[] nums) {
        // guard clause
        if (nums != null && nums.length != 0) { // short circuit prevents null pointer exception 
                                                // because nums.length doesn't run
            int index = 0;
            while (index < nums.length) {
                if (nums[index] < 0)
                    return false;
                index++;
            }
        } // when the if contains a return statement, the else keyword is optional
        return true;
    }
}
