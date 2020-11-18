package Leetcode;

import java.util.ArrayList;
import java.util.Arrays;
//https://leetcode.com/problems/sort-array-by-parity/
public class Sort_Array_By_Parity {
    static int[] sortArrayByParity(int[] A) {
        ArrayList<Integer>even=new ArrayList<>();
        ArrayList<Integer>odd=new ArrayList<>();
        for(int i=0;i< A.length;i++){
            if(A[i]%2==0)
                even.add(A[i]);
            else
                odd.add(A[i]);
        }
        for(int i=0;i<even.size();i++)
            A[i]=even.get(i);
        int index=even.size();
        for(int i=0;i<odd.size();i++) {
            A[index]=odd.get(i);
            index++;
        }
        return A;

    }
    public static void main(String args[]){
        int A[]={3,1,2,4};
        System.out.println(Arrays.toString(sortArrayByParity(A)));

    }
}
