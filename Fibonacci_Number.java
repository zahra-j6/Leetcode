package Leetcode;

//https://leetcode.com/problems/fibonacci-number/
public class Fibonacci_Number {
    public int fib(int N) {
        if(N<2)
            return N;
        else
            return fib(N-1)+fib(N-2);


    }
    public static void main(String args[]){}
}
