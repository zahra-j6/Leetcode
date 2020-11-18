package Leetcode;

import java.util.ArrayList;
import java.util.Collections;
//https://leetcode.com/problems/third-maximum-number/submissions/
public class Third_Maximum_Number {
    static int thirdMax(int[] nums) {
        ArrayList<Integer> ts=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(!ts.contains(nums[i]))
                ts.add(nums[i]);
        }
        Collections.sort(ts);
        Collections.reverse(ts);
        if(ts.size()<3)
            return ts.get(0);
        else
            return ts.get(2);


    }
    public static void main(String args[]){
        int arr[]={2, 2, 3, 1};
        System.out.println(thirdMax(arr));
    }
}
