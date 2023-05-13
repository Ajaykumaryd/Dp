package dpGrids;

public class MinimumPathSum {
	public int minPathSumrec(int[][] grid) {
	    
	    int m=grid.length;
	    int n=grid[0].length;
	    return minPathSum1(m-1,n-1,grid);
	    }
	    public int minPathSum1(int m,int n,int[][]a) 
	    {
	     if(m==0 && n==0){
	         return a[0][0];
	     }

	     if(m<0||n<0){
	         return 1000000;
	     }

	    int up=a[m][n]+minPathSum1(m-1,n,a); 
	    int left=a[m][n]+minPathSum1(m,n-1,a);
	    return Math.min(up,left);
	    }
	    
	
	    
	    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int arr[][]= {{1,3,1},{1,5,1},{4,2,1}};
     int a[][]={{1,2,3},{4,5,6}};
     System.out.println(dp(a));
	}

}
