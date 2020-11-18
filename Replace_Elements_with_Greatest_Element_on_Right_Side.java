package Leetcode;

import java.util.Arrays;
//https://leetcode.com/problems/replace-elements-with-greatest-element-on-right-side/submissions/
public class Replace_Elements_with_Greatest_Element_on_Right_Side {
    static int[] replaceElements(int[] arr) {
        int index=0;
        for(int i=0;i<arr.length;i++){
            int max=arr[i];
            for(int j=i+1;j<arr.length;j++){
                if(max<arr[j]){
                    max=arr[j];
                    index=j;

                }
            }
            int temp=arr[i];
            arr[i]=max;


        }
        int res[]=new int[arr.length];
        for(int i=0;i< res.length-1;i++) {
            res[i]=arr[i+1];
        }
        res[res.length - 1] = -1;

        return res;

    }
    public static void main(String args[]){
        int[] arr={17,18,5,4,6,1};
        System.out.println(Arrays.toString(replaceElements(arr)));
    }
}
