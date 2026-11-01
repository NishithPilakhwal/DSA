
class Solution {
    public int[] searchRange(int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1;
        int mid;
        int first = -1;
        int last = -1;

        // Lower bound: first index where nums[i] >= target
        while (low <= high) {
            mid = low + (high - low) / 2;

            if (nums[mid] >= target) {
                first = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        // Check whether target actually exists
        if (first == -1 || nums[first] != target) {
            return new int[]{-1, -1};
        }

        // Upper bound: first index where nums[i] > target
        low = 0;
        high = nums.length - 1;

        while (low <= high) {
            mid = low + (high - low) / 2;

            if (nums[mid] > target) {
                last = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        if (last == -1) {
            last = nums.length;
        }

        return new int[]{first, last - 1};
    }
}
