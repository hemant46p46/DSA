public class ToggleEachChar {
    public static void main(String[] args) {
        String s= "HemAnt";
        toggle(s);
    }
    private static void toggle(String s){
        String s1 = "";
        for(int i=0;i<s.length();i++){
            if(Character.isUpperCase(s.charAt(i))){
                s1 += Character.toLowerCase(s.charAt(i));
            }else{
                s1 += Character.toUpperCase(s.charAt(i));
            }
        }
        System.out.println(s1);
    }
}
