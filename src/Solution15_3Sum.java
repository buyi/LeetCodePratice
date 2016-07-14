import java.util.ArrayList;
import java.util.List;


public class Solution15_3Sum {

//	public class Solution {
	    public static List<List<Integer>> threeSum(int[] nums) {
	        int length = nums.length;
	        List<List<Integer>> result = new ArrayList<List<Integer>>();
	        if (length < 3)
	        	return result;
	        for (int first = 0; first < length; first++) {
	        	 for (int second = 1; second < length; second++) {
	        		 for (int third = 2; third < length; third++) {
	 	 	        	if (nums[first] + nums[second] + nums[third ] == 0) {
	 	 	        		List<Integer> ss = new ArrayList<Integer>();
	 	 	        		ss.add(first);
	 	 	        		ss.add(second);
	 	 	        		ss.add(third);
	 	 	        		result.add(ss);
	 	 	        	}
	 	 	        }
	 	        }
	        }
	        System.out.println("reslut" + result);
	        return result;
	    }
//	}
	
	public static void main(String[] args) {
		Solution15_3Sum.threeSum(new int [] {-1,0,1,2,-1,-4});
		
		
	}
}
