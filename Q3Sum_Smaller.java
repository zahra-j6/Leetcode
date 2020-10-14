package Leetcode;

import java.util.Arrays;

//https://kennyzhuang.gitbooks.io/leetcode-lock/content/259_3sum_smaller.html
public class Q3Sum_Smaller {
    static int threeSumSmaller(int[] nums, int target) {
        Arrays.sort(nums);
        int cnt=0;
        for(int i=0;i< nums.length-2;i++) {
            int j = i + 1;
            int k = nums.length - 1;
            while (j < k) {
                if (nums[i] + nums[j] + nums[k] < target) {
                    cnt++; //cnt=cnt+(j-k)
                    j++;
                }else
                k--;

            }
        }
        return cnt;
    }
    public static void main(String args[]){
        int nums[]={ -2, 0, 1, 3};
        System.out.println(threeSumSmaller(nums,2));
    }
}
