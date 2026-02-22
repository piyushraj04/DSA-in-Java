public class PrintReverse {
    public static int printReverse(int n){
        
        int reverse = 0;
        while(n>0){
            int lastDigit = n%10;
            reverse = reverse * 10 + lastDigit;
            n = n / 10;
        }
        return reverse;
    }
    public static void main(String[] args) {
        int n = 546;
        System.out.print(printReverse(n));

    }
    
}
