package Leetcode;

//https://leetcode.com/problems/find-numbers-with-even-number-of-digits/submissions/
public class Find_Numbers_with_Even_Number_of_Digits {
    static int findNumbers(int[] nums) {
        int len=0, res=0;
        while(len<nums.length){
            int val=nums[len];
            int cnt=0;
            while(val>0) {
                int r = val % 10;
                val = val / 10;
                cnt++;
            }
            if (cnt %2==0)
                res++;
            len++;

        }
        return res;

    }
    public static void main(String args[]){
        int nums[]={555,901,482,1771};
        System.out.println(findNumbers(nums));
    }

}
