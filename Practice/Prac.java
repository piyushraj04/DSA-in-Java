public class Prac {
    public static void main(String[] args) {
        int[] arr = {10,15,5,20,2,4};
        int max = arr[0];
        int sMax = arr[0];

        for(int i = 1; i < arr.length;i++)
        {
            if(max<arr[i]){
                max= arr[i];
            }
            

        }
        for(int i = 1; i < arr.length;i++)
        {
            if(sMax<arr[i]&&arr[i]<max){
                sMax= arr[i];
            }
        }
        System.out.println(sMax);
        
    }
}
