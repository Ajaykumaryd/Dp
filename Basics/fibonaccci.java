package Basics;

public class fibonaccci {
   
	public static int fibo(int n,int[] storage) {
	
	if(n==0||n==1){
     return n;
	}
	
	if(storage[n]!=-1){
	return storage[n];	
	}
		
	storage[n]=fibo(n-1,storage)+fibo(n-2,storage);	
	return storage[n];	
				
	}
	
	public static int fiboDp(int n,int storage[]) {
	
	storage[0]=0;
	storage[1]=1;;
	for(int i=2;i<storage.length;i++){
	storage[i]=storage[i-1]+storage[i-2];	
	}
	return storage[n];
	
	}
	
	public static void main(String[] args) {
	
	int n=20;
	int storage[]= new int[n+1];
	for(int i=0;i<storage.length;i++){
	storage[i]=-1;	
	}
    System.out.println(fibo(n,storage));		
    System.out.println(fiboDp(n,storage));
	}
		
}
