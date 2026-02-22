public class Sqaure {
    public static void printSq(int n)
    {
        for(int i = 1 ; i <= n ; i++)
        {
            for(int j = 1; j <= n ; j++)
            {
                System.out.print("*"+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int n = 4;
        printSq(n);
    }
    
}
