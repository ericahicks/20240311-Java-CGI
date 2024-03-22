public class BreakAndContinue {

    public static void main(String[] args) {
        String[] birds = {"duck", "duck", "duck", "goose", "duck", "duck"};
        for (String bird : birds) {
            if (bird.equals("goose"))
                continue; // break; stops the loop whereas continue skips the rest of this iteration
            System.out.println(bird);
        }
    }

    // Rewrite all positives using a break statement
    public static boolean allPositives(int[] nums) {
        boolean result = true;
        for (int num : nums) {
            if (num < 0) {
                result = false;
                break;
            }
        }
        return result;
    }
    
}
