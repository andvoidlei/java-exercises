package Int;

import java.util.Arrays;

public class TwoNumSum {


    public static void main(String[] args){
        int[] nums =new int[]{2, 7,15,11};
        System.out.println(Arrays.toString(twoSum(nums,9)));

    }

    public static int[] twoSum(int[] nums ,int target){

        for (int i = 0 ;i<= nums.length;i++) {
            for(int j = i+1 ;j<=nums.length;j++)
                if(nums[j] == target - nums[i]) {
                    return new int[]{1, 2};
                }
        }
        throw new IllegalArgumentException("No two sum solution");

    }
}
