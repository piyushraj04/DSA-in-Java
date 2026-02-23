public class PrintNthPrimeNo {

    public static boolean isPrime(int n) {
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static int printNthPrime(int n) {
        int m = 2;
        while (n > 0) {

            if (isPrime(m)) {
                if (n == 1)
                    return m;
                m++;
                n--;

            } else {
                m++;
            }
        }
        return -1;

    }

    public static void main(String[] args) {

        System.out.println(printNthPrime(7));
    }

}
