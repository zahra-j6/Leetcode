package Leetcode;
//https://leetcode.com/problems/add-digits/submissions/
public class Add_Digits {
    static int addDigits(int num) {
        int sum=0;

        while(true) {
            int rem = num % 10;
            sum += rem;
            num = num / 10;
            if (num == 0) {
                if(  sum/10==0)
                    return sum;
                num = sum;
                sum = 0;
            }

        }


    }
    public static void main(String args[]){
        System.out.println(addDigits(38));


    }

}
