package Leetcode;

import java.util.*;
//https://leetcode.com/problems/subsets/submissions/
public class Subsets {
    static List<List<Integer>> result=new ArrayList<>();
    static void combinations(int nums[], int data[], int i, int len, int index, int r ){
        if (r==index){
            ArrayList<Integer> arr=new ArrayList<>();
            boolean add=true;
            for(int k=0;k<index;k++) {
                if(arr.contains(data[k])) {
                    arr.clear();
                    add = false;
                }
                else {
                    //add=true;
                    System.out.println(data[k] + " ");
                    arr.add(data[k]);
                }
            }
            System.out.println();
            Collections.sort(arr);
            if(add==true && !result.contains(arr))
                result.add(arr);
        }
        for(int j=i;j<=len &&((len-j+1)>=(r-index));j++){
            data[index]=nums[j];
            combinations(nums,data,i+1, len, index+1,r);

        }

    }

    static List<List<Integer>> subsets(int[] nums) {
        int n=nums[nums.length-1];
        int []data=new int[(int) Math.pow(nums.length,2)];
        for(int i=0;i<= nums.length;i++)
            combinations(nums,data, 0, nums.length-1, 0,i);
        return result;


    }
    public static void main(String[] args) {
        int nums[]={0};
       // System.out.println(subsets(nums));
        //nums=new int[]{0};
        System.out.println(subsets(nums));
    }
}
