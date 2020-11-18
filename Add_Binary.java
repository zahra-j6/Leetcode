package Leetcode;
//https://leetcode.com/problems/add-binary/submissions/
import java.math.BigInteger;

public class Add_Binary {
    static String addBinary(String a, String b) {
        
        BigInteger b1=new BigInteger(a,2);
        BigInteger b2=new BigInteger(b,2);

        return b1.add(b2).toString(2);
        /*
        int b1=Integer.parseInt(a,2);
        int b2=Integer.parseInt(b,2);
        return Integer.toBinaryString(b1+b2);
         */

    }
    public static void main(String args[]){
        System.out.println(addBinary("10100000100100110110010000010101111011011001101110111111111101000000101111001110001111100001101",
                "110101001011101110001111100110001010100001101011101010000011011011001011101111001100000011011110011"));
    }
}
