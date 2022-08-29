package LeetCode;

import java.util.Arrays;

public class RunningSumofArray {
    public static void main(String[] args) {
        int[] array ={1,2,3,4};
        System.out.println(Arrays.toString(runningSum(array)));


    }
    public static int[] runningSum(int[] nums) {
        for (int i=1;i<nums.length;i++){
           nums[i]+=nums[i-1];
        }
        return nums;



    }
}
