package Leetcode;

import java.util.ArrayList;
//https://leetcode.com/problems/validate-binary-search-tree/submissions/

     // Definition for a binary tree node.
       class TreeNode {
          int val;
          TreeNode left;
          TreeNode right;
          TreeNode() {}
          TreeNode(int val) { this.val = val; }
          TreeNode(int val, TreeNode left, TreeNode right) {
              this.val = val;
              this.left = left;
              this.right = right;
          }
      }

    public class Binary_Search_Tree {
        ArrayList<Integer> arr=new ArrayList<>();
        void inorder(TreeNode root){

            if(root!=null){
                inorder(root.left);
                arr.add(root.val);
                inorder(root.right);
            }

        }
        public boolean isValidBST(TreeNode root) {
//        ArrayList<Integer> arr=new ArrayList<>();

            inorder(root);
            System.out.println(arr.toString());

            for(int i=0;i<arr.size()-1;i++){
                // System.out.println(arr.get(i).toString()+" "+arr.get(i+1).toString());
                if(arr.get(i)<arr.get(i+1))
                    continue;
                else
                    return false;
            }
            return true;


        }
    }

