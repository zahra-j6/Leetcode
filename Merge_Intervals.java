package Leetcode;
//https://leetcode.com/problems/merge-intervals/submissions/
import java.util.Arrays;
import java.util.Comparator;
import java.util.Stack;

public class Merge_Intervals {
    static int[][]  merge(int[][] intervals) {
        Arrays.sort(intervals,new Comparator<int[]>(){

            @Override
            public int compare(int[] o1, int[] o2) {
                return Integer.compare(o1[0],o2[0]);
            }
        });
        Stack<Integer>stack=new Stack<>();
        for (int i=0;i<intervals.length;i++){
                int val1=intervals[i][0];
                int val2=intervals[i][1];
                if(stack.isEmpty()) {
                    stack.push(val1);
                    stack.push(val2);

                }
                else{
                    int cmp2=stack.pop();
                    if(cmp2>=val1) {
                        int cmp=stack.pop();
                        if(cmp>val1)
                            stack.push(val1);
                        else
                            stack.push(cmp);
                        if(cmp2>val2)
                            stack.push(cmp2);
                        else
                            stack.push(val2);
                    }
                    else{
                        stack.push(cmp2);
                        stack.push(val1);
                        stack.push(val2);

                }
            }
        }
        int [][]res=new int[stack.size()/2][2];
        int j=0;
        while(!stack.isEmpty()){
            res[j][0]=stack.remove(0);
            res[j][1]=stack.remove(0);
            j++;
        }
        return res;
    }
    public static void main(String args[]){
        int interval[][]={{1,3},{2,6},{8,10},{15,18}};
        System.out.println(Arrays.toString(merge(interval)));
        interval=new int[][]{{1,4},{4,5}};//1,5
        merge(interval);
        interval=new int[][]{{1,4},{0,4}};//0,4
        merge(interval);
        interval=new int[][]{{1,4},{0,1}};//0,4
        merge(interval);
        interval=new int[][]{{1,4},{0,0}};//0,0 1,4
        merge(interval);
    }
}
