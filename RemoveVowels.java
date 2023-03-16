public class RemoveVowels {
    public static void main(String[] args) {
        removeVowels("Hemant Patel");
    }
    private static void removeVowels(String s){
        String s1 = s.replaceAll("[aeiou]", "");
        System.out.println(s1);
    }
}
