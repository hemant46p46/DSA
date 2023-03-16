public class ArmstrongNumbers {
    public static void main(String[] args) {
        int n = 153;
        System.out.println(isArmstrong(n, order(n)));
    }
    private static boolean isArmstrong(int n, int len){
        int sum=0, temp, digits;
        temp = n;
        while(temp>0){
            digits = temp%10;
            sum += (int)Math.pow(digits, len);
            temp/=10;
        }
        return sum==n;
    }
    private static int order(int n){
        int order = 0;
        while(n>0){
            order++;
            n/=10;
        }
        return order;
    }
}
