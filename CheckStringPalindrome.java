import java.util.Arrays;

public class CheckStringPalindrome {
    public static void main(String[] args) {
//        System.out.println(isPalindrome("ckckc"));

        String s = "hello sir my";
        System.out.println(reverseStringWordWise(s));
//        String[] s1 = s.split(" ");
//        System.out.println(Arrays.toString(s1));
    }
    static String reverseStringWordWise(String input) {
        // Write your code here
        String[] arr = input.split(" ");
        int start=0, end=arr.length-1;
        while(start < end) {
            String temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        StringBuilder sb = new StringBuilder();
        for(String s:arr){
            sb.append(s).append(" ");
        }
        return sb.toString().trim();
    }

    static String removeAllOccurrencesOfChar(String input, char c) {
        // Write your code here
        String[] arr = input.split(String.valueOf(c));
        StringBuilder sb = new StringBuilder();
        for(String s:arr){
            sb.append(s);
        }
        return sb.toString();
    }

    private static boolean isPalindrome(String s){
        StringBuilder sb = new StringBuilder(s);
        sb.reverse();
        return s.equals(sb.toString());
    }
}
