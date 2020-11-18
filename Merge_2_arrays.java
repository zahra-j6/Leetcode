package Leetcode;

import java.util.Arrays;
import java.util.Collections;

//https://leetcode.com/problems/merge-sorted-array/
//https://leetcode.com/discuss/interview-question/729175/IBM-Back-End-Developer-OA-(Fall-2020)
public class Merge_2_arrays {
    static int[] mergeArrays(int a[], int[] b){
        int [] res=new int[a.length+b.length];
        for(int i=0;i<a.length;i++)
            res[i]=a[i];
        int index=a.length;
        for(int j=0;j< b.length;j++){
            res[index]=b[j];
            index++;
        }
        Arrays.sort(res);

        return res;
    }
    public static void main(String args[]){
        int a[]={1,2,3};
        int b[]={2,5,5};
        System.out.println(Arrays.toString(mergeArrays(a,b)));
    }
}
