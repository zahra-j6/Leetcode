package Leetcode;

import java.util.ArrayList;
import java.util.Arrays;

//https://leetcode.com/problems/rotate-array/
public class Rotate_Array {
    static void rotate(int[] nums, int k) {
        if(k > nums.length)
            k=k%nums.length;

            int index = nums.length - k;
            int[] arr = new int[nums.length];
            int j = 0;
            for (int i = index; i < nums.length; i++) {
                arr[j] = nums[i];
                j++;
            }
            for (int i = 0; i < index; i++) {
                arr[j] = nums[i];
                j++;
            }
            System.arraycopy(arr, 0, nums, 0, nums.length);
            System.out.println(Arrays.toString(nums));

//        System.out.println(arr);

    }
    public static void main(String args[]){
        int nums[]={1,2};
        rotate(nums,3);
        nums= new int[]{-1, -100, 3, 99};
        rotate(nums,2);

    }
}
