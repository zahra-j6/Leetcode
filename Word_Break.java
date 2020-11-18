package Leetcode;

import org.apache.commons.lang.StringUtils;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.lang.*;

public class Word_Break {
    static boolean wordBreak(String s, List<String> wordDict) {

        if(wordDict.size()==1 && !s.equals(wordDict.get(0))||wordDict.isEmpty())
            return false;
        Collections.sort(wordDict);
        StringBuilder builder = new StringBuilder(s);
        String match = "";

        for(int i=0;i<wordDict.size();i++){
           String val=wordDict.get(i);
           int len=val.length();
           String rep="*";
           rep=rep.repeat(len);
           for(int j=0;j<=builder.length()-len;j++){
               if (builder.substring(j,j+len).equals(val)){
                  builder.replace(j,j+len,rep);
                  match=match+rep;
               }



           }
       }
        if (builder.toString().equals(match))
            return true;

       else
           return false;

/*


        for(int i=0;i<wordDict.size();i++){
        int cnt=StringUtils.countMatches(s, wordDict.get(i));
        }
            return true;

        char arr[]=s.toCharArray();
        int i1=0,i2=0, k=0;
        while(i2<s.length()-1){
            int j=1;
            char a=wordDict.get(k).charAt(0);
            char b=wordDict.get(k).charAt(wordDict.get(k).length()-1);
            i1=s.indexOf(a,i2);
            i2=s.indexOf(b,i1);
            for(int i=i1+1;i<i2;i++) {
                if (arr[i] != wordDict.get(k).charAt(j))
                    return false;
                j++;
            }
            k++;
        }
        return true;






     //   int i=0,j=0,index=s.length(),start=0;
        /*Collections.sort(wordDict, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return Math.max(o1.length(),o2.length());
            }
        });
    //    Collections.reverse(wordDict);*/
    /*    while(i<s.length()){
            try {
                if (wordDict.contains(s.substring(start,index))) {
                    int len = s.substring(start,index).length();
                    i = i + len;
                    start=i;
//                    j++;
                    index=s.length();
                }else{
                    index--;
                }
              //  j++;
            }catch(Exception e){
             //   System.out.println(e);
                return false;
            }


        }
        if (i>=s.length())
            return true;
        else
            return false;*/

    }
    public static void main(String[] args){
        System.out.println("For s=leetcode"+wordBreak("leetcode", Arrays.asList(new String[]{"leet", "code"})));//t
        System.out.println("For s=applepenapple"+wordBreak("applepenapple", Arrays.asList(new String[]{"apple", "pen"})));//t
        System.out.println("For s=catsandog"+wordBreak("catsandog", Arrays.asList(new String[]{"cats", "dog", "sand", "and", "cat"})));//f
        System.out.println("For s=cars"+wordBreak("cars", Arrays.asList(new String[]{"car", "ca", "rs"})));//t
        System.out.println("For s=aaaaaaa"+wordBreak("aaaaaaa", Arrays.asList(new String[]{"aaaa", "aaa"})));//t
        System.out.println("For s=aaaaaaa"+wordBreak("aaaaaaa", Arrays.asList(new String[]{"aaaa", "aa"})));//f
        System.out.println("For s=ab"+wordBreak("ab", Arrays.asList(new String[]{"a", "b"})));//t
        System.out.println("For s=cbca"+wordBreak("cbca", Arrays.asList(new String[]{"a", "b"})));//f
        System.out.println("For s=cbca"+wordBreak("cbca", Arrays.asList(new String[]{"bc", "ca"})));//f
        System.out.println("For s=a"+wordBreak("a", Arrays.asList(new String[]{"a"})));//f

    }

}