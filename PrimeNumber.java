public class PrimeNumber {
    public static void main(String[] args) {
        primeInRange(20, 100);
    }
    private static void primeInRange(int a, int b){
        for(int i=a;i<=b;i++){
            if(isPrime(i)){
                System.out.print(i + " ");
            }
        }
    }
    private static boolean isPrime(int n){
        if(n==1 || n==2){
            return true;
        }
        for(int i=2;i<=n/2;i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
}
