public class PrefixSum {
    public static void prefixArr(int[] arr) {

        int max = arr[0];
        int min = arr[0];
        int sum = 0;
        int[] prefix = new int[arr.length];

        prefix[0] = arr[0];
        for (int i = 1; i < prefix.length; i++) {
            prefix[i] = prefix[i - 1] + arr[i];
        }

        for (int i = 0; i < arr.length; i++) {

            for (int j = i; j < arr.length; j++) {
                sum = (i == 0) ? prefix[j] : prefix[j] - prefix[i - 1];
                if (max < sum)
                    max = sum;
                if (min > sum)
                    min = sum;

            }
            System.out.println();
        }
        System.out.println("Max SubArray Sum = " + max);
        System.out.println("Min SubArray sum = " + min);

    }

    public static void main(String[] args) {
        int[] arr = { 1, -2, 6, -1, 3 };

        prefixArr(arr);

    }
}
