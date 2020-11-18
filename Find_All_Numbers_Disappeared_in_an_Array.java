package Leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
//https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/submissions/
public class Find_All_Numbers_Disappeared_in_an_Array {
    static List<Integer> findDisappearedNumbers(int[] nums) {
    //    ArrayList<Integer>res=new ArrayList<>();
        ArrayList<Integer>arrayList=new ArrayList<>();

        if (nums.length==0)
            return arrayList;
        Arrays.sort(nums);
        int val=1;
        for(int i=0;i<nums.length;i++){
            if (Arrays.binarySearch(nums, val)<0)
                arrayList.add(val);
            val++;

        }

        return arrayList;
    }
    public static void main(String args[]){
        int arr[]={4,3,2,7,8,2,3,1};
        System.out.println(findDisappearedNumbers(arr)); //5,6
        arr=new int[]{1,1};
        System.out.println(findDisappearedNumbers(arr));
        arr=new int[]{2,2};
        System.out.println(findDisappearedNumbers(arr));//1



    }
}
