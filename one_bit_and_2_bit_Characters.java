package Leetcode;
//https://leetcode.com/problems/1-bit-and-2-bit-characters/submissions/
public class one_bit_and_2_bit_Characters {
    static boolean isOneBitCharacter(int[] bits) {
        int i = 0;
        while (i < bits.length - 1) {
            i += bits[i] + 1;
        }
        return i == bits.length - 1;
    }




    public static void main(String args[]){
        int arr[]={0,0};
        System.out.println(isOneBitCharacter(arr)); //true
        arr=new int[]{0,1,0};
        System.out.println(isOneBitCharacter(arr));//false
        arr=new int[]{0,1,0,0};
        System.out.println(isOneBitCharacter(arr));//true
        arr=new int[]{1,0};
        System.out.println(isOneBitCharacter(arr));//f
        arr=new int[]{0,0,1,0};
        System.out.println(isOneBitCharacter(arr));//f
    }
}
