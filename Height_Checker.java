package Leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
//https://leetcode.com/problems/height-checker/submissions/
public class Height_Checker {
    static  int heightChecker(int[] heights) {
        ArrayList<Integer>arrayList=new ArrayList<>();
        for(int i=0;i<heights.length;i++)
            arrayList.add(heights[i]);
        Collections.sort(arrayList);

        int cnt=0;

        for(int i=0;i<heights.length;i++) {
            if (arrayList.get(i) != heights[i])
                cnt++;
        }
        return cnt;

    }
    public static void main(String[] args){
        int heights[]={1,1,4,2,1,3};
        System.out.println(heightChecker(heights));//3
        heights=new int[] {5,1,2,3,4};
        System.out.println(heightChecker(heights));//5
        heights=new int[] {1,2,3,4,5};
        System.out.println(heightChecker(heights));//0
        heights=new int[] {2,1,2,1,1,2,2,1};
        System.out.println(heightChecker(heights));//0

    }

}
