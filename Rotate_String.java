package Leetcode;

//https://leetcode.com/problems/rotate-string/
public class Rotate_String {
    public static boolean rotateString(String A, String B) {
        if(A.equals(B))
            return true;
        if(A.isEmpty()&&!B.isEmpty())
            return false;
        if(!A.isEmpty() && B.isEmpty())
            return false;
        String ans="";
        for(int i=0;i<100;i++){
            char a=A.charAt(0);

                A = A.substring(1, A.length());
                A = A + a;
                if (A.equals(B))
                    return true;

           // else
             //   ans="";
        }
        return false;

    }
    public static void main(String args[]){
        System.out.println(rotateString("gcmbf" ,"fgcmb"));
    }
}
