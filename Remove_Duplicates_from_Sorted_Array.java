import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;
//https://leetcode.com/problems/remove-duplicates-from-sorted-array/submissions/
public class Remove_Duplicates_from_Sorted_Array {
    static int removeDuplicates(int[] nums) {
        TreeSet<Integer>hs=new TreeSet<>();
        for(int i=0;i< nums.length;i++)
            hs.add(nums[i]);
        Iterator it=hs.iterator();
        int i=0;
        while(it.hasNext()){
            int val= (int) it.next();
            nums[i]=val;
            i++;
        }
        System.out.println(Arrays.toString(nums));
        return hs.size();

    }
    public static void main(String args[]){
        int nums[]={-3,-1,0,0,0,3,3};
        System.out.println(removeDuplicates(nums));
    }
}
