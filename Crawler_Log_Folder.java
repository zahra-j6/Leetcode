package Leetcode;
//https://leetcode.com/problems/crawler-log-folder/submissions/
public class Crawler_Log_Folder {
    static int minOperations(String[] logs) {
        int cnt=0;
        for(int i=0;i<logs.length;i++){
            if(logs[i].contentEquals("../")){
                if(cnt==0)
                    continue;
                else
                cnt-=1;
            }
            else if(logs[i].contentEquals("./"))
                continue;
            else
                cnt+=1;
        }
        if(cnt<0)
            return 0;
        return cnt;
    }

    public static void main(String args[]){
        String logs[]={"d1/","d2/","../","d21/","./"};
        System.out.println(minOperations(logs));//2
        logs=new String[]{"d1/","d2/","./","d3/","../","d31/"};
        System.out.println(minOperations(logs));//3
        logs=new String[]{"d1/","../","../","../"};
        System.out.println(minOperations(logs));//0
        logs=new String[]{"./","wz4/","../","mj2/","../","../","ik0/","il7/"};
        System.out.println(minOperations(logs));//2



    }
}
