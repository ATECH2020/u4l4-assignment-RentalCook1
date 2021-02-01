public class Primes {
    public static int countFactors(int n){
        int factors = 0;
        
        for(int divNum = 1; divNum<=n; divNum++ ){
            if(n%divNum==0){
                factors++;
            }
            
        }
        return factors;
    }

    public static boolean isPrime(int n){
        boolean prime = true;
        int root = (int) Math.sqrt(n);
        for(int divNum = 2; divNum<=root; divNum++ ){
            if(n%divNum==0){
                prime = false;
            }
            
        }
        return prime;
    }

    public static int countPrimes(int n){
        int numPrimes = 0;
        for(int i=2;i<n;i++){
          if(isPrime(i)){
            numPrimes++;
           
          }
        }
        return numPrimes;
    }
}
