package Leetcode;

import java.util.ArrayList;
//https://leetcode.com/problems/find-the-duplicate-number/submissions/
//Find the first duplicate occurence of a number in an array

public class Find_the_Duplicate_Number {
    public static void main(String args[]){
        int arr[]=new int[]{1,1,2};
        ArrayList<Integer>ar=new ArrayList<>();
        for (int i=0;i<arr.length;i++){
            if(ar.contains(arr[i])){
                System.out.println("First duplicate occurence is "+arr[i]);
                break;
            }else
                ar.add(arr[i]);
        }


    }
}
