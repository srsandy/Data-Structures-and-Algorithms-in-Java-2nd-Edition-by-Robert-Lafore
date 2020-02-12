import java.util.*;


class TwoSum {
	public static void main(String[] args) {
		int[] nums = [2, 7, 11, 15];
		int target = 9;
	}

	public static int[] twoSum(int[] nums, int target) {
		Map<Integer, Integer> map = new HashMap();

		for(int i = 0; i<nums.length; i++) {
			int diff = target - nums[i];
			
			if(map.containsKey(diff)) {
				return new int[] {map.get(diff), i};
			} else {
				map.put(num[i], i);
			}
		}

		return new int[] {-1, -1};
	}
	
}