
public class Solution7_ReverseInteger {
	public static void main(String[] args) {
		reverse1 (3111);
	}
	
	public static int reverse1 (int n) {
		//输出结果定义为long
				long sum=0;
				while (n!=0)
				{
					int s=n%10;
					sum=sum*10+s;
					n=n/10;
					
					System.out.println("s:" + s);
			  		System.out.println("sum:" + sum);
			  		System.out.println("n:" + n);
				}
				
				//防止溢出操作
				if (sum>Integer.MAX_VALUE||sum<Integer.MIN_VALUE)
				{
					return 0;
				}
				return (int)sum;
	}
	
	  public static int reverse(int x) {
		  int base =1;
		  int result = 0;
		  	while (x / 10 > 10) {
		  		result += base * (x % 10);
		  		x /= 10;
		  		Integer.valueOf("").intValue();
		  		base *= 10;
		  		System.out.println("x:" + x);
		  		System.out.println("base:" + base);
		  		System.out.println("result1:" + result);
		  	}
		  	
//		  	while (base >= 1) {
//		  		result += base * (x % 10);
//		  		System.out.println("x11:" + x);
//		  		x /= 10;
//		  		base /= 10;
//		  		System.out.println("x22:" + x);
//		  		System.out.println("result1:" + result);
//		  	}
		  	
		  	
	        return 0;
	    }
}
