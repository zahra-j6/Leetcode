package Leetcode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Stack;

public class Basic_Calculator {
    static int calculate(String s) {
        s=s.trim();
        LinkedList<Character> q=new LinkedList<>();
        Stack<String> st=new Stack<>();
        int sum=0;
            if(!s.contains("(") && s.contains("+") || s.contains("-")){
                for(int i=0;i<s.length();i++){
               // System.out.println(s.charAt(i));
                if(s.charAt(i)=='"')
                    continue;
                else if(s.charAt(i)=='+' ||s.charAt(i)=='-' ||Character.isDigit(s.charAt(i))){
                    q.push(s.charAt(i));
                }            }
                sum=Integer.parseInt(String.valueOf(q.remove(q.size()-1)));
                while(!q.isEmpty()){
                    char val=q.remove(q.size()-1);
                    if(val=='+')
                        sum=sum+Integer.parseInt(String.valueOf(q.remove(q.size()-1)));
                    else
                        sum=sum-Integer.parseInt(String.valueOf(q.remove(q.size()-1)));

                }return sum;}
            else if(s.contains("(")){

                int j=0;
                for(int i=0;i<s.length();i++){
                if(s.charAt(i)!=')')
                {
                    if(s.charAt(i)==' ')
                        continue;
                    else
                    st.push(String.valueOf(s.charAt(i)));

                }
                else{
                    sum = Integer.parseInt(st.pop());
                    while(!st.peek().equals("(")) {

                        String ch = st.pop();
                        if (ch.equals("+")) {
                            sum = sum+ + Integer.parseInt(st.pop());
                        } else {
                            sum = Integer.parseInt(st.pop()) - sum;
                        }
                    }
                    st.push(String.valueOf(sum));
                }
            }
                sum = Integer.parseInt(st.pop());
                while(!st.isEmpty()){
                   String val=st.pop();
                    if(val.equals("-")){
                        sum = Integer.parseInt(st.pop()) - sum;
                    }else if(val.equals("+")){
                        sum=sum+Integer.parseInt(st.pop());
                    }}
                return sum;
            }else
                return Integer.parseInt(s);


    }
    public static void main(String args[]){
        System.out.println(calculate("1 + 1"));//2
        System.out.println(calculate("2-1 + 2 "));//3
        System.out.println(calculate("(1+(4+5+2)-3)+(6+8)"));//3
        System.out.println(calculate("2147483647"));
        System.out.println(calculate("(1)"));
        System.out.println(calculate("   (  3 ) "));
        System.out.println(calculate("1-11"));


    }

}
