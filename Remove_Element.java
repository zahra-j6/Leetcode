package Leetcode;

import java.util.ArrayList;
import java.util.Arrays;
//https://leetcode.com/problems/remove-element/
public class Remove_Element {
    static int removeElement(int[] nums, int val) {

        ArrayList<Integer>arr=new ArrayList<>();
        for (int i=0;i< nums.length;i++){
            if(nums[i]!=val)
                arr.add(nums[i]);
        }
        for(int i=0;i<arr.size();i++)
            nums[i]= arr.get(i);
        System.out.println(Arrays.toString(nums));
        return arr.size();
    }
    public static void main(String args[]){
        int nums[]={0,1,2,2,3,0,4,2};
        System.out.println(removeElement(nums,2));
    }
}
