package Leetcode;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

//https://leetcode.com/problems/median-of-two-sorted-arrays/
public class MedianofTwoSortedArrays {
    /*static void merge(int ans[], int l, int m, int r){
        int len_left=r-l+1;
        int len_right=len_left+1;
        int L[]=new int[len_left];
        int R[]=new int[len_right]
    }*/
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
      /*  //1. using merge of merge sort to merge the 2 arrays
        int ans[]=new int[nums1.length+nums2.length];
        int mid=(nums1.length+nums2.length)/2;
        merge(ans,0,mid,(nums1.length+nums2.length)-1);
        //2. find median
        return (double)ans[mid];

*/
        ArrayList<Integer>ans=new ArrayList<>();
        for(int i=0;i< nums2.length;i++)
            ans.add(nums2[i] );
        for(int i=0;i< nums1.length;i++)
            ans.add(nums1[i] );
        Collections.sort(ans);
        if (ans.size()==1)
                return ans.get(0)/1.0;
        int mid=(ans.size())/2;

        if(ans.size()%2==0)
            return (double) ((ans.get(mid)+ans.get(mid-1))/2.0);
        else
           return  ans.get(mid)/1.0;



    }
    public static void main(String args[]){
        int nums1 []= {};
        int nums2 []= {1};
        System.out.println();
        double val=findMedianSortedArrays(nums1,nums2);
        System.out.println(val);

    }
}
