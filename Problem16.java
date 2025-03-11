import java.util.Arrays;

public class Problem16{
    public static int SumOfThree(int[] nums, int target){
        Arrays.sort(nums);
        int closestSum = Integer.MAX_VALUE;
        for(int i = 0; i < nums.length - 2; i++){
            int left = i + 1;
            int right = nums.length - 1;
            while(left < right){
                int currentSum = nums[i] + nums[left] + nums[right];
                if(Math.abs(target - currentSum) < Math.abs(target - closestSum)){
                    closestSum = currentSum;
                }
                if(currentSum < target){
                    left++;
                } else if(currentSum > target){
                    right--;
                } else {
                    return currentSum;
                }
            }
        }
        return closestSum;
    }

    public static void main(String[] args){
        int[] nums1 = {-1, 2, 1, -4};
        int target1 = 1;
        int[] nums2 = {0, 0, 0};
        int target2 = 1;

        int result1 = SumOfThree(nums1, target1);
        System.out.println("Closest Sum: " + result1);

        int result2 = SumOfThree(nums2, target2);
        System.out.println("Closest Sum: " + result2);
    }
}