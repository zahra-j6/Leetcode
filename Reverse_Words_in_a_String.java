package Leetcode;

import java.util.Arrays;
//https://leetcode.com/problems/reverse-words-in-a-string/
public class Reverse_Words_in_a_String {
    public static String reverseWords(String s) {
        String arr[]=s.split(" ");
        String ans="";
        for(int i= arr.length-1;i>=0;i--) {
            if(arr[i].equals(""))
                continue;
            else
            ans = ans + arr[i] + " ";
        }
        ans=ans.trim();
        return ans;

    }
    public static void main(String args[]){
        System.out.println(reverseWords("Alice does not even like bob"));
    }
}
