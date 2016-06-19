public class IsPowerOfThree {
    public class Solution {
	    public boolean isPowerOfThree(int n) {
	        if(n == 1) return true;
	        while(n>1){
	            if(n%3 != 0) return false;
	            n=n/3;
	        }
	        if(n!=1) return false;
	        return true;

	    }

	    //Other solution
	    public boolean isPowerOfThree2(int n) {
		    if(n==0) 
		        return false;
		 
		    if(n==1) 
		        return true;
		 
		    if(n>1) 
		        return n%3==0 && isPowerOfThree(n/3);
		    else
		        return false;
		}
	}


}