import java.util.Scanner;

public class Con01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("enter");
            int n = sc.nextInt();
            if (n % 10 == 0) {
                System.out.println("out of loop");
                break;
            }

            System.out.println(n);
        }

    }
}
