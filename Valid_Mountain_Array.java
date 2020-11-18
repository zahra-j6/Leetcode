package Leetcode;

//https://leetcode.com/problems/valid-mountain-array/submissions/
public class Valid_Mountain_Array {
    static boolean validMountainArray(int[] A) {
        if(A.length<3)
            return false;
        int diff=0,add=1;
        for(int i=0;i<A.length-1;i++){
            if (A[i]<A[i+1]){
                add++;
                if(diff>0)
                    return false;

            }else if(A[i]>A[i+1]){
                if(i==0)
                    return false;
                else
                    diff++;

            }else
                return false;


        }
        if(add==0 || diff==0)
            return false;
        //if(add-diff >=0 )
        //return true;
        else
            return true;

    }
    public static void main(String args[]){
        int A[]={0,1,2,3,4,5,6,7,8,9};//false
        System.out.println(validMountainArray(A));
         A= new int[]{0, 2, 3, 4, 5, 2, 1, 0}; //true
        System.out.println(validMountainArray(A));
        A= new int[]{0, 2, 3, 3, 5, 2, 1, 0};//false
        System.out.println(validMountainArray(A));
        A= new int[]{4,20,32,45,49,45,31,21,20,16,11,8};//true
        System.out.println(validMountainArray(A));
    }

}
