import java.util.Scanner;

public class InputOnArr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0 ; i < n ; i++){
            System.out.println("Enter the value for index :"+i);
            arr[i] = sc.nextInt();
        }

        for(int ele:arr){
            System.out.print(ele+" ");
        }
        sc.close();
    }
}
