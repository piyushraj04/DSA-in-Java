package Arrays.Practice;

public class ReplaceByNextPrime {
    public static boolean isPrime(int n) {
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static int nextPrime(int n) {
        n++;
        while (true) {
            if (isPrime(n)) {
                return n;
            } else {
                n++;
            }
        }
    }

    public static int[] replaceByNextPrice(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = nextPrime(arr[i]);
        }
        return arr;
    }

    public static void main(String[] args) {
        int arr[] = { 7, 15, 20 };
        replaceByNextPrice(arr);

        for (int el : arr) {
            System.out.print(el + " ");
        }
    }

}
