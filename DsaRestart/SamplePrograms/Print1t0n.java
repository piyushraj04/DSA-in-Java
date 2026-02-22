import java.util.Scanner;
class Print1ton{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter year:");
        int n = sc.nextInt();
        for(int i = 1;i<=n;i++)
        {
            System.out.println(i);
        }
    }
}