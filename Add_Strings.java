package Leetcode;
//https://leetcode.com/problems/add-strings/submissions/
import java.math.BigInteger;

public class Add_Strings {
    static String addStrings(String num1, String num2) {
        BigInteger n1=new BigInteger(num1);
        BigInteger n2=new BigInteger(num2);

        return n1.add(n2).toString();


    }
    public static void main(String args[]){
     System.out.println(addStrings("6913259244",
             "71103343"));
    }
}
