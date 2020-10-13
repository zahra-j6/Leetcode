import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
//https://leetcode.com/problems/array-partition-i/
//(external help taken)
public class Array_Partition_I {
    static int arrayPairSum(int[] nums) {
        int n= nums.length/2;
        Arrays.sort(nums);
        int sum=0;
        for(int i=0;i<nums.length;i=i+2)
            sum=sum+nums[i];

        return sum;
    }
    public static void main(String args[]){
        int []nums={1,2,3,2};
        System.out.println(arrayPairSum(nums));
    }

}
