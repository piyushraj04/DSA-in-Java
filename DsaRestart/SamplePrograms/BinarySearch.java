public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {10,20,30,40,50};
        int s = 0;
        int e = arr.length-1;
        // int m = (s+e)/2;
        int find = 40;
        while(s<=e){
            int m = (s+e)/2;
            if(arr[m]==find){
                System.out.println("find at :"+m);
                break;
            }
            else if(arr[m]>find){
               e=m-1;
            }
            else
            {
                s = m+1;
            }
        }
    }
}
