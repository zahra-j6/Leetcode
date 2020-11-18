package Leetcode;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Maximum_Profit_in_Job_Scheduling {
    static int jobScheduling(int[] startTime, int[] endTime, int[] profit) {
        int p=0,max_p= Arrays.stream(profit).max().getAsInt(),i=1, index=0;
        p=max_p;
        for(index=0;index<profit.length;index++){
            if(profit[index]==max_p)
                break;
        }
        int st=startTime[index];
        int end=endTime[index];
        profit[index]=0;
        while(i<profit.length){
            int index1=0;
            max_p= Arrays.stream(profit).max().getAsInt();
            for( index1=0;index1<profit.length;index1++){
                if(profit[index1]==max_p)
                    break;
            }
            int st2=startTime[index1];
            int end2=endTime[index1];
            if(st2<st || st2>end && end2<=st){
                p=p+max_p;
                st=st2;
                end=end2;
            }
            i++;
            profit[index1]=0;

        }
        return p;


    }
    public static void main(String args[]){
        int s[]={1,2,3,4,6};
        int e[]={3,5,10,6,9};
        int p[]={20,20,100,70,60};
        System.out.println(jobScheduling(s,e,p));

    }
}
