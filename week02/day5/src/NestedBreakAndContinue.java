public class NestedBreakAndContinue {
    public static void main(String[] args) {
        int count = 0;
        monster: for (int i = 0; i < 3; i++) {
            inner: for (int j = 0; j < 4; j++) {
                for (int k = 0; k < 2; k++) {
                    count++;
                    System.out.println("i = " + i + ", j = " + j + ", k = " + k + ", count = " + count);
                    if (count == 4)
                        break inner;
                }
                if (count == 8) 
                   break monster;
            }
        }
        System.out.println("Count should be 5: " + count);
    }
}
