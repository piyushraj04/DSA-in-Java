package Arrays.Practice;

public class Merge{

    public static int[] merge(int[] arr, int[] arr2){

        int arrNew[] = new int[arr.length+arr2.length];

        for(int i = 0; i< arrNew.length;i++){
            if(i<arr.length){
                arrNew[i] = arr[i];
            }
            else{
                arrNew[i] = arr2[i-arr.length];
            }
        }

        return arrNew;
    }

    public static void main(String[] args) {
        int arr[] = {1,2,3};
        int arr2[] = {4,5,6,7};

        int[] newArr = merge(arr, arr2);
        for(int el:newArr){
            System.out.print(el+" ");
        }

    }
}