package Leetcode;
//https://leetcode.com/problems/minimum-index-sum-of-two-lists/submissions/
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;

public class Minimum_Index_Sum_of_Two_Lists {
    static String[] findRestaurant(String[] list1, String[] list2) {
        HashMap<Integer,ArrayList<String> >hashMap=new HashMap<>();
        ArrayList<String>arr;
        for(int i=0;i<list1.length;i++){
            String val = list1[i];
            if (Arrays.asList(list2).contains(val)){
                int sum=i+Arrays.asList(list2).indexOf(val);
                if(hashMap.containsKey(sum)) {
                    arr=new ArrayList<>();
                    arr=hashMap.get(sum);
                    arr.add(val);
                    hashMap.put(sum,arr);

                }
                else{
                    arr=new ArrayList<>();
                    arr.add(val);
                    hashMap.put(sum,arr);
                }
            }
        }
        int min_index_sum = Integer.MAX_VALUE;
        for (int key: hashMap.keySet())
            min_index_sum = Math.min(min_index_sum, key);
        String[] res = new String[hashMap.get(min_index_sum).size()];
        return hashMap.get(min_index_sum).toArray(res);
    }
    public static void main(String args[]){
        String[] list1={"Shogun","Tapioca Express","Burger King","KFC"};
        String[] list2={"Piatti","The Grill at Torrey Pines","Hungry Hunter Steakhouse","Shogun"};
        System.out.println(Arrays.toString(findRestaurant(list1,list2)));//shogun
        list1=new String[]{"Shogun","Tapioca Express","Burger King","KFC"};
        list2=new String[] {"KFC","Shogun","Burger King"};
        System.out.println(Arrays.toString(findRestaurant(list1,list2)));//shogun
        list1=new String[]{"Shogun","Tapioca Express","Burger King","KFC"};
        list2=new String[] {"KFC","Burger King","Tapioca Express","Shogun"};
        System.out.println(Arrays.toString(findRestaurant(list1,list2)));//["KFC","Burger King","Tapioca Express","Shogun"]
        list1=new String[]{"Shogun","Tapioca Express","Burger King","KFC"};
        list2=new String[] {"KNN","KFC","Burger King","Tapioca Express","Shogun"};
        System.out.println(Arrays.toString(findRestaurant(list1,list2)));//["KFC","Burger King","Tapioca Express","Shogun"]
        list1=new String[]{"KFC"};
        list2=new String[] {"KFC"};
        System.out.println(Arrays.toString(findRestaurant(list1,list2)));//kfc
        list1=new String[]{"Shogun","Piatti","Tapioca Express","Burger King","KFC"};
        list2=new String[] {"Piatti","The Grill at Torrey Pines","Hungry Hunter Steakhouse","Shogun"};

        System.out.println(Arrays.toString(findRestaurant(list1,list2)));//piatti
    }
}
