
public class Solution26_RemoveDuplicatesFromSortedArray {
	 public int removeDuplicates(int[] nums) {
		 if (nums == null || nums.length ==0 )
			 return 0;
	     if (nums.length == 1)
	        return 1;
	     
	     if (nums.length == 2) {
	    	 if (nums[0] == nums[1]) {
	    		 return 1;
	    	 } else {
	    		 return 2;
	    	 }
	     }
		 int cur = nums[0];
		 int count = 0;
		 boolean isSame = false;
		 for (int index = 1; index < nums.length; index++) {
			 if (cur == nums[index]) {
				 if (!isSame) {
					 nums[count++] = cur;
					 isSame = true;
				 }
				 continue;
			 } else {
				 isSame = false;
				 nums[count++] = cur;
				 cur = nums[index];
//				 nums[count++] = cur;
//				 count++;
			 }
		 }
		 System.out.println(count);
		 for (int i =0; i< nums.length;i++)
			 System.out.println(nums[i]);
		 return count;
	        
	 }
	 
	 public static void main(String[] args) {
		 Solution26_RemoveDuplicatesFromSortedArray ss = new Solution26_RemoveDuplicatesFromSortedArray();
//		 ss.removeDuplicates(new int[] {1,1});
//		 ss.removeDuplicates(new int[] {1,2});
//		 ss.removeDuplicates(new int[] {1,2,2});
		 ss.removeDuplicates(new int[] {1,1,2});
	}
}
