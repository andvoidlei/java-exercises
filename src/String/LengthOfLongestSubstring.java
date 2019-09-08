package String;


import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/**
 * 无重复字符的最长子串
 * 给定一个字符串，请你找出其中不含有重复字符的 最长子串 的长度。
 * <p>
 * 示例 1:
 * <p>
 * 输入: "abcabcbb"
 * 输出: 3
 * 解释: 因为无重复字符的最长子串是 "abc"，所以其长度为 3。
 * 示例 2:
 * <p>
 * 输入: "bbbbb"
 * 输出: 1
 * 解释: 因为无重复字符的最长子串是 "b"，所以其长度为 1。
 * 示例 3:
 * <p>
 * 输入: "pwwkew"
 * 输出: 3
 * 解释: 因为无重复字符的最长子串是 "wke"，所以其长度为 3。
 * 请注意，你的答案必须是 子串 的长度，"pwke" 是一个子序列，不是子串。
 **/


public class LengthOfLongestSubstring {

    public static void main(String[] args) {
        //System.out.println("abcabcbb".charAt(2));
        System.out.println(lengthOfLongestSubstring("aabcabcdb"));
        System.out.println(lengthOfLongestSubstring2("aabcabcdb"));
        System.out.println(lengthOfLongestSubstring3("aabcabcdb"));
        System.out.println(lengthOfLongestSubstring4("aabcabcdb"));

    }


    public static int lengthOfLongestSubstring(String s) {

        int[] hash = new int[500];
        int max = 0;
        int i = 0, j = 0;
        int O = 0;

        while (i < s.length() && j < s.length()) {
            O++;
            if (hash[s.charAt(j)] == 0) {
                hash[s.charAt(j)] = 1;
                j++;
                max = (j - i) > max ? (j - i) : max;
            } else {
                hash[s.charAt(i)] = 0;
                i++;
            }
        }
        System.out.println("O:" + O);
        return max;
    }


    public static int lengthOfLongestSubstring2(String s) {

        String tempStr = "";
        int max = 0;
        int i = 0, j = 0;
        int O = 0;

        while (i < s.length() && j < s.length()) {
            O++;
            if (!tempStr.contains(String.valueOf((s.charAt(j))))) {
                tempStr = tempStr + s.charAt(j);
                j++;
                max = (j - i) > max ? (j - i) : max;
            } else {
                tempStr = "";
                i++;
                j = i;
            }
        }
        System.out.println("O:" + O);
        return max;
    }

    public static int lengthOfLongestSubstring3(String str)
    {
        int resLength = 0;
        int strLength = str.length();
        int i = 0, j = 0;
        HashSet<String> hashSet = new HashSet<String>();
        int O = 0;


        while (i < strLength && j < strLength)
        {
            O++;
            String oneStrJ = str.substring(j,j+1);
            if (!hashSet.contains(oneStrJ))
            {
                hashSet.add(oneStrJ);
                j++;
                resLength = Math.max(resLength,j-i);
            }
            else
            {
                String oneStrI = str.substring(i, i+1);
                hashSet.remove(oneStrI);
                i++;
            }
        }
        System.out.println("O:" + O);

        return resLength;
    }


    public static int lengthOfLongestSubstring4(String s) {
        int n = s.length(), ans = 0;
        Map<Character, Integer> map = new HashMap<>(); // current index of character
        int O =0;
        // try to extend the range [i, j]
        for (int j = 0, i = 0; j < n; j++) {
            O++;
            if (map.containsKey(s.charAt(j))) {
                i = Math.max(map.get(s.charAt(j)), i);
            }
            ans = Math.max(ans, j - i + 1);
            map.put(s.charAt(j), j + 1);
        }
        System.out.println("O:" +O);
        return ans;
    }

}
