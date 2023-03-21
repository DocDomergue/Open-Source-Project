public class sum_even_fibonacci {
    public static void main(String[] args) {
        int a = 1, b = 0;
        int sumEven = 0;
        // Bug fixed: operand > was used instead of < which created an infinite loop
        while (b < 4000000) {
            if (b / 2 == 0) {
                sumEven += b;
            }
            int temp = b;
            b = a + b;
            a += temp;
        }
        System.out.println(sumEven);
    }
}

// answer should be 4613732
