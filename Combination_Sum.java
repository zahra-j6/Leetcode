package Leetcode;

import java.util.ArrayList;
import java.util.List;
// incorrect
public class Combination_Sum {
    static List<List<Integer>> res = new ArrayList<>();

    public static void combi(int c[], int data[], int st, int end, int index, int r, int target) {
        if (index == r) {
            ArrayList<Integer> arr = new ArrayList<>();
            int sum = 0;
            for (int i = 0; i < r; i++) {
                System.out.println(data[i]+" ");
                arr.add(data[i]);
                sum = sum + data[i];
            }
            System.out.println();
            if (sum == target)
                res.add(arr);
        }
        for (int k = st; k <= end && ((end - k + 1) >= (r - index)); k++) {
            data[index] = c[k];
            combi(c, data, k + 1, end, index + 1, r, target);

        }

    }

    public static List<List<Integer>> combinationSum(int[] candidates, int target) {
        int data[] = new int[candidates.length*candidates.length];
        for (int i = 0; i < candidates.length; i++)
            combi(candidates, data, 0, candidates.length-1, 0, i, target);
        return res;
    }

    public static void main(String[] args) {
        int c[]={2,3,6,7};
        System.out.println(combinationSum(c,7));//[[2,2,3],[7]]
    }
}
