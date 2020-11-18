package Leetcode;

import java.io.IOException;
import java.util.LinkedList;

public class Special_String_Again {
    static long substrCount(int n, String s) {
        long cnt=n;
        int index=2;
        for(int i=0;i<n;i++){
            boolean cr=true,done=false;
            int k=0;
            while(k<n) {
                try {
                    String val = s.substring(k, k + index+i);
                    int st = 0, en = val.length() - 1;
                    char abc=val.charAt(0);
                    for (int j = 0; j < val.length() / 2; j++) {
                        if (val.charAt(st) == val.charAt(en) && val.charAt(st)==abc) {
                            st++;
                            en--;
                            cr=true;
                        } else {
                            cr = false;
                            done = true;
                            k++;
                         //   break;
                        }

                    }
                    if (cr == true) {
                        cnt++;
                        done = true;
                        k++;
                       // break;
                    }

                }catch (Exception e){break;}
            }


    }
        return cnt;
}
    public static void main(String[] args) throws IOException {
        long result = substrCount(8, "mnonopoo");
        System.out.println(result);//12
         result = substrCount(5, "asasd");
        System.out.println(result);//7
        result = substrCount(7, "abcbaba");
        System.out.println(result);//10
        result = substrCount(4, "aaaa");
        System.out.println(result);//10
    }
    }
