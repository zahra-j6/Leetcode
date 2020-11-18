package Leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

//https://leetcode.com/problems/3sum/
public class Q3Sum {
    public static List<List> threeSum(int[] nums) {
        Arrays.sort(nums);
        HashSet <List<Integer>>set=new HashSet<>();
//        List <Integer>arr=new ArrayList<>();
        Arrays.sort(nums);
        for(int i=0;i< nums.length-2;i++){
            int j=i+1;
            int k=nums.length-1;
            while(j<k){
                int sum=nums[i]+nums[j]+nums[k];
                if(sum==0 ){
                    set.add(Arrays.asList(nums[i],nums[j++],nums[k--]));
                    j++;

                }
                    /*if(!res.contains(arr))
                        res.add(arr);*/
                else if(sum>0)
                    k--;
                else j++;
            }
        }
        //List<List> res1 = res;



        return new ArrayList<>(set);
    }
    public static void main(String args[]){
        int nums[] = {1,0,1,2,-1,-4,-2,-3,3,0,4};//[[-3, -1, 4], [-2, -1, 3], [-4, 1, 3], [-3, 1, 2], [-4, 0, 4], [-3, 0, 3], [-2, 0, 2], [-1, 0, 1]]

        System.out.println(threeSum(nums));
    }
}
