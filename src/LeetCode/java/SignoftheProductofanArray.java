package LeetCode.java;

public class SignoftheProductofanArray {
    public static void main(String[] args) {
        int[] array={41,65,14,80,20,10,55,58,24,56,0,86,96,10,3,84,4,41,13,32,42,43,83,78,82,70,15,-41};

        System.out.println(arraySign(array));

    }
    public static long arraySign(int[] nums) {
        int count=1;
        for (int i=0 ; i<nums.length ; i++){
            if (nums[i]<0){
                count*=-1;
            }
            else if (nums[i]==0){
                return 0;
            }
        }
        return count;

    }
}
