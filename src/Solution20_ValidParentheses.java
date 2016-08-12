import java.util.HashMap;
import java.util.Stack;


public class Solution20_ValidParentheses {
	 public boolean isValid1(String s) {
		 if (s == null || s.length() == 0) {
			 return false;
		 }
		 
//		 ()[]{}
		 char[] cc = s.toCharArray();
		 for (int i = 0; i < s.length(); i++) {
			 if (cc[i] == '(' || cc[i] == '[' || cc[i] == '{') {
				int j = i;
				for (; j < s.length(); j++) {
					
				}
			 }
		 }
	        return false;
	    }
	 
	 
	 public boolean isValid (String s) {
		 HashMap<Character, Character> map = new HashMap<Character, Character>();
			map.put('(', ')');
			map.put('[', ']');
			map.put('{', '}');
		 
			Stack<Character> stack = new Stack<Character>();
		 
			for (int i = 0; i < s.length(); i++) {
				char curr = s.charAt(i);
		 
				if (map.keySet().contains(curr)) {
					stack.push(curr);
				} else if (map.values().contains(curr)) {
					if (!stack.empty() && map.get(stack.peek()) == curr) {
						stack.pop();
					} else {
						return false;
					}
				}
			}
		 
			return stack.empty();
	 }
	 
	 public static void main(String[] args) {
		
	}
}
