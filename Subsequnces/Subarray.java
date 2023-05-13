package Subsequnces;

public class Subarray {

        
    	static Boolean ans(int arr[],int sum,int i){           
    	    
    		if(sum==0){return true;}    		
    		if(i==0){
    	          return (arr[0]==sum);
    	      }             	      
    	      boolean notake=ans(arr,sum,i-1);
    	      
    	      boolean take=false;
    	      if(arr[i]<=sum){
    	    	  
    	         take= ans(arr,sum-arr[i],i-1);
    	      }
    	       return notake||take;     	          
    	   }  

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int a[]= {2,3,-2,4};
//      System.out.println(maxProduct(a)); 
	}
}
