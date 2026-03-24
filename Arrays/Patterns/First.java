import java.util.Scanner;

public class First {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the 'n' value :->>>>>>>>");
        int n = sc.nextInt();

        // first
        // for(int i = 1; i <= n; i++){
        // for(int j = 1; j <= n; j++){
        // System.out.print("*"+" ");
        // }
        // System.out.println();
        // }

        // second
        // for (int i = 1; i <= n; i++) {
        // for (int j = 1; j <= i; j++) {
        // System.out.print("*" + " ");
        // }
        // System.out.println();
        // }

        // 3rd-
        // 1
        // 1 2
        // 1 2 3
        // 1 2 3 4
        // 1 2 3 4 5

        // for (int i = 1; i <= n; i++) {
        // for (int j = 1; j <= i; j++) {
        // System.out.print(j + " ");
        // }
        // System.out.println();
        // }

        // 4th
        // for (int i = 1; i <= n; i++) {
        // for (int j = 1; j <= i; j++) {
        // System.out.print(i + " ");
        // }
        // System.out.println();
        // }

        // 5th
        // * * * * *
        // * * * *
        // * * *
        // * *
        // *

        // for (int i = 1; i <= n; i++) {
        // for (int j = i; j <= n; j++) {
        // System.out.print("*" + " ");
        // }
        // System.out.println();
        // }

        // 6th
        // 1 2 3 4 5
        // 2 3 4 5
        // 3 4 5
        // 4 5
        // 5

        // for (int i = 1; i <= n; i++) {
        // for (int j = i; j <= n; j++) {
        // System.out.print(j + " ");
        // }
        // System.out.println();
        // }

        // 7th

        // for (int i = 1; i <= n; i++) {
        // for (int j = 1; j <= n - i; j++) {
        // System.out.print(" " + " ");
        // }
        // for (int j = 1; j <= i * 2 - 1; j++) {
        // System.out.print("*" + " ");
        // }
        // System.out.println();
        // }

        // 8th

        // for (int i = n; i >= 1; i--) {
        // for (int j = 1; j <= n - i; j++) {
        // System.out.print(" " + " ");
        // }
        // for (int j = 1; j <= i * 2 - 1; j++) {
        // System.out.print("*" + " ");
        // }
        // System.out.println();
        // }

        // 9th
        // for (int i = 1; i <= n; i++) {
        // for (int j = 1; j <= n - i; j++) {
        // System.out.print(" " + " ");
        // }
        // for (int j = 1; j <= i * 2 - 1; j++) {
        // System.out.print("*" + " ");
        // }
        // System.out.println();
        // }
        // for (int i = n; i >= 1; i--) {
        // for (int j = 1; j <= n - i; j++) {
        // System.out.print(" " + " ");
        // }
        // for (int j = 1; j <= i * 2 - 1; j++) {
        // System.out.print("*" + " ");
        // }
        // System.out.println();
        // }

        // 10th

        // for(int i = 1; i <= n;i++){
        // if(i<=n/2+1){
        // for(int j = 1;j<=i;j++){
        // System.out.print("*"+" ");
        // }
        // }
        // else{
        // //i==6
        // for(int j = 1; j <=n-i+1;j++){
        // System.out.print("*"+" ");
        // }
        // }
        // System.out.println();
        // }

        // 11th
        // for (int i = 1; i <= n; i++) {
        //     for (int j = 1; j <= i; j++) {
        //         if ((i + j) % 2 == 0) {
        //             System.out.print("1" + " ");
        //         } else {
        //             System.out.print("0" + " ");
        //         }
        //     }
        //     System.out.println();
        // }

        //12th
        // for(int i = 0; i <= n; i++){
        //     for(int j= 1; j <= i;j++){
        //         System.out.print(j+" ");
        //     }
        //     for(int j = 1;j<=(n-i)*2;j++){
        //         System.out.print(" "+" ");
        //     }
        //     for(int j= i;j>=1;j--){
        //         System.out.print(j+" ");
        //     }
        //     System.out.println();
        // }

        //13th
        // int a = 1;
        // for(int i = 1; i <= n; i++){
        //     for(int j = 1;j<=i;j++){
        //         System.out.print(a++ +" ");
        //     }
        //     System.out.println();
        // }

        //14th
        
        // for(int i = 0; i < n; i++){
        //     for(char j = 'A';j<='A'+i;j++){
        //         System.out.print(j +" ");
        //     }
        //     System.out.println();
        // }

        //15th
        // for(int i = n; i > 0; i--){
        //     for(char c = 'A'; c <= 'A'+i-1;c++){
        //         System.out.print(c + " ");
        //     }
        //     System.out.println();
        // }

        //16th
        for(char c = 'A'; c < ('A'+n);c++){
            for(char ch = 'A'; ch <= c;ch++){
                System.out.print(c + " ");
            }
            System.out.println();
        }


        

    }
}
