package dpStrings;

public class lcs {
	
	
	
	public static int lcsrec(String t1, String t2) {
	    
	     return lcs(t1,t2,t1.length()-1,t2.length()-1);
	    }

	public static int lcs(String t1, String t2,int i1,int i2) {
	    
	    if(i1<0||i2<0){
	        return 0;
	    }
	    if(t1.charAt(i1)==t2.charAt(i2)){
	        return 1+lcs(t1,t2,i1-1,i2-1);
	    }
	    return 0+Math.max(lcs(t1,t2,i1-1,i2),lcs(t1,t2,i1,i2-1));
	   }
	   
    public static int memo(String t1, String t2) {
		    
		    int dp[][]=new int[t1.length()][t2.length()];
		    for(int i=0;i<dp.length;i++){
		        for(int j=0;j<dp[0].length;j++){
		            dp[i][j]=-1;
		        }
		    }   
		     return lcsmemo(t1,t2,t1.length()-1,t2.length()-1,dp);
		    }

	public static int lcsmemo(String t1, String t2,int i1,int i2,int dp[][]) {
		    
		    if(i1<0||i2<0){
		        return 0;
		    }
		    if(dp[i1][i2]!=-1){
		        return dp[i1][i2];
		    }

		    if(t1.charAt(i1)==t2.charAt(i2)){
		     return dp[i1][i2]=1+lcsmemo(t1,t2,i1-1,i2-1,dp);
		    }
		    return dp[i1][i2]=0+Math.max(lcsmemo(t1,t2,i1-1,i2,dp),lcsmemo(t1,t2,i1,i2-1,dp));
		   }
				 
    public int longestCommonSubsequence(String s1, String s2) {
			    

			      int m=s1.length(),n=s2.length();
			      int dp[][]=new int[m+1][n+1];
			      
			    //   base case
			      for(int j=0;j<=n;j++)dp[0][j]=0;
			      for(int i=0;i<=m;i++)dp[i][0]=0;
			      
			      for(int i=1;i<=m;i++){
			          for(int j=1;j<=n;j++){
			            if(s1.charAt(i-1)==s2.charAt(j-1)) dp[i][j]            =1       +dp        [i-1][j-1];  
			           else dp[i][j]=Math.max(dp[i-1][j],dp[i][j-1]);
			          }
			      }
			      return dp[m][n];   
			   }
				   
    public static int lcs2(String s1,String s2,int i,int j){
    	
//    	if(i==s1.length()){
//    	return 0;	
//    	}
//    	if(j==s2.length()){
//    	return 0;	
//    	}
    	if(i==s1.length()||j==s2.length()){
    		return 0;
    	}
    	
        if(s1.charAt(i)==s2.charAt(j)){
        return 1+lcs2(s1,s2,i+1,j+1);	
        }
        else return Math.max(lcs2(s1,s2,i+1,j),lcs2(s1,s2,i,j+1));
    }
    
    
    public static void main(String[] args) {
                                 
       
       String s1="abcde";
       String s2="ace";
       System.out.println(lcsrec(s1,s2));
       System.out.println(lcs2(s1,s2,0,0));
       }        
     }
