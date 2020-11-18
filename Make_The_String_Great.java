package Leetcode;

import java.util.Stack;
//look into edge cases
public class Make_The_String_Great {
    static String makeGood(String s) {
        Stack<Character> st=new Stack<>();
        for(int i=0;i<s.length();i++){
            if(Character.isUpperCase(s.charAt(i))) {
                if (i == 0 && Character.toLowerCase(s.charAt(i)) == s.charAt(i + 1) )
                    return "";
                else if (i == 0 && Character.isLowerCase(s.charAt(i + 1)))
                    st.push(s.charAt(i));
                else if (i == 0 && Character.isUpperCase(s.charAt(i + 1)))
                    return "";

                else{
                    char val=st.peek();
                    if( val==Character.toLowerCase(s.charAt(i)))
                        st.pop();
                    else
                        st.push(s.charAt(i));

                }
            }
            else
                st.push(s.charAt(i));
        }
        String res="";
        while(!st.isEmpty()){
            char val=st.remove(0);
            res=res+val;
        }
        return res;
    }
    public static void main(String args[]){
        System.out.println(makeGood("Pp"));//""
        System.out.println(makeGood("mC"));//"mC"
        System.out.println(makeGood("Hvh"));//"Hvh"
        System.out.println(makeGood("RLlr"));//""""
    }
}
