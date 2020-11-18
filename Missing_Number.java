package Leetcode;
//https://leetcode.com/problems/missing-number/submissions/
import java.util.Arrays;

public class Missing_Number {
    static int missingNumber(int[] nums) {
        Arrays.sort(nums);
        int i=0;
        for(i=0;i<nums.length;i++){
            if (nums[i]==i)
                continue;
            else
                return i;
        }
        return i;

    }
    public static void main(String args[]){
        System.out.println(missingNumber(new int[]{3, 0, 1}));//2
        System.out.println(missingNumber(new int[]{ 0, 1}));//2
        System.out.println(missingNumber(new int[]{ 9,6,4,2,3,5,7,0,1}));//8
        System.out.println(missingNumber(new int[]{ 0}));//1

    }
}
