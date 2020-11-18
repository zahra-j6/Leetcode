package Leetcode;
//https://leetcode.com/problems/baseball-game/submissions/
import java.util.*;

public class Baseball_Game {
    static int calPoints(String[] ops) {
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0; i < ops.length; i++) {
            String val = ops[i];
            if (val.contentEquals("+")) {
                arr.add(arr.get(arr.size()-1) + arr.get(arr.size()-2));
            } else if (val.contentEquals("C"))
                arr.remove(arr.size()-1);
            else if (val.contentEquals("D"))
                arr.add(arr.get(arr.size() - 1) * 2);
            else
                arr.add(Integer.parseInt(ops[i]));

        }
        int sum = 0;                            //To find the sum of array elements
        for (int i : arr) {
            sum += i;
        }
        return sum;

    }

    public static void main(String args[]) {
        Stack<Character> st=new Stack<>();
        st.push('a');
        st.push('v');
        //char val2=st.eremoveElementAt(0);
        Queue <Integer> q=new LinkedList<>();
        Queue <Integer> p=new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
       // It
        while(!q.isEmpty()){
            int val=q.poll();
            p.add(val);
        }

        p= (Queue<Integer>) Collections.reverseOrder();
        q.remove();


        String ops[]={"5","2","C","D","+"};
        System.out.println(calPoints(ops));//30
        ops=new String[]{"5","-2","4","C","D","9","+","+"};
        System.out.println(calPoints(ops));//27
        ops=new String[]{"1"};
        System.out.println(calPoints(ops));//1


    }
}
