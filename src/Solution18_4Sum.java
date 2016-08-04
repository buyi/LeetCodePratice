import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Solution18_4Sum {

	public static void main(String[] args) {
		
		Solution18_4Sum sum = new Solution18_4Sum();
//		sum.fourSum(new int[] {1, 0, -1, 0, -2, 2}, 0);
		sum.fourSum(new int[] {0,0,0,0}, 0);
//		sum.fourSum(new int[] {0,0,0,0}, 1);
//		sum.fourSum(new int[] {-3,-2,-1,0,0,1,2,3}, 0);
	}

	public void find(int[] num, int begin, int end, int target,  int target1, int truely,List<List<Integer>> ret) {  
        int l = begin, r = end;  
        while (l < r) {  
            if (num[l] + num[r] + target + target1 == truely) {  
                List<Integer> ans = new ArrayList<Integer>();  
                ans.add(target1);  
                ans.add(target);  
                ans.add(num[l]);  
                ans.add(num[r]);  
                ret.add(ans); //放入结果集中  
                while (l < r && num[l] == num[l+1]) l++;  
                while (l < r && num[r] == num[r-1]) r--;  
                l++;  
                r--;  
            } else if (num[l] + num[r] + target + target1 < truely) {  
                l++;  
            } else {  
                r--;  
            }  
        }  
    } 
	 public List<List<Integer>> fourSum(int[] nums, int target) {
		   List<List<Integer>> ret = new ArrayList<List<Integer>>();
	        if (nums == null || nums.length < 4) return ret;  
	          
	        Arrays.sort(nums);  
	        
	        int len = nums.length;  
	        for (int i = 0; i < len-3; i++) {  
	            if (i > 0 && nums[i] == nums[i-1]) continue; 
//	            find(nums, i+1, len-1, nums[i], ret);
	            for (int j = i+1; j < len-2; j++) {
	            	if (j > i+1 && nums[j] == nums[j-1]) continue;  
	                find(nums, j+1, len-1, nums[j], nums[i], target, ret); //寻找三个数与num[i]的和为0  
	            }
	
	        }  
	          System.out.println("ret:" + ret);
	        return ret;  
	          
	    }
	 
	 
	 public List<List<Integer>> fourSumAnother(int[] nums, int target) {
		    List<List<Integer>> result = new ArrayList<List<Integer>>();
		 
		    if(nums==null|| nums.length<4)
		        return result;
		 
		    Arrays.sort(nums);
		 
		    for(int i=0; i<nums.length-3; i++){
		        if(i!=0 && nums[i]==nums[i-1])
		            continue;
		        for(int j=i+1; j<nums.length-2; j++){
		            if(j!=i+1 && nums[j]==nums[j-1])
		                continue;
		            int k=j+1;
		            int l=nums.length-1;
		            while(k<l){
		                if(nums[i]+nums[j]+nums[k]+nums[l]<target){
		                    k++;
		                }else if(nums[i]+nums[j]+nums[k]+nums[l]>target){
		                    l--;
		                }else{
		                    List<Integer> t = new ArrayList<Integer>();
		                    t.add(nums[i]);
		                    t.add(nums[j]);
		                    t.add(nums[k]);
		                    t.add(nums[l]);
		                    result.add(t);
		 
		                    k++;
		                    l--;
		 
		                    while(k<l &&nums[l]==nums[l+1] ){
		                        l--;
		                    }
		 
		                    while(k<l &&nums[k]==nums[k-1]){
		                        k++;
		                    }
		                }
		 
		 
		            }
		        }
		    }
		 
		    return result;
		}
}
