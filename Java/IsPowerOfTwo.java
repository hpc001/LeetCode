public class IsPowerOfTwo {
	public class Solution {
	    public boolean isPowerOfTwo(int n) {
	        if(n == 1) return true;
	        while(n>1){
	            if(n%2 != 0){
	                return false;
	            }
	            n = n/2;
	        }
	        if(n!=1) return false;
	        return true;
	    }

    	//Other solution
		public boolean isPowerOfTwo2(int n) {
		    if(n<=0) 
		        return false;
		 
		    while(n>2){
		        int t = n>>1;
		        int c = t<<1;
		 
		        if(n-c != 0)
		            return false;
		 
		        n = n>>1;
		    }
		 
		    return true;
		}
	}
}