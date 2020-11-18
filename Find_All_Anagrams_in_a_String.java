package Leetcode;

import java.util.*;

public class Find_All_Anagrams_in_a_String {
  //  private static HashSet<String> arr=new HashSet<>();
  private static ArrayList<String> arr=new ArrayList<>();
    public static String swap(String a, int i, int j)
    {
        char temp;
        char[] charArray = a.toCharArray();
        temp = charArray[i];
        charArray[i] = charArray[j];
        charArray[j] = temp;
        return String.valueOf(charArray);
    }
    static void permute(String str, int l, int r)
    {
        if (l == r){
            if(!arr.contains(str))
                arr.add(str);

        }
        else {
        for (int i = l; i <= r; i++) {
            str = swap(str, l, i);
            permute(str, l + 1, r);
            str = swap(str, l, i);
            }
        }
    }
    public static List<Integer> findAnagrams(String s, String p) {
        //1. find all permutations of p
        //2. stor in arraylist
        if(s.length()>p.length())
            permute(p,0,p.length()-1);
        else
            permute(s,0,s.length()-1);
        ArrayList<Integer>res=new ArrayList<>();
        Iterator<String> it=arr.stream().iterator();
        while(it.hasNext()){
            String val=it.next();
            int index=0,pos=-1;
            while(index!=-1){
                index=s.indexOf(val, pos+1);
                if(index==-1)
                    break;
                else res.add(index);
                pos=index;
            }

        }

/*
        for(int i=0;i<arr.size();i++){
                int index=0,pos=-1;
                while(index!=-1){
                    index=s.indexOf(arr.get(i), pos+1);
                    if(index==-1)
                        break;
                    else {
//                        if(!res.contains(index))
                        res.add(index);
                    }
                    pos=index;
                }

        }*/
        Collections.sort(res);
        return res;

    }
    public static void main(String[] args){
  //      System.out.println(findAnagrams("cbaebabacd","abc"));//[0,6]
    //    System.out.println(findAnagrams("abab","ab"));//[0,1,2]
      // System.out.println(findAnagrams("baa","aa"));//[1]
      //  System.out.println(findAnagrams("acdcaeccde","c"));//[1,3,6,7]
          System.out.println(findAnagrams("aaaaaaaaaa" ,"aaaaaaaaaaaaa"));//[1,3,6,7]
    }

}
