package String;

public class LongestCommonPrefix {


    public static void main(String[] args) {
        //System.out.println("abcabcbb".charAt(2));
        System.out.println(longestCommonPrefix(new String[]{"aa","a"}));

    }


    public static String longestCommonPrefix(String[] strs) {
        int len = strs[0].length();
        String longest = "";

        for (int i =0;i<len;i++){
            for(int j = 1;j<strs.length;j++){
                System.out.println(i);
                if(i<strs[j].length()){
                if((!strs[0].substring(0, i+1).equals(strs[j].substring(0, i+1)))){
                    return longest;
                }}else{
                    return longest;
                }
            }
            longest = strs[0].substring(0, i+1);
        }
        return longest;
    }

}
