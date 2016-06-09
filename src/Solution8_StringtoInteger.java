public class Solution8_StringtoInteger {
	public static void main(String[] args) {
		// myAtoi("987+");
		// myAtoi("1");
		// myAtoi("9223372036854775809");
		// myAtoi("+1");
		// myAtoi("-1");
		// myAtoi("    010");

		// myAtoi("  -0012a42");
		// myAtoi("abc");
		// myAtoi("-3924x8fc");
		// myAtoi("   -04f");
		// myAtoi("2147483648");
		// myAtoi("-2147483648");
		// myAtoi("9223372036854775809");
		myAtoi("+");

		// Line 18: java.lang.NumberFormatException: For input string: ""
	}

	public static int myAtoi(String str) {
		// deal with null and empty string
		if (str == null || "".equals(str))
			return 0;
		// rmeove redundanct space
		str = str.trim();

		// dealwith negative and positive issues
		boolean isNegtive = false;

		// split char array
		char[] chars = str.toCharArray();

		// deal with + and - singal
		if (chars[0] == 43 || chars[0] == 45) {
			if (chars[0] == 45) {
				isNegtive = true;
			}
			// resplit
			str = str.substring(1);
			chars = str.toCharArray();
		}

		for (int i = 0; i < chars.length; i++) {
			if (chars[i] >= 48 && chars[i] <= 57) {
			} else {
				if (i == 0)
					return 0;
				str = str.substring(0, i);
				break;
			}
		}

		long resultlong;
		int resultReal;
		try {
			if (str == null || "".equals(str))
				return 0;
			resultlong = Long.valueOf(str).longValue();
			if (isNegtive) {
				resultlong *= -1;
			}

			if (resultlong >= Integer.MAX_VALUE) {
				return Integer.MAX_VALUE;
			}

			if (resultlong <= Integer.MIN_VALUE) {
				return Integer.MIN_VALUE;
			}

			resultReal = (int) resultlong;
		} catch (NumberFormatException e) {
			e.printStackTrace();
			if (isNegtive) {
				return Integer.MIN_VALUE;
			} else {
				return Integer.MAX_VALUE;
			}
		}
		return resultReal;
	}
}
