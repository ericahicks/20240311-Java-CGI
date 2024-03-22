public class NestedLoops {

    public static void main(String[] args) {
        int count = 0;
        for (int i = 0; i < 3; i++) {
            System.out.println("i is " + i);
            for (int j = 0; j < 4; j++) {
                System.out.println("  j is " + j);
                for (int k = 0; k < 2; k++) {
                    System.out.println("      k is " + k);
                    count++;
                }
            }
        }
        // for (int i = 0; i < 3; i++) {
        //     System.out.println("i is " + i);
        //     for (int j = 0; j < 4; j++) {
        //         System.out.println("  j is " + j + ", count is " + count);
        //         count++;
        //     }
        // }
        // In general, the inner loop runs i x j times
        System.out.println("How many total times does the inner loop run? " + count); 

        

    }

}
