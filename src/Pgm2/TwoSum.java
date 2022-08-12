package Pgm2;

public class TwoSum {
	public static void main(String[] args) {
		int A[] = { 1, 4, 45, 10, 10, 8 };
        int n = 16;
        int num[]=twoSum(A, n);
        if(num[0]==0 && num[1]==0)
        	System.out.println("Not found!!!");
        else {
        	System.out.println("The required indices are:");
            for(int i:num)
            	System.out.println(i);
        }
        
	}
	public static int[] twoSum(int[] nums, int target) {	        
	        int a[]=new int[2];
	        for(int i=0;i<nums.length;i++){
	            for(int j=0;j<nums.length;j++){
	                if(i!=j && nums[i]+nums[j]==target){
	                    a[0]=i;
	                    a[1]=j;
	                    break;
	                }    
	            }
	        }
	        return a;
	}
}

