package Leetcode;

//https://leetcode.com/contest/weekly-contest-198/problems/water-bottles/
public class Water_Bottles {
    static int numWaterBottles(int numBottles, int numExchange) {
        if(numBottles<numExchange)return numBottles;
        if(numBottles<numExchange)return numBottles;
        int res=numBottles;
     //   numBottles=numBottles/numExchange;
        while(numBottles>0){
            res=res+numBottles/numExchange;
            if(numBottles/numExchange>0 && numBottles%numExchange>0)
                numBottles=numBottles/numExchange +numBottles%numExchange;
            else
                numBottles=numBottles/numExchange;

        }
        return res;
        /*alternate approach
        int n_o_c=numBottles;
        int cnt=n_o_c;
                while(cnt>=numExchange) {
                    cnt = (cnt - numExchange) + 1;
                    n_o_c++;
            }

        return n_o_c; */

    }
    public static void main(String args[]){

        System.out.println(numWaterBottles(92,4));//122
        System.out.println(numWaterBottles(9,3));//13
    }

}
