class Solution {
    public void setZeroes(int[][] matrix) {
        // total rows
        int t_r=matrix.length; 
        //total columns
        int t_c=matrix[0].length;  

        //lest set a seprate row and column array to store zero
        int[] row= new int[t_r];
        int[] column= new int[t_c];
        
  for(int i=0;i<t_r;i++) 
       {
          for(int j=0;j<t_c;j++)
          {if(matrix[i][j]==0) {row[i]=1; column[j]=1;}}
       }
      for(int i=0;i<t_r;i++) 
       {
          for(int j=0;j<t_c;j++)
          {if(row[i]==1 || column[j]==1) matrix[i][j]=0;}
       }

}
}