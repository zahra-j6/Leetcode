package Leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
//https://leetcode.com/problems/combinations/submissions/
public class Combinations {
    static void combine(int n, int k) {
        int []arr=new int[n];
        for(int i=1;i<=n;i++){
            arr[i-1]=i;
        }
        int data[]=new int[n*k];
        for(int i=0;i<k;i++)
        combinations(arr, data, 0, arr.length-1,0,k);
    }
    static void combinations(int []arr,int [] data, int l, int r,int index,int k){
        if(index==k){
            for(int i=0;i<k;i++) {
                System.out.println(data[i] + " ");
            }
            System.out.println();
        }else{
            for(int i=l;i<=r && ((r-i+1)>=(k-index));i++){
                data[index]=arr[i];
                combinations(arr,data, i+1,r,index+1,k);}}}


    /*
    static List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> result = new ArrayList<>();
        backtrack(result, new ArrayList<Integer>(), n, k);
        return result;
    }
    static void backtrack(List<List<Integer>> list, List<Integer> tempList, int n, int k) {
        if (tempList.size() == k)
            list.add(new ArrayList<>(tempList));
        else {
            for (int i = n; i > 0; i--) {
                tempList.add(i);
                backtrack(list, tempList, i - 1, k);
                tempList.remove(tempList.size() - 1);
            }
        }
    }*/
    public static void main(String args[]){

        combine(4,2);
    }
}
