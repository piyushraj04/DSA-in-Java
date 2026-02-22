public class LinearSearch {
    public static int linearSearch(int[] arr,int key){
        for(int i = 0; i < arr.length; i++){
            if(arr[i]==key){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {2,5,8,6,4,7,9,16};
        int key = 9;
        System.out.println("Key has been found at index : "+ linearSearch(arr, key));
    }
}
