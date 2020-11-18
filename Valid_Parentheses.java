package Leetcode;

import java.util.Stack;
//https://leetcode.com/problems/valid-parentheses/submissions/
public class Valid_Parentheses {
    static boolean isValid(String s) {
            if(s.length()<2)
                return false;
            Stack<Character>st=new Stack<>();
            char arr[]=s.toCharArray();
            for(int i=0;i<arr.length;i++){
                if(arr[i]=='[' || arr[i]=='{' || arr[i]=='(')
                    st.push(arr[i]);
                else{
                    if(st.isEmpty())
                        return false;
                    char val=st.pop();
                    if(arr[i]==']' && val=='[' || arr[i]=='}' && val=='{' || arr[i]==')'&& val=='(' )
                        continue;
                    else
                        return false;
                }
            }
            if(st.isEmpty())
                return true;
            else
                return false;

    }
    public static void main(String args[]) {
        System.out.println(isValid("[({})(())]"));//t
        System.out.println(isValid("()[]{}"));//t
        System.out.println(isValid("(]"));//f
        System.out.println(isValid("([)]"));//f
        System.out.println(isValid("{[]}"));//t
        System.out.println(isValid("["));//f
        System.out.println(isValid("]"));//f


    }
}
