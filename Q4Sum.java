package Leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

//https://leetcode.com/problems/4sum/
public class Q4Sum {
    static List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> res=new ArrayList<>();
        Arrays.sort(nums);
        for(int i=0;i< nums.length-3;i++){
            for(int j=i+1;j< nums.length-2;j++){
                for(int k=j+1;k< nums.length-1;k++){
                    for(int l=k+1;l< nums.length;l++){
                        List<Integer> ans=new ArrayList<>();
                        if(nums[i]+nums[k]+nums[j]+nums[l] == target)
                        {
                            ans.add(nums[i]);
                            ans.add(nums[j]);
                            ans.add(nums[k]);
                            ans.add(nums[l]);
                            Collections.sort(ans);
                            if(!res.contains(ans))
                                res.add(ans);


                        }
                    }
                }
            }
        }
        return res;
    }
    public static void main(String args[]){
        int nums[]={1, 1, -1, -1,1, 1, -1, -1};
       fourSum(nums,0);
    }

}
