import java.util.*;
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 2; i++)
        {
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue; // Skip duplicate elements
            }
            int left = i + 1;
            int right = nums.length - 1;
            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];
                if (sum == 0) {
                    result.add(Arrays.asList(nums[i], nums[left], nums[right]));
                    left++;
                    right--;
                    while (left < right && nums[left] == nums[left - 1]) {
                        left++; // Skip duplicate elements
                    }
                    while (left < right && nums[right] == nums[right + 1]) {
                        right--; // Skip duplicate elements
                    }
                } else if (sum < 0) {
                    left++;
                } else {
                    right--;
                }
            }
        }
        return result;
    }
    public static void main(String args[]) throws Exception{
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int n = in.nextInt();
        int[] nums = new int[n];
        System.out.println("Enter the elements of the array:");
        for(int i=0; i<n; i++){
            nums[i] = in.nextInt();
        }
        Solution obj = new Solution();
        List<List<Integer>> result = obj.threeSum(nums);
        System.out.println("Triplets that sum to zero:");
        for(List<Integer> triplet : result){
            System.out.println(triplet);
        }
        in.close();
    }
}