package Leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
//https://leetcode.com/problems/combinations/submissions/
public class Combinations {
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
    }
    public static void main(String args[]){

        System.out.println(combine(4,2));
    }
}
