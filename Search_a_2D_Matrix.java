package Leetcode;
//https://leetcode.com/problems/search-a-2d-matrix/submissions/
public class Search_a_2D_Matrix {
    static boolean searchMatrix(int[][] matrix, int target) {
        int r=matrix.length;
        try{
            int c=matrix[0].length;
            for(int i=0;i<r;i++){
                for(int j=0;j<c;j++){
                    if(matrix[i][j]==target)
                        return true;
                }
            }
            return false;
        }catch(Exception e){
            return false;
        }


    }
    public static void main(String[] args){
        int mat[][]={{1,3,5,7},{10,11,16,20},{23,30,34,50}};
        System.out.println(searchMatrix(mat,3));//t
        mat =new int[][] {{1,3,5,7},{10,11,16,20},{23,30,34,50}};
        System.out.println(searchMatrix(mat,13));//f
        mat =new int[][] {{}};
        System.out.println(searchMatrix(mat,0));//f

    }
}
