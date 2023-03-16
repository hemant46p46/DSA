public class LCM {
    public static void main(String[] args) {
        System.out.println(getLCM(36, 60));
        System.out.println(getLCM1(36, 60));
        System.out.println(getLCM2(36, 60));

    }
    private static int getLCM2(int a, int b){
        return (a*b)/hcf(a, b);
    }
    private static int hcf(int a, int b){
        return b==0?a:hcf(b, a%b);
    }
    private static int getLCM1(int a, int b){
        int lcm = 1, max=Math.max(a, b);
        for(int i=max;i<=a*b;i+=max){
            if (i % a == 0 && i % b == 0) {
                lcm = i;
                break;
            }
        }
        return lcm;
    }
    private static int getLCM(int a, int b){
        int max = Math.max(a, b), lcm=1;
        for(int i=max;i<=a*b;i++){
            if(i%a==0 && i%b==0){
                lcm = i;
                break;
            }
        }
        return lcm;
    }
}
