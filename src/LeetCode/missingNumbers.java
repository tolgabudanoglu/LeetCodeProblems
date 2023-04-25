package LeetCode;

import java.util.stream.IntStream;

public class missingNumbers {

    public static void main(String[] args) {

        int[] Array = new int[]{ 3,0,1 };
        System.out.println(missingNumber(Array));

    }

    public static int missingNumber(int[] nums) {
        int n = nums.length;
        int actualSum = (n) * (n+1)/2;
        for (int i=0;i<nums.length;i++){
            actualSum-=nums[i];
        }
        return actualSum;

    }
}
