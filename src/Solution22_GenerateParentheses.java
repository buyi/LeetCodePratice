import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Stack;


public class Solution22_GenerateParentheses {
	
	
//	  public List<String> generateParenthesis(int n) {
//		  
//		  HashMap<Character, Integer> map = new HashMap<Character, Integer>();
//			map.put('(', 0);
//			map.put(')', 0);
//		  List<String> result = new ArrayList<String>();
//		  if (n == 0)
//			  return result;
//		  
//		  
//		  int length = n* 2;
//		  Stack<Character> stack = new Stack<Character>();
//		  StringBuilder sb = new StringBuilder(64);
//		  for (int index = 0;  index< length; index++) {
//			  if (index == 0) {
//				  sb.append("(");
//				  stack.push('(');
//				  map.put('(', 1);
//				  index ++;
//			  }
//			  
//			  if (map.get('(') < n) {
//				  sb.append("(");
//				  map.put('(', map.get('(') + 1);
//				  stack.push('(');
//				  index++;
//			  }
//			  
//			  if (map.get(')') < n) {
//				  sb.append(")");
//				  map.put(')', map.get(')') + 1);
//				  
//				  stack.push(')');
//				  
//				  Character c = stack.pop();
//				  if (c.equals(')')) {
//					  
//				  }
//			  }
//		  }
//	        
//	  }
	
	public static void main(String[] args) {
		Solution22_GenerateParentheses s = new Solution22_GenerateParentheses();
		s.generateParenthesis(2);
	}
	
	
	public List<String> generateParenthesis(int n) {
	    ArrayList<String> result = new ArrayList<String>();
	    dfs(result, "", n, n);
	    return result;
	}
	/*
	left and right represents the remaining number of ( and ) that need to be added. 
	When left > right, there are more ")" placed than "(". Such cases are wrong and the method stops. 
	*/
	public void dfs(ArrayList<String> result, String s, int left, int right) {
	    if(left > right)
	        return;
	 
	    if(left==0&&right==0){
	        result.add(s);
	        return;
	    }
	 
	    if(left>0){
	        dfs(result, s+"(", left-1, right);
	    }
	 
	    if(right>0){
	        dfs(result, s+")", left, right-1);
	    }
	}

}
