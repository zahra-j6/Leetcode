package Leetcode;

//https://leetcode.com/problems/gas-station/
public class Gas_Station {
    static int canCompleteCircuit(int[] gas, int[] cost) {
        int cnt= 0,i=0, initial_gas=0,r=0;
        while(cnt<=gas.length* gas.length && r!=gas.length){
           if(r==0)
                initial_gas=0;
            if(i==gas.length)
                i=0;
            initial_gas=initial_gas+gas[i];
            if(initial_gas>=cost[i]){
                initial_gas=initial_gas-cost[i];
                r++;
                cnt++;
            }else {
                cnt = cnt + gas.length;
                r = 0;
            }
            i++;

        }


        if(r!=gas.length)
            return -1;
        else{
            if(i==gas.length)
                return 0;
            else
                return (i);

        }


    }
    public static void main(String args[]){
        int gas[]={3,1,1};
                int cost[]={1,2,2};
        System.out.println(canCompleteCircuit(gas,cost));
    }
}
