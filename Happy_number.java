package Leetcode;
//https://leetcode.com/problems/happy-number/submissions/
import java.util.ArrayList;

public class Happy_number {
    static boolean isHappy(int n) {

        int rem=0;
        ArrayList<Integer> arr=new ArrayList<>();
    //    arr.add(n);
        while(true){
            if(n==0){
                n=rem;
                rem=0;
            }
            if(arr.contains(n))
                return false;
            else
                arr.add(n);
            while(n>0){
                rem=rem+(int)Math.pow(n%10,2);
                n=n/10;
            }
            if(rem==1)
                return true;
        }
        //  return false;



    }
    public static void main(String arg[]) {
        System.out.println(isHappy(2)); //f
        System.out.println(isHappy(19));//t
        System.out.println(isHappy(7));//t
    }
}
