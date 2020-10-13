package Leetcode;

//https://leetcode.com/problems/count-good-triplets/
public class Count_Good_Triplets {
    static int countGoodTriplets(int[] arr, int a, int b, int c) {
        int cnt=0;
        for(int i=0;i< arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                for(int k=j+1;k<arr.length;k++){
                    if(i<j && j<k){
                        if(Math.abs(arr[i]-arr[j]) <=a  &&  Math.abs(arr[j]-arr[k])<=b  && Math.abs(arr[i]-arr[k])<=c)
                            cnt++;
                    }
                }
            }
        }
        return cnt;

    }
    public static void main(String args[]){
        int arr[]={1,1,2,2,3};
        System.out.println(countGoodTriplets(arr, 0, 0, 1));

    }
}
