import java.util.Arrays;
//https://leetcode.com/problems/squares-of-a-sorted-array/submissions/
public class Squares_of_a_Sorted_Array {
    static int[] sortedSquares(int[] A) {
        int res[]=new int[A.length];
        for(int i=0;i<A.length;i++){
            res[i]=(int)Math.pow(A[i],2);
        }
        Arrays.sort(res);
        return res;

    }
    public static void main(String args[]){
        int A[]={-4,-1,0,3,10};
        System.out.println(sortedSquares(A));
    }

}
