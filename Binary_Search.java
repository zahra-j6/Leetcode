package Leetcode;

//https://leetcode.com/problems/binary-search/submissions/
public class Binary_Search {
    static int search(int[] nums, int target) {
        int mid= nums.length/2;
        if (nums[mid]==target)
            return mid;
        else if(target<nums[mid]){
            for(int i=0;i<mid;i++) {
                if (nums[i] == target)
                    return i;
            }
        }else{
            for(int i=mid;i< nums.length;i++) {
                if (nums[i] == target)
                    return i;
            }
        }
        return -1;
    }
    public static void main(String args[]){
        int nums []= {-1,0,3,5,9,12};
        System.out.println(search(nums, 9));//4
        nums = new int[]{-1,0,3,5,9,12};
        System.out.println(search(nums, 2));//-1

    }
}
