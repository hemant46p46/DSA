public class BinaryToDecimals {
    public static void main(String[] args) {
        binToDec(101);
        octToDec(512);
        decToBin(14);
    }
    private static void decToOct(int dec){
        int[] octal = new int[8];
        int i=0;
        while(dec>0){
            int r = dec%8;
            octal[i++] = r;
            dec/=8;

        }
        for(int j=i-1;j>=0;j--){
            System.out.println(octal[j]);
        }
        System.out.println();
    }
    private static void decToBin(int dec){
        int[] binary = new int[32];
        int i=0;
        while(dec>0){
            int r = dec%2;
            binary[i++] = r;
            dec /= 2;
        }
        for(int j=i-1;j>=0;j--){
            System.out.print(binary[j]);
        }
        System.out.println();

    }
    private static void hexToDec(String hex) {

    }
    private static void octToDec(int oct){
        System.out.println("Octal : " + oct);
        int dec = 0, count=0;
        while(oct>0){
            int temp = oct%10;
            dec += temp*Math.pow(8, count);
            count++;
            oct /= 10;
        }
        System.out.println("Decimal : " + dec);
    }
    private static void binToDec(int bin){
        int dec = 0, count=0;
        System.out.println("Binary : " + bin);
        while(bin>0){
            int temp = bin%10;
            dec += temp*Math.pow(2, count);
            count++;
            bin/=10;
        }
        System.out.println("Decimal : " + dec);
    }
}
