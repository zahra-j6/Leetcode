package Leetcode;

import java.util.ArrayList;
import java.util.Arrays;
//https://leetcode.com/problems/duplicate-zeros/submissions/
public class Duplicate_Zeros {
    static void duplicateZeros(int[] arr) {
        ArrayList<Integer>arrayList=new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            if(arr[i]==0){
                arrayList.add(0);
                arrayList.add(0);
            }else
                arrayList.add(arr[i]);
        }
        int len=arr.length;
        for(int i=0;i<len;i++)
            arr[i]=arrayList.get(i);
        System.out.println(Arrays.toString(arr));

    }
    public static void main(String args[]){
        int arr[]={1,2,3};
        duplicateZeros(arr);

    }
}
