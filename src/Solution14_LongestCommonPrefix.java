
public class Solution14_LongestCommonPrefix {
	public static void main(String[] args) {
		String[] strs = new String[2];
		strs[0] = "abcvhu";
		strs[1] = "a  bc";
		longestCommonPrefix(strs);
	}
	
	   public static  String longestCommonPrefix(String[] strs) {
           
	        if (strs.length == 0)  
	          return "";  
	          
	        String prefix = strs[0];  
	        for (int i = 1; i < strs.length; ++i)  
	        {  
	            if (prefix.length() == 0 || strs[i].length() == 0)  
	               return "";  
	              
	            int len = prefix.length() < strs[i].length() ? prefix.length() : strs[i].length();  
	              
	            int j;  
	              
	            for (j = 0; j < len; ++j)  
	            {  
	                if (prefix.charAt(j) != strs[i].charAt(j))  
	                    break;  
	            }  
	  
	            prefix = prefix.substring(0,j);  
	              
	        }  
	         System.out.println(prefix);
	        return prefix;  
	        
	    }
}
