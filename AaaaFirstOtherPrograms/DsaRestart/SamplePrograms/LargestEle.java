public class LargestEle {
      public static int maxEle(int[] arr){
        int max = arr[0];
        for(int i = 1; i < arr.length; i++){
            if(max<arr[i]){
                max = arr[i];
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int[] arr = {2,5,8,6,4,7,9,16};
        
        System.out.println("Largest ele is : "+ maxEle(arr));
    }
}
