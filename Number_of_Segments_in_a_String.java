package Leetcode;
//https://leetcode.com/problems/number-of-segments-in-a-string/submissions/
import java.util.Arrays;

public class Number_of_Segments_in_a_String {
    static int countSegments(String s) {
        if(s.isEmpty())
            return 0;
        //!@#$%^&*()_+-=',.:
        String arr[]=s.split(" ");
        int cnt=0;
        for(int i=0;i< arr.length;i++){
          //  System.out.println(arr[i]);
            if(arr[i].isEmpty())
                continue;
            else cnt++;
        }

        return cnt;

    }
    public static void main(String[] args){
        System.out.println(countSegments("Hello, my name is John"));//5
        System.out.println(countSegments("Hello"));//1
        System.out.println(countSegments("love live! mu'sic forever"));//4
        System.out.println(countSegments(""));//0
        System.out.println(countSegments(", , , ,        a, eaefa"));//6
    }

}
