
public class Solution6_ZigZagConversion {
public static void main(String[] args) {
//	convert ("PAYPALISHIRING", 3);
//	convert ("ABC", 2);
	convert ("ABCD", 2);
	convert ("ABCDE", 4);
	convert ("A", 1);
}

public static String convert(String s, int numRows) {
	// 有几列就new几个新列
	StringBuilder sb[] = new StringBuilder[numRows] ;
	
	// 为新列赋值
	for (int i = 0; i< numRows; i++) {
		sb[i] = new StringBuilder (64);
	}
	
	// 
//	if (numRows % 2 != 0) {
		for (int i = 0; i< s.length(); i++) {
			System.out.println("i:" + i);
			System.out.println("reminder:" + (i % (numRows +1)));
			// 一个轮回的总数  一列＋中间衔接  numRows ＋ （numRows －2）减去上下列
			int reminder = ( 2 * numRows - 2) == 0 ? 0 :i % ( 2 * numRows - 2);
			if (reminder < numRows) {
				sb[reminder].append(s.charAt(i));
				
			} else {
				sb[2 * numRows - 2 - reminder].append(s.charAt(i));
			}

		}
//	} else {
//
//		
//		for (int i = 0; i< s.length(); i++) {
//			System.out.println("i:" + i);
//			System.out.println("reminder:" + (i % (numRows +1)));
//			int reminder = i % (numRows);
////			if (reminder == numRows) {
////				sb[numRows/2].append(s.charAt(i));
////			} else {
////				sb[reminder].append(s.charAt(i));
////			}
//			sb[reminder].append(s.charAt(i));
//			
////			if (reminder < numRows / 2) {
////				sb[reminder].append(s.charAt(i));
////			} else {
////				if (reminder == numRows) {
////					sb[reminder/2].append(s.charAt(i));
////				} else {
////					sb[reminder + 1].append(s.charAt(i));
////				}
////				
////			} 
////			sb[reminder].append(s.charAt(i));
//		}
//	}
	

	
	StringBuilder result = new StringBuilder(64);
	for (int i = 0; i< numRows; i++) {
		System.out.println(sb[i].toString());
		result.append(sb[i]);
	}
	
	
	
	System.out.println("result.toString()" + result.toString());
    return result.toString();
}
}
