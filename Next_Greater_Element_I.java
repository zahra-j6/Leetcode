package Leetcode;
//https://leetcode.com/problems/next-greater-element-i/submissions/
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.IntStream;

public class Next_Greater_Element_I {
    static int getMAx(int num2[],int ind){
        int val=num2[ind];
        for(int i=ind;i<num2.length;i++)
            if(val<num2[i]){
                return num2[i];
            }
        return -1;

    }
    static int[] nextGreaterElement(int[] nums1, int[] nums2) {

        int arr[]=new int[nums1.length];
        int k=0;
        for(int j=0;j< nums1.length;j++){
            int con=nums1[j];
            int index= IntStream.range(0, nums2.length).filter(i -> con  == nums2[i])
                    .findFirst()
                    .orElse(-1);
            if(index< nums2.length-1){
                int val=getMAx(nums2, index);
                // obtain value of nums2 where index>index and val>nums1[i]
                if(val>nums1[j]) {
                    arr[k] = val;
                    k++;
                }
                else{
                    arr[k]=-1;
                    k++;
                }
            }else {
                arr[k] = -1;
                k++;
            }

        }
        return arr;
    }
    public static void main(String args[]){
        int nums1[]={4,1,2};
        int nums2[]={1,3,4,2};
        System.out.println(Arrays.toString(nextGreaterElement(nums1,nums2)));//-1,3,-1
        nums1=new int[]{2,4};
        nums2=new int[]{1,2,3,4};
        System.out.println(Arrays.toString(nextGreaterElement(nums1,nums2)));
        nums1=new int[]{1,3,5,2,4};
        nums2=new int[]{6,5,4,3,2,1,7};
        System.out.println(Arrays.toString(nextGreaterElement(nums1,nums2)));
    }

}
