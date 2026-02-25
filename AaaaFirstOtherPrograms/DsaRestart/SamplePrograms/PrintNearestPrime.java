public class PrintNearestPrime {
    public static int nextPrime(int n){
        int inc = 1;
        for(int i = 2; i <= Math.sqrt(n+inc); i++){
            if((n+inc)%i==0){
                inc++;
            }else{
                if(isPrime(n+inc)){
                    return n+inc;
                }
                inc++;
            }
        }
        return -1;
    }

    public static int beforePrime(int n){
        int dec = 1;
        for(int i = 2; i <= Math.sqrt(n-dec); i++){
            if((n-dec)%i==0){
                dec--;
            }else{
                if(isPrime(n-dec)){
                    return n-dec;
                }
                dec--;
            }
        }
        return -1;
    }
    public static boolean isPrime(int n){
        for(int i = 2; i <= Math.sqrt(n); i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
    public static int nearestPrime(int n){

        if(isPrime(n)){
            return n;
        }

        int minD =nextPrime(n)-n;
        int maxD = n-beforePrime(n);

        if(minD<=maxD){
            return minD;
        }
        else{
            return maxD;
        }

    }
    public static void main(String[] args) {
        System.out.println(nearestPrime(81
            
        ));
    }
    
}
