public class FibonacciNumbers {
    public static void main(String[] args) {
        int n = 15;
        usingMethod(n);
        System.out.println("\n" + usingRecursion(n));
        System.out.println("\n" + usingDP(n));
    }
    private static int usingDP(int n){
        int[] dp = new int[n];
        dp[0] = 0;
        dp[1] = 1;
        for(int i=2;i<n;i++){
            dp[i] = dp[i-1] + dp[i-2];
        }
        for(int i:dp){
            System.out.print(i + " ");
        }
        return dp[n-1];
    }
    private static int usingRecursion(int n){
        if(n==0 || n==1){return n;}
        else{
            return usingRecursion(n-2)+usingRecursion(n-1);
        }
    }
    private static void usingMethod(int n){
        int a = 0, b = 1, nextTerm;
        if(n==1){
            System.out.println(a);
        }else if(n==2){
            System.out.println(b);
        }else{
            System.out.print(a + " " + b + " ");
            for(int i=3;i<=n;i++){
                nextTerm = a+b;
                System.out.print(nextTerm + " ");
                a = b;
                b = nextTerm;
            }
        }
    }
}
