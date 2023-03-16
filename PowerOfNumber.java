public class PowerOfNumber {
    public static void main(String[] args) {
        System.out.println(powerN(2, 4));
    }
    private static int powerN(int base, int expo){
        int res = 1;
        while(expo>0){
            res *= base;
            expo--;
        }
        return res;
    }
}
