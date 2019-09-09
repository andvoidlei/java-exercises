package String;

public class ReverseString {


    public static void main(String[] args) {
        //System.out.println("abcabcbb".charAt(2));
        for(char a:reverseString(new char[]{'1', '2', '3'})) {
            System.out.println(a);
        }
    }


    public static char[] reverseString(char[] s) {

        String str = "";
        for (char a : s) {
            //System.out.println(a);
            str = String.valueOf(a) + str;
        }

        for(int i=0;i<str.length();i++){
            s[i]=str.charAt(i);
        }
        return s;
    }
}
