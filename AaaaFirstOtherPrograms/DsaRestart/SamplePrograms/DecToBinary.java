import java.util.Scanner;

public class DecToBinary {

    public static int binRep(int n) {
        int res = 0;

        if (n == 0)
            return 0;
        while (n > 0) {
            res = res * 10 + (n % 2);
            n = n / 2;
        }
        int bin = reverseNum(res);
        return bin;
    }

    public static int reverseNum(int res) {
        int rev = 0;
        while (res > 0) {
            rev = rev * 10 + (res % 10);
            res = res / 10;
        }
        return rev;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number : ");
        int n = sc.nextInt();
        System.out.println("The Binary representation of this number is : " + binRep(n));
        sc.close();
    }

}