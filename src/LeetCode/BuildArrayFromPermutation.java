package LeetCode;

public class BuildArrayFromPermutation {

    public static void main(String[] args) {



    }

    public static int[] buildArray(int[] nums) {
        aPermutation(nums,0);

        return nums;
    }

    static void aPermutation(int[] nums, int start){
        if(start<nums.length){
            int temp=nums[start];
            int result=nums[temp];
            aPermutation(nums,start+1);
            nums[start]=result;
        }

    }


}
