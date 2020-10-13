package Leetcode;

import java.util.ArrayList;
import java.util.HashMap;

//https://leetcode.com/problems/isomorphic-strings/
public class Isomorphic_Strings {
    static boolean isIsomorphic(String s, String t) {
        if(s.length()!=t.length())
            return false;
        HashMap<Character,Character>hm=new HashMap<>();
        for(int i=0;i<s.length();i++){
            if(hm.containsKey(s.charAt(i))){
                char val=hm.get(s.charAt(i));
                if(t.charAt(i)==val )
                    continue;
                else
                    return false;
            }else if(hm.containsValue(t.charAt(i)))
                return false;
            else{
                hm.put(s.charAt(i),t.charAt(i));
            }
        }
        return true;

    }
    public static void main(String args[]){
     System.out.println(isIsomorphic("ab","aa"));
    }
}
