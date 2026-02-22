import java.util.Scanner;

class P01{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int even = 0;
        int odd = 0;
        int cnt = 0;
        while(cnt<=10)
        {
            cnt++;
            System.out.println("enter : ");

            int n = sc.nextInt();

            if(n%2==0)
            {
                even+=n;
            }
            else
            {
                odd+=n;
            } 
        }
        System.out.println(even + " is sum of even no");
        System.out.println(odd + " is sum of odd no");
    }
}