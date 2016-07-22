import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


public class Solution15_3Sum {
	
	  public static List<List<Integer>> threeSum(int[] num) {  
	      List<List<Integer>> ret = new ArrayList<List<Integer>>();
	        if (num == null || num.length < 3) return ret;  
	          
	        Arrays.sort(num);  
	          
	        int len = num.length;  
	        for (int i = 0; i < len-2; i++) {  
	            if (i > 0 && num[i] == num[i-1]) continue;  
	            find(num, i+1, len-1, num[i], ret); //寻找两个数与num[i]的和为0  
	        }  
	          
	        return ret;  
	    }  
	
	
	public static void find(int[] num, int begin, int end, int target,  List<List<Integer>> ret) {  
        int l = begin, r = end;  
        while (l < r) {  
            if (num[l] + num[r] + target == 0) {  
                List<Integer> ans = new ArrayList<Integer>();  
                ans.add(target);  
                ans.add(num[l]);  
                ans.add(num[r]);  
                ret.add(ans); //放入结果集中  
                while (l < r && num[l] == num[l+1]) l++;  
                while (l < r && num[r] == num[r-1]) r--;  
                l++;  
                r--;  
            } else if (num[l] + num[r] + target < 0) {  
                l++;  
            } else {  
                r--;  
            }  
        }  
    } 

//	public class Solution {
	    public static List<List<Integer>> threeSum1(int[] nums) {
	        int length = nums.length;
	        List<List<Integer>> result = new ArrayList<List<Integer>>();
	        if (length < 3)
	        	return result;
	        Arrays.sort(nums);  
	        for (int first = 0; first < length; first++) {
	        	 for (int second = first+1; second < length; second++) {
	        		 for (int third = second+1; third < length; third++) {
	 	 	        	if (nums[first] + nums[second] + nums[third ] == 0) {
	 	 	        		List<Integer> ss = new ArrayList<Integer>();
	 	 	        		ss.add(nums[first]);
	 	 	        		ss.add(nums[second]);
	 	 	        		ss.add(nums[third ]);
	 	 	        		boolean isAdd = false;
	 	 	        		for (List<Integer> temp : result) {
//	 	 	        			Set set1 = new HashSet();
//	 	 	        			set1.add(temp.get(0));
//	 	 	        			set1.add(temp.get(1));
//	 	 	        			set1.add(temp.get(2));
//	 	 	        			
//	 	 	        			Set set2 = new HashSet();
//	 	 	        			set2.add(nums[first]);
//	 	 	        			set2.add(nums[second]);
//	 	 	        			set2.add(nums[third ]);
//	 	 	        			
//	 	 	        			System.out.println("set1"+ set1);
//	 	 	        			System.out.println("set2"+ set2);
//	 	 	        			
//	 	 	        			if (set1.equals(set2)) continue;
	 	 	        			if (ss.equals(temp)) {
	 	 	        				isAdd = false;
	 	 	        				break;
	 	 	        			} else {   				
	 	 	        				isAdd = true;
	 	 	        			
	 	 	        			}
	 	 	        			
	 	 	        		}
	 	 	        		
//	 	 	        		if (result.isEmpty()) {
//	 	        					isAdd = true;
//	 	        				}
//	 	 	        		System.out.println(isAdd);
//	 	 	        		System.out.println("1:" +result);
	 	 	        		if (result.isEmpty() || isAdd) {
	 	 	        			result.add(ss);
	 	 	        		}
//	 	 	        			System.out.println("2:" +result);
	 	 	        		
	 	 	        	}
	 	 	        }
	 	        }
	        }
	        System.out.println("reslut" + result);
	        return result;
	    }
//	}
	
	public static void main(String[] args) {
//		Solution15_3Sum.threeSum(new int [] {-1,0,1,2,-1,-4});
//		Solution15_3Sum.threeSum(new int [] {-4,-2,-2,-2,0,1,2,2,2,3,3,4,4,6,6});
		
//		Solution15_3Sum.threeSum(new int [] {10,-2,-12,3,-15,-12,2,-11,3,-12,9,12,0,-5,-4,-2,-7,-15,7,4,-5,-14,-15,-15,-4,10,9,-6,7,1,12,-6,14,-15,12,14,10,0,10,-10,3,4,-12,10,7,-9,-7,-15,-8,-15,-4,2,9,-4,3,-10,13,-3,-1,5,5,-4,-15,4,-11,4,-4,6,-11,-9,12,7,11,7,2,-5,13,10,-5,-10,3,7,0,-3,10,-12,2,9,-8,8,-9,13,12,13,-6,8,3,5,-9,7,12,10,-8,0,2,1,10,-7,-3,-10,-10,7,4,5,-11,-8,0,-2,-14,8,13,-8,-2,10,13});
		Solution15_3Sum.threeSum(new int [] {});
		
//		[]
		
		
		
	}
}
