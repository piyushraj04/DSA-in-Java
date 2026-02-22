public class ReverseArray {

    public static void reverseArr(int[] arr) {
        int firstIndex = 0;
        int lastIndex = arr.length - 1;
        int temp;
        for (int i = 0; i < arr.length; i++) {
            if (firstIndex == lastIndex || firstIndex > lastIndex) {
                return;
            } else {
                temp = arr[firstIndex];
                arr[firstIndex] = arr[lastIndex];
                arr[lastIndex] = temp;
                firstIndex++;
                lastIndex--;
            }
        }

    }


    private static void reverseArr2(int[] arr)
    {
        int f = 0; 
        int l = arr.length-1;
        while(f<l){
            int temp = arr[f];
            arr[f] = arr[l];
            arr[l]=temp;
            f++;
            l--;
        }
        return;
    }

    public static void main(String[] args) {

        int[] arr = { 2, 4, 6, 8, 10, 12,14 ,16,18,20};
        reverseArr(arr);
        for (int ele : arr) {
            System.out.print(ele + " ");
        }
        System.out.println(Pa);
        System.out.println("Approach 2");
        reverseArr2(arr);
        for(int ele : arr)
        {
            System.out.print(ele+" ");
        }

    }
}
