package String;


import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/**
 * 查找子字符串
 * 给定一个字符串，请你找出包含子字符串的开始位置。
 * <p>
 * 示例 1:
 * <p>
 * 输入: "aabcabcdb" "ab"
 * 输出: 1
 * 解释: 因为无重复字符的最长子串是 "abc"，所以其长度为 3。
 **/


public class SearchSubstring {

    public static void main(String[] args) {
        //System.out.println("abcabcbb".charAt(2));
        String str = "aabcabcdb";
        str.toCharArray();


        System.out.println(lengthOfLongestSubstring("aabcabcdb","ab"));

    }


    public static int lengthOfLongestSubstring(String s,String subStr) {

        int subIdx = 0;
        int idx = 0;
        int subStrLen = subStr.length();

        for (int i = 0;i < s.length();i++) {

            if(subIdx<subStrLen) {
                System.out.println(i + " " + subIdx + " " + subStrLen);
                if (s.charAt(i) == subStr.charAt(subIdx)) {
                    if(subIdx == 0) idx = i;
                    subIdx++;
                } else {
                    if (s.charAt(i) == subStr.charAt(0)) {
                        idx = i;
                        subIdx = 1;
                    } else {
                        subIdx = 0;
                    }

                    //idx = 0;
                }
            }
        }
        return idx;
    }



}
