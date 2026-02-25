public class NearestPrime {
        public static boolean isPrime(int n){
        for(int i = 2; i <= Math.sqrt(n); i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }

    public static int nextPrime(int next){
        
        while(!isPrime(next)){
            next++;
            if(isPrime(next)){
               return next;
            }
        }
        return -1;
    }

    //recursion approach to ignore while loop
      public static int nextPrime2(int next){
            next++;
            if(isPrime(next)){
               return next;
            }
        return nextPrime2(next);
    }

    

      public static int prevPrime(int prev){
        
        while(!isPrime(prev)){
            prev--;
            if(isPrime(prev)){
               return prev;
            }
        }
        return -1;
    }

    public static int nearestPrime(int n){
        if(isPrime(n)){
            return n;
        }
        int nextPrime = nextPrime(n);
        int prevPrime = prevPrime(n);

        int minD = nextPrime-n;
        int maxD = n-prevPrime;

        return (minD<maxD)?nextPrime:prevPrime;
    }
    public static void main(String[] args) {

        System.out.println(prevPrime(8));
        System.out.println(nextPrime(8));
        System.out.println(nearestPrime(32));

    }
}
