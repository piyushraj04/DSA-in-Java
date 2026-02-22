public class Pallindrom {
    public static boolean isPallindrome (int no){
        int rev = 0;
        int org = no;
        while(no>0){
            int lastDig = no%10;
            rev = rev*10+lastDig;
            no = no/10;
        }
        return org==rev;
    }
    public static void main(String[] args) {
        System.out.println(isPallindrome(123));
        
    }
}
