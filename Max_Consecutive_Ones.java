import java.util.ArrayList;
import java.util.Collections;

//https://leetcode.com/explore/featured/card/fun-with-arrays/521/introduction/3238/
public class Max_Consecutive_Ones {
    static int findMaxConsecutiveOnes(int[] nums) {
        ArrayList<Integer>arr=new ArrayList<>();
        int cnt=0;
        for (int i=0;i<nums.length;i++){
            if(nums[i]==1)
                cnt++;
            else{
                arr.add(cnt);
                cnt=0;
            }
        }
        arr.add(cnt);
        Collections.sort(arr);
        Collections.reverse(arr);
        return arr.get(0);

    }
    public static void main(String args[]){
        int nums[]={1,1,0,1};
        System.out.println(findMaxConsecutiveOnes(nums));
    }
}
