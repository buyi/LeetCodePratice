import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Solution16_3SumClosest {
	
	public static void main(String[] args) {
		Solution16_3SumClosest s = new Solution16_3SumClosest();
//		s.threeSumClosest(new int[] {-1, 2, 1, -4}, 1);
//		s.threeSumClosest(new int[] {0, 0, 0}, 1);
//		s.threeSumClosest(new int[] {0, 1, 2}, 3);
//		s.threeSumClosest(new int[] {1, 1, 1, 0}, 100);
		s.threeSumClosest(new int[] {0, 2, 1, -3}, 1);
	}
	  public int threeSumClosest(int[] nums, int target) {
		  
		  if (nums == null) {
			  return 0;
		  }
		  

		  int numLength = nums.length;
		  if (numLength < 3) {
			  return 0;
		  }
		  
		  Arrays.sort(nums);
		  int Tdiff = -1;
		  List<Integer> result = new ArrayList<Integer>();
		  for (int i = 0; i < numLength -2; i++ ) {
			  
			  if (i > 0 && nums[i] == nums[i - 1]) continue;
			  
			  int start = i + 1;
			  int end = numLength - 1;
			  
			  while (start < end) {
				  int diff = nums[start] + nums[end] + nums[i] - target;
				  System.out.println("diff1:" + diff);
				  
				  if (Tdiff == -1) {
					  Tdiff = Math.abs(diff);
				  }
				  
				  // 等于时需要处理三个数值
				  if (Math.abs(diff) <= Tdiff) {
					  Tdiff = Math.abs(diff);
					  // 清空上一次的结果
					  result.clear();
					  result.add(nums[start]);
					  result.add(nums[end]);
					  result.add(nums[i]);
				  }
					 
				  
				  // 单次叠加 避免漏
				  if (diff < 0) {
					  start ++;
				  } else {
					  end --;
				  }
			  }
		  }
		  System.out.println("target:" + target);
		  System.out.println("Tdiff:" + Math.abs(Tdiff));
		  System.out.println("diff:" + (target + Math.abs(Tdiff)));
		  int sum = 0;
		  for (Integer index : result) {
			  System.out.println("index:" + index);
			  sum+=index;
		  }
		  System.out.println("sum:" + sum);
	        return sum;
	    }
}
