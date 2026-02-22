public class SubArray {
    public static void subArr(int[] arr) {
        int ts = 0;
        int max = arr[0];
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {

            for (int j = i; j < arr.length; j++) {
                int sum = 0;
                for (int k = i; k <= j; k++) {
                    System.out.print(arr[k] + " ");
                    sum = sum + arr[k];

                }
                System.out.println(" : " + "Subarray Sum = " + sum);
                System.out.println();
                ts++;
                if (max < sum)
                    max = sum;
                if (min > sum)
                    min = sum;

            }
            System.out.println();
        }
        System.out.println("Max SubArray Sum = " + max);
        System.out.println("Min SubArray sum = " + min);
        System.out.println("Total subarrays = " + ts);

    }

    public static void main(String[] args) {
        int[] arr = { 1, -2, 6, -1, 3 };
        subArr(arr);
    }
}
