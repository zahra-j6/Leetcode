package Leetcode;

//https://leetcode.com/problems/valid-palindrome/
public class Valid_Palindrome {
    static boolean isPalindrome(String s) {
        if(s.isEmpty())
            return true;
        s=s.toLowerCase();
        s=s.replaceAll("[^A-Za-z0-9]", "");
            for(int i=0;i<(s.length()/2);i++){
                if(Character.isLetter(s.charAt(i)) || Character.isDigit(s.charAt(i)) && Character.isLetter(s.charAt(s.length()-1-i)) || Character.isDigit(s.charAt(s.length()-1-i))){
                    if(s.charAt(i)==s.charAt(s.length()-1-i))
                        continue;
                    else
                        return false;
                }
            }

               return true;
    }
    public static void main(String args[]){

        System.out.println(isPalindrome("race a a car"));//f
        System.out.println(isPalindrome("            "));//t
    }
}
