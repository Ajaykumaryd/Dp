package dpGrids;

public class uniquePath {
	
	
	public int uniquePaths(int m, int n) {
	    
	    int dp[][]=new int[m][n];
	    for(int i=0;i<dp.length;i++){
	        for(int j=0;j<n;j++){
	            dp[i][j]=-1;
	        }
	    }
	    return uniquePaths1(dp,m-1,n-1);
	    }

	    public int uniquePaths1(int dp[][],int m, int n) {
	    
	    if(m==0 && n==0){
	     return 1;
	    }

	    if(m<0||n<0){
	       return 0;
	    }
	    
	    if(dp[m][n]!=-1){
	    return dp[m][n];    
	    } 
	    
	    int up=uniquePaths1(dp,m-1,n);
	    int left=uniquePaths1(dp,m,n-1);
	    dp[m][n]=up+left;
	    return dp[m][n];
	    }
	
	
	public static  int uniquePathsdp(int m, int n) {
        
    int dp[][]=new int[m][n];
    for(int i=0;i<m;i++){
      for(int j=0;j<n;j++){
        if(i==0&&j==0) dp[i][j]=1;
      else{
        int up=0;
        int left=0;
        if(i>0)up=dp[i-1][j];
        if(j>0)left=dp[i][j-1];
        dp[i][j]=up+left;
      }
    } 
    }
    return dp[m-1][n-1];
  
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int dp[][]=new int[3][3];
  
    System.out.println(uniquePathsdp(3,3));
	}
}
