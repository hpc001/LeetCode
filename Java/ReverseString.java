public class ReverseString{
	public class Solution {
	    public String reverseString(String s) {
	        char[] str = new char[s.length()];
	        int x = 0;
	        for(int i = s.length()-1; i>=0; i--){
	            str[x] = s.charAt(i);
	            x++;
	        }
	        return new String(str);
	    }
	    public String reverseString2(String s) {
        	StringBuilder sb = new StringBuilder(s);
        	return sb.reverse().toString();
    	}
	}
}