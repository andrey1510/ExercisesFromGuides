public class PrimeNumber {
    private static final int range = 100;
    public static void main(String[] args) {
        int [] numbers = new int[range+1];
        for (int i1 = 0; i1 < range+1; i1++) {
            numbers[i1] = i1;
        }
        if (range >= 2) {
            System.out.println(2);
        }
        for (int i2 = 2; i2 < range+1; ++i2) {
            boolean tag = false;
            for (int i3 = 2; i3 < range+1; i3++) {
                if (i3 < i2) {
                    if (numbers[i2] % numbers[i3] == 0) {
                        tag = false;
                        break ;
                    } else {
                        tag = true;
                    }
                }
            }
            if (tag) {
                System.out.println(i2);
            }
        }
    }
}
