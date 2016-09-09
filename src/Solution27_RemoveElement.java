
public class Solution27_RemoveElement {
	   public int removeElement(int[] nums, int val) {
//		   Hash
		   
		   if (nums.length == 1) {
			   if (val == nums[0]) {
				   System.out.println("haha");
				   nums = new int[] {};
				   return 1;
			   }
		   }
		   
		   int size = 0;
		   int diff = 0;
		   for (int i =0; i < nums.length; i++) {
			   if (nums[i] == val) {
				   size ++;
			   } else {
				   nums[diff++] = nums[i];
			   }
		   }
		
		   System.out.println("size:" + size);
		   for (int i =0; i< nums.length; i++) {
			   System.out.println("nums:" + nums[i]);
		   }
		   return size;
	    }
	   
	   public static void main(String[] args) {
		   Solution27_RemoveElement sr = new Solution27_RemoveElement();
//		   sr.removeElement(new int[] {3,2,2,3}, 2);
		   sr.removeElement(new int[] {1}, 1);
		
	}
	   
}
