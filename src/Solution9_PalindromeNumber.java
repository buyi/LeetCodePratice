
public class Solution9_PalindromeNumber {
public static void main(String[] args) {
	boolean result = isPalindrome(-2147447412);
	
			System.out.println("reslut" + Integer.MIN_VALUE);
	
}
public static boolean isPalindrome(int x) {
	if (x > Integer.MAX_VALUE || x < Integer.MIN_VALUE)
		return false;
	
	if (x < 0) return false;
	int sum = 0;
	int orignX = x;
    while (x != 0) {
    	int remider = x % 10;
    	sum = sum * 10 + remider;
    	x = x / 10;
    }
//	System.out.println("sum" + sum);
    if (sum == orignX) {
    	return true;
    } else {
    	return false;
    }
}
}
