public class BinarySearch02 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        int key = 5;
        int s = 0;
        boolean flag = true;
        int e= arr.length-1;
        while(s<=e){
            int mid = (s+e)/2;
            if(arr[mid]==key){
                 System.out.print("found at index : "+mid);flag=false; break; 
                }
            else if (arr[mid]<key) s = mid+1;
            else if (arr[mid]>key) e = mid-1;
        }
        if(flag) System.out.println("Not Found");
        
    }
}
