package Basics;

public class MinStepsTo1 {
    
	static int steps(int n,int storage[]) {
	
	if(n==1) {
	storage[n]=0;
	return storage[n];
	}
	
	if(storage[n]!=-1){
	return storage[n];	
	}
	
	int op1=steps(n-1,storage);
	int minSteps=op1;
	
	if(n%3==0){
	int op2=steps(n/3,storage);
	if(op2<minSteps){
		minSteps=op2;
	}	
	}
	
	if(n%2==0){
	int op3=steps(n/2,storage);
	if(op3<minSteps){
		minSteps=op3;
	}	
	}
	storage[n]=1+minSteps;
	return storage[n];
	}
	
	public static int stepDp(int n) {
	
	int storage[]=new int[n+1];
	for(int i=2;i<=n;i++) {
	   	int min=storage[i-1];
	    if(i%3==0){
	    if(min>storage[i/3]){
	    min=storage[i/3];	
	      }
	    }
	    if(i%2==0){
		  if(min>storage[i/2]){
		  min=storage[i/2];	
		}	    
	}
	  storage[i]=min+1;  
	}
	return storage[n];
	}
	
	public static void main(String[] args){
	
    int n=5;
    		
	int Storage[]=new int[n+1]; 
	
	for(int i=0;i<Storage.length;i++){
	Storage[i]=-1; 	
	}
	
	int ans=steps(n,Storage);
	System.out.println(ans);
	System.out.println(stepDp(5));
	}
}
