public class Star {
    public static void main(String[] args) {
        int n = 4;
        for(int i = 1; i <= n; i++)
        {
            for(int j = 1; j<=n;j++)
            {
                if((i+j)<=n)
                {
                    System.out.print(" "+" ");
                }
            }
            for(int j = 1 ; j <= (2*i-1) ; j++)
            {
                System.out.print("*"+" ");
            }
            System.out.println();
        }

        for(int i = 4;  i > 0 ; i--)
        {
            for(int j = 1; j <= n ; j++)
            {
                if((i+j)<=n){
                    System.out.print(" "+" ");
                }
            }
            for(int j = 1 ; j<= (2*i-1); j++)
            {
                System.out.print("*"+" ");
            }
            System.out.println();
        }
    }
}
