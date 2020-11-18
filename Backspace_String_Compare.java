package Leetcode;

import java.util.ArrayList;
import java.util.Collections;
//https://leetcode.com/problems/backspace-string-compare/submissions/
public class Backspace_String_Compare {
    static boolean backspaceCompare(String S, String T) {
        ArrayList<Character> a1 = new ArrayList<>();
        ArrayList<Character> a2 = new ArrayList<>();
        for (int i = 0; i < S.length(); i++) {
            if (S.charAt(i) == '#'){
                if (!a1.isEmpty())
                    a1.remove(a1.size() - 1);
            }

            else
                a1.add(S.charAt(i));
        }
        for (int i = 0; i < T.length(); i++) {
            if (T.charAt(i) == '#' ) {
                if (!a2.isEmpty())
                    a2.remove(a2.size() - 1);
            }
            else
                a2.add(T.charAt(i));
        }
        if (a1.equals(a2))
            return true;
        else
            return false;

    }

    public static void main(String args[]) {
        String a = "y#fo##f";
        String b = "y#f#o##f";
        System.out.println(backspaceCompare(a, b));//t
         a = "ab#c";
        b="ad#c";
        System.out.println(backspaceCompare(a, b));//t

    }
}
