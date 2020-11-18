package Leetcode;
//https://leetcode.com/problems/number-of-recent-calls/submissions/
import java.util.LinkedList;

public class Number_of_Recent_Calls {
    LinkedList<Integer> slideWindow;

    public Number_of_Recent_Calls() {
        this.slideWindow = new LinkedList<Integer>();
    }

    public int ping(int t) {
        // step 1). append the current call
        this.slideWindow.addLast(t);

        // step 2). invalidate the outdated pings
        while (this.slideWindow.getFirst() < t - 3000)
            this.slideWindow.removeFirst();

        return this.slideWindow.size();

    }
}
