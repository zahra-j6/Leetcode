package Leetcode;
//https://leetcode.com/problems/build-an-array-with-stack-operations/
import java.util.ArrayList;
import java.util.List;

public class Build_an_Array_With_Stack_Operations {
    public List<String> buildArray(int[] target, int n) {
        List<String> res=new ArrayList<>();
        int i=0, j=1;;
        while(j<=target[target.length-1]){
            if(target[i]==j){
                res.add("Push");
                i++;
            }
            else{
                res.add("Push");
                res.add("Pop");
            }
            j++;

        }
        return res;

    }
}
