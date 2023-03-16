public class HCF {
    public static void main(String[] args) {
        System.out.println(hcf1(12, 16));
        System.out.println(hcf2(12, 16));
        System.out.println(hcf3(12, 16));
        hcf4(12, 16);

        System.out.println(hcfOfArray(new int[]{12, 50, 40, 30}));
    }

    private static int hcfOfArray(int[] arr){
        int hcf = hcf2(arr[0], arr[1]);
        for(int i=2;i<arr.length;i++){
            hcf = hcf2(hcf, arr[i]);
        }
        return hcf;
    }
    private static int hcf3(int a, int b){
        return b==0?a:hcf3(b, a%b);
    }
    private static void hcf4(int a, int b){
        a = (a>0)?a:-a;
        b = (b>0)?b:-b;
        while(a!=b){
            if(a>b){
                a-=b;
            }else{
                b-=a;
            }
        }
        System.out.println(a);
    }
    private static int hcf2(int a, int b){
        while(a!=b){
            if(a>b){
                a-=b;
            }else{
                b-=a;
            }
        }
        return a;
    }
    private static int hcf1(int a, int b){
        int hcf=1;
        int min = Math.min(a, b);
        for(int i=1;i<=min;i++){
            if(a%i==0 && b%i==0){
                hcf = i;
            }
        }
        return hcf;
    }
}
