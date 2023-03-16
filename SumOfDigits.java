public class SumOfDigits {
    public static void main(String[] args) {
        int n = 12574;
        System.out.println(digitSum(n));
    }
    private static int digitSum(int n){
        int sum = 0, rem;
        while(n>0){
            rem = n%10;
            sum += rem;
            n/=10;
        }
        return sum;
    }
}
