import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class solution17_LetterCombinationsOfAPhoneNumber {

	
	  String[] alphas = new String[] {"a","b","c","d","e","f","g",
			  "h","i","j","k","l","m","n",
			  "o","p","q","r","s","t",
			  "u","v","w","x","y","z"};
	  public List<String> letterCombinations1(String digits) {
	        Map<String, List<String>> storge = new HashMap<String, List<String>>();
	        List<String> result = new ArrayList<String>();
	        
	        int span = 3;
	        for (int i = 0; i< 8; i++) {
	            List<String> values = new ArrayList<String>();
	            if (i == 6 || i == 7) {
	            	values.add(alphas[span * i + 1]);
	            	values.add(alphas[span * i + 2]);
	            	values.add(alphas[span * i + 3]);
	            } else {
	            	values.add(alphas[span * i]);
	   		        values.add(alphas[span * i + 1]);
	   		        values.add(alphas[span * i + 2]);
	            }
	         
		        if (i == 5) {
		        	values.add(alphas[span * i + 3]);
		        } else if (i == 7) {
		        	values.add(alphas[span * i + 4]);
		        }
		     
		        storge.put("" + (i + 2), values);
		       
	        }
	        List<String> values = new ArrayList<String>();
	        values.add("+");
	        storge.put("*", values);
	        
	        values = new ArrayList<String>();
	        values.add("");
	        storge.put("#", values);
	        
	        values = new ArrayList<String>();
	        values.add(" ");
	        storge.put("0", values);
	        
	        System.out.println("values:" + storge);
	        
	        if (digits == null || digits.length() == 0) return result;
	        
	        StringBuilder sb = new StringBuilder();
	        char[] digitss = digits.toCharArray();
	        for (int i = 0; i < digitss.length; i++) {
	        	List<String> ls = storge.get("" + digitss[i]);
	        	for (String temp : ls ) {
	        		System.out.println("temp:" + temp);
	        		sb.append(temp);
	        	}
	        	
	        }
	        return null;
	    }
	  
	    private String[] alpha = new String[] {  
	            " ",  
	            "1", "abc", "def",  
	            "ghi", "jkl", "mno",  
	            "pqrs", "tuv", "wxyz"  
	    };  
	    private StringBuilder word;  
	  
	    private void dfs(List<String> res, String digits, int cur) {  
	        if (cur >= digits.length()) {  
	            res.add(word.toString());  
	        } else {  
	            for (int i = 0; i < alpha[digits.charAt(cur) - '0'].length(); ++i) {  
	                word.append(alpha[digits.charAt(cur) - '0'].charAt(i));  
	                dfs(res, digits, cur + 1);  
	                word.deleteCharAt(word.length() - 1);  
	            }  
	        }  
	    }  
	  
	    public List<String> letterCombinations(String digits) {  
	        List<String> ret = new ArrayList<String>();  
	        word = new StringBuilder();  
	        dfs(ret, digits, 0);  
	        System.out.println("ret:"+ret);
	        return ret;  
	    }  
	  
	  public static void main(String[] args) {
		  solution17_LetterCombinationsOfAPhoneNumber s = new solution17_LetterCombinationsOfAPhoneNumber();
		  s.letterCombinations("234");
	}
}
