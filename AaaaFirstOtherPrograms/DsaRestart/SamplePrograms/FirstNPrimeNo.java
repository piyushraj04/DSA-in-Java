public class FirstNPrimeNo {

    public static boolean isPrime(int n){
        for(int i = 2; i <= Math.sqrt(n); i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
    
    public static void printPrime(int n){
        int m = 2;
        while(n>0){
            
            if(isPrime(m)){
                System.out.println(m);
                n--;
                m++;
            }
            else{
                m++;
            }
        }
    }

    public static void main(String[] args) {
        printPrime(4);
    }
}
