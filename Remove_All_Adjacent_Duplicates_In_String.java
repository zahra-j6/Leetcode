package Leetcode;

import java.util.Stack;
//https://leetcode.com/problems/remove-all-adjacent-duplicates-in-string/submissions/
public class Remove_All_Adjacent_Duplicates_In_String {
    static String removeDuplicates(String s) {
        Stack<Character> st=new Stack<>();
        char val=s.charAt(0);
        int cnt=0;
        st.push(val);
        for(int i=1;i<s.length();i++){
            if(s.charAt(i)==val){
                st.pop();
                if(st.isEmpty())
                    val=' ';
                else

                val=st.elementAt(st.size()-1);
            }
            else{
                val=s.charAt(i);
                st.push(val);
                cnt++;
            }
        }
        String res="";
        while(!st.isEmpty()){
            val=(char)st.elementAt(0);
            st.removeElementAt(0);

            res=res+val;

        }
        return res;

}
public static void main(String args[]){
    System.out.println(removeDuplicates("abbaca"));//t

}
}
