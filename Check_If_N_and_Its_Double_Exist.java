import java.util.Arrays;
//https://leetcode.com/problems/check-if-n-and-its-double-exist/submissions/
public class Check_If_N_and_Its_Double_Exist {
    static boolean checkIfExist(int[] arr) {
        Arrays.sort(arr);
        int cnt=0;
        for(int i=0;i<arr.length;i++){
            int n=arr[i];
            int m=2*n;
            if(Arrays.binarySearch(arr, m)>=0 )
                if(m==0 )
                  cnt++;
                else
                    return true;
        }
        if (cnt>1)
            return true;
        return false;

    }
    public static void main(String args[]){
        int arr[]={-2,0,10,-19,4,6,-8};
        System.out.println(checkIfExist(arr));
    }
}
