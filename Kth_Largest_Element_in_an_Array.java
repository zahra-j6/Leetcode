package Leetcode;

import java.util.ArrayList;
import java.util.Arrays;
//https://leetcode.com/problems/kth-largest-element-in-an-array/submissions/
public class Kth_Largest_Element_in_an_Array {
    static int findKthLargest(int[] nums, int k) {
        Arrays.sort(nums);
        return nums[nums.length-k];
    }
    public static void main(String []args){
        int num[]={3,2,3,1,2,4,5,5,6};
        System.out.println(findKthLargest(num,4));
    }
}
