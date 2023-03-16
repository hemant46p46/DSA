public class PrimeFactors {
    public static void main(String[] args) {
        int n = 90;
        primeFactor(n);
        primeFactor1(n);
    }
    private static void primeFactor1(int n){
        int temp;
        System.out.println();
        for(int i=2;i<=n;i++){
            if(isPrime(i)){
                temp = n;
                while(temp%i==0){
                    System.out.print(i + " ");
                    temp = temp/i;
                }
            }
        }
    }

    private static boolean isPrime1(int n){
        for(int i=2;i<=n/2;i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }

    private static void primeFactor(int n){
        int tempN;
        for(int i=2;i<=n;i++){
            if(isPrime(i)){
                tempN = n;
                while(tempN%i==0){
                    System.out.print(i + " ");
                    tempN = tempN/i;
                }
            }
        }
    }
    private static boolean isPrime(int n){
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
}
