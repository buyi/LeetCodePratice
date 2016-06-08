import java.util.Arrays;


public class Solution1_TwoSum {
    public static int[] twoSum(int[] numbers, int target) {
        int size = numbers.length;
        int result[] = new int[2];
        for (int i =0; i< size; i++) {
            for (int j = 1; j< size; j++) {
                if ((target - numbers[i]) == numbers[j]) {
                    result[0] = i+1;
                    result[1] = j+1;
                    return result;
                }
            }
        }
        return null;
    }
    
    
    public static int[] twoSum_n2(int[] nums, int target) {
        if(nums == null)
            return null;
        int[] nums2 = Arrays.copyOf(nums, nums.length);
        Arrays.sort(nums2);
        int a = 0, b = 0;
        int start = 0, end = nums2.length-1;
        //find two nums
        while(start<end){
            int sum = nums2[start] + nums2[end];
            if(sum < target)
                start++;
            else if(sum > target)
                end--;
            else{
                a = nums2[start]; b = nums2[end];
                break;
            }
        }
        //find the index of two numbers
        int[] res = new int[2];
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == a){
                res[0] = i;
                break;
            }
        }
        if(a != b){
            for(int i = 0; i < nums.length; i++){
                if(nums[i] == b){
                    res[1] = i;
                    break;
                }
            }
        } else{
            for(int i = 0; i < nums.length; i++){
                if(nums[i] == b && i != res[0]){
                    res[1] = i;
                    break;
                }
            }
        }

        return res;
    }
    
    public static void main(String[] args) {
		int[] numbers = new int[] {2,7,11,15};
//		int[] result = twoSum (numbers, 26);
		
		int[] result2 = twoSum_n2 (numbers, 26);
		System.out.println(Arrays.toString(result2));
	}
}
