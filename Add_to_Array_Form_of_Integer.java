package Leetcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Add_to_Array_Form_of_Integer {
    static List<Integer> addToArrayForm(int[] A, int K) {
        ArrayList<Integer>arr=new ArrayList<>();
        if(A.length==1 && K==0)
        {
            arr.add(A[0]);
            return arr;
        }
        int sum=0;
        for(int i=0;i<A.length;i++){
            sum= (int) ((int)sum+A[i]*( Math.pow(10,A.length-i-1)));
        }
        sum=sum+K;
        while(sum>0){
            int r=sum%10;
            arr.add((int)r);
            sum=sum/10;
        }
        Collections.reverse(arr);

        while(true){
            if (arr.get(0)==0)
                arr.remove(arr.get(0));
            else
                break;

        }
        System.out.println(arr);

        return arr;

    }
    public static void main(String args[]){
    //    int arr[]={1,2,6,3,0,7,1,7,1,9,7,5,6,6,4,4,0,0,6,3};
      //  addToArrayForm(arr,516);
        int arr[]= {0};
        addToArrayForm(arr,3);

    }
}
