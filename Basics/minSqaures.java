package Basics;

public class minSqaures {
    
	public static int MinSqaures(int n){
	
	
	if(n==0){
	return 0;	
	}
	int min=100;	
	for(int i=1;i*i<=n;i++){
		int curAns=MinSqaures(n-(i*i));
		if(min>curAns){
		min=curAns;	
		}
	}
	int ans=1+min;
	return ans;		
	}
	
	public static int MinSquaresdp2(int n,int dp[]) {
		
		if(n == 0){
		return 0;	
		}
		
		if(dp[n]!=-1){
		return dp[n];	
		}
		int min=100;	
		for(int i=1;i*i<=n;i++){
			int curAns=MinSquaresdp2(n-(i*i),dp);
			if(min>curAns){
			min=curAns;	
			}
		}
		 		
		dp[n] = 1 + min;
		return dp[n];		
	}
    
	public static int MinSquareI(int n,int dp[]) {
	
	dp[0]=0;
	for(int i=1;i<=n;i++){
	int min=100;
	for(int j=1;j*j<=i;j++){
	int curAns=dp[i-(j*j)];
	if(min>curAns){
	min=curAns;	
	}
	}
	dp[i]=1+min;
	}
	return dp[n];
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int n=5;
//    System.out.println(MinSqaures(n));
    int space[]=new int[n+1];
    for(int i=0;i<space.length;i++){
    space[i]=-1;	
    }
//    System.out.println(MinSquaresdp(n,space));
    System.out.println(MinSquaresdp2(n,space));
    System.out.println(MinSquareI(n,space));
//    int arr[]
	}
}
