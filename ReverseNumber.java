public class ReverseNumber {
    public static void main(String[] args) {
//        System.out.println(reverseNumber(1350790));

    }
    private static int reverseNumber(int n){
        int rev = 0, rem;
        while(n>0){
            rem = n%10;
            rev = (rev*10) + rem;
            n /= 10;
        }
        return rev;
    }
}