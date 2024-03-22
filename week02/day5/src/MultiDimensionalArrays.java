public class MultiDimensionalArrays {
    public static void main(String[] args) {
        //                  cols  0  1  2
        int[][] listsOfnums = { { 1, 2, 3, 4 }, // row 0
                                { 4, 5, 6},  // row 1
                                { 7, 8 }, // row 2
                                { 10 } }; // row 3
        int[][][] nums2 = new int[1][2][3];
        // int row2col2 = listsOfnums[2][2];
        // System.out.println(row2col2); // 9
        // for (int[] nums : listsOfnums) {
        //     for (int num : nums) {
        //         System.out.print(num + " ");
        //     }
        //     System.out.println();
        // }
        // for (int i = 0; i < 3; i++) {
        //     // How do I get the number of elements in the inner array?
        //     int[] innerArray = listsOfnums[i];
        //     int numElements = innerArray.length;
        //     for (int j = 0; j < numElements; j++) {// 3; j++) {
        //         System.out.print(listsOfnums[i][j] + " ");
        //     }
        //     System.out.println();
        // }
        // How can I stop hard coding the number of times the outer loop runs?
        //  --> get the number of elements in the outer array
        //  --> name of the array is listsOfnums
        for (int i = 0; i < listsOfnums.length; i++) {
            // How do I get the number of elements in the inner array?
            for (int j = 0; j < listsOfnums[i].length; j++) { // 3; j++) { don't hardcode number of times inner loops runs
                System.out.print(listsOfnums[i][j] + " ");
            }
            System.out.println();
        }
    }
}
