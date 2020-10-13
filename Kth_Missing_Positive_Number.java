package Leetcode;

import java.util.ArrayList;
import java.util.Arrays;

//https://leetcode.com/problems/kth-missing-positive-number/
public class Kth_Missing_Positive_Number {
    static int findKthPositive(int[] arr, int k) {
        ArrayList<Integer>arrayList=new ArrayList<>();
        if(arr[0]!=1){
            for(int i=1;i<arr[0];i++)
                arrayList.add(i);
        }

        for(int i=0;i<arr.length-1;i++){
            if(Math.abs(arr[i]-arr[i+1])==1)
            continue;
            else {
                int diff = Math.abs(arr[i] - arr[i + 1]);
                for(int j=1;j<diff;j++){
                    arrayList.add(arr[i]+j);

                }

            }

        }
        int val=arr[arr.length-1];
       // if(!arrayList.isEmpty())
         //    val=arrayList.get(arrayList.size()-1);
        for(int i=1;i<100;i++)
            arrayList.add(val+i);

        return arrayList.get(k-1);
    }
public static void main(String []args){
        int num[]={3,10};
        System.out.println(findKthPositive(num,2));
}
}
