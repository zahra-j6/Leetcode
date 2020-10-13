package Leetcode;

//https://leetcode.com/contest/weekly-contest-198/problems/water-bottles/
public class Water_Bottles {
    static int numWaterBottles(int numBottles, int numExchange) {
        if(numBottles<numExchange)return numBottles;
        int n_o_c=numBottles;
        int cnt=n_o_c;
           // for(int i=numExchange;i>0;i--){
                while(cnt>=numExchange) {
                    cnt = (cnt - numExchange) + 1;
                    n_o_c++;
               // }
               // if(cnt==0)
                 //   cnt=1;

             //   if(cnt+i==numExchange)
               //     i=1;
//                    cnt=cnt/i;
  //              n_o_c=n_o_c+cnt;
            }

        return n_o_c;

    }
    public static void main(String args[]){

        System.out.println(numWaterBottles(92,4));
    }

}
