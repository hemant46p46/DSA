public class FactorOfNumber {
    public static void main(String[] args) {
        factors(10);
    }
    private static void factors(int n){
        for(int i=1;i<=n;i++){
            if(n%i==0){
                System.out.print(i + " ");
            }
        }
    }
}
