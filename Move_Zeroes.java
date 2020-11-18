package Leetcode;

import java.util.ArrayList;
import java.util.Arrays;
//https://leetcode.com/problems/move-zeroes/
public class Move_Zeroes {
    static void moveZeroes(int[] nums) {
        ArrayList<Integer>arr=new ArrayList<>();
        int cnt=0;
        for (int i=0;i<nums.length;i++){
            if(nums[i]==0)
                cnt++;
            else
                arr.add(nums[i]);
        }
        for(int i=0;i<cnt;i++)
            arr.add(0);
        for(int i=0;i<arr.size();i++)
            nums[i]=arr.get(i);
        System.out.println(Arrays.toString(nums));

    }
    public static void main(String arg[]){
        int arr[]={0,1,0,3,12};
        moveZeroes(arr);
    }
}
