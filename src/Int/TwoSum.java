package Int;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static void main(String[] args) {
        int[] rst = twoSum(new int[]{1,1,3,4},7);
        System.out.println("方法一：");
        for(int i=0;i<rst.length;i++){
            System.out.print(rst[i]+" ");
        }


        rst = twoSum2(new int[]{1,1,3,4},7);
        System.out.println(" ");
        System.out.println("方法二：");
        for(int i=0;i<rst.length;i++){
            System.out.print(rst[i]+" ");
        }

    }

    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int diff = target - nums[i];
            if (map.containsKey(diff)) {
                return new int[]{map.get(diff), i};
            }
            map.put(nums[i], i);
        }

        return null;
    }

        public static int[] twoSum2(int[] nums, int target) {
            for (int i = 0; i < nums.length; i++) {
                for (int j = i + 1; j < nums.length; j++) {
                    if (nums[j] == target - nums[i]) {
                        return new int[] { i, j };
                    }
                }
            }
            throw new IllegalArgumentException("No two sum solution");
        }


}
