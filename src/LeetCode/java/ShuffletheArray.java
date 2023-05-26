package LeetCode.java;

import java.util.Arrays;

public class ShuffletheArray {
    public static void main(String[] args) {
        int[] array={2,5,1,3,4,7};
        System.out.println(Arrays.toString(shuffle(array, 3)));

    }
    public static int[] shuffle(int[] nums, int n) {
        int[] newNums = new int[nums.length];
        int i=0;
        int j=0;
        int k=n;
        while(i<n){
            newNums[j]=nums[i];
            newNums[j+1]=nums[k];
            j=j+2;
            i++;
            k++;
        }
        return newNums;
    }
}
