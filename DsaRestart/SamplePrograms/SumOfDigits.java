public class SumOfDigits {
    public static int sumOfDigits(int no){
        int sum  = 0;
        while(no>0){
            sum+=no%10;
            no = no/10;
        }
        return sum;
    }
    public static void main(String[] args) {
        System.out.println(sumOfDigits(123));
    }
}
