package Leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;

//https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/
public class Two_Sum_II {
    static int[] twoSum(int[] numbers, int target) {
        int nums[]=new int[2];
        for(int i=0;i< numbers.length-1;i++){
            for(int j=i+1;j<numbers.length;j++){
                if(numbers[i]+numbers[j]==target)
                {
                    nums[0]=i+1;
                    nums[1]=j+1;
                    return nums;
                }
            }
        }
        Arrays.sort(nums);
        return nums;

    }
    public static void main(String args[]){
        int nums[]={5,25,75};
        System.out.println(Arrays.toString(twoSum(nums,100)));
    }
}
