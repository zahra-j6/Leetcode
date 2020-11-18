package Leetcode;
//https://leetcode.com/problems/first-unique-character-in-a-string/submissions/

import java.util.ArrayList;

public class First_Unique_Character_in_a_String {
    static int firstUniqChar(String s) {
        if (s.length()==0)
            return -1;
        ArrayList<Character> arr = new ArrayList<>();
        ArrayList<Character> pres = new ArrayList<>();
        int index=0;
        for (int i = 0; i < s.length(); i++) {
            if (arr.contains(s.charAt(i))) {
                Character c=s.charAt(i);
                arr.remove(c);
            } else if(!pres.contains(s.charAt(i))) {
                arr.add(s.charAt(i));
                pres.add(s.charAt(i));
            }
        }
        if(arr.isEmpty())
            return -1;
        char op=arr.get(0);
        return s.indexOf(op);

    }

    public static void main (String[] args) {
        System.out.println(firstUniqChar("cc"));

    }
}
