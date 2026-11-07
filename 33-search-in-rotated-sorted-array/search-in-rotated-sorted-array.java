class Solution {
    public int findPivot(int[] nums) {
        int low = 0;
        int high = nums.length - 1;

        while (low < high) {
            int mid = low + (high - low) / 2;

            if (nums[mid] > nums[high]) {
                low = mid + 1;
            } else {
                high = mid;
            }
        }

        return low;
    }

    public int search(int[] nums, int target) {
        if (nums.length == 1) {
            if (target == nums[0]) {
                return 0;
            } else {
                return -1;
            }

        }
        int piv = findPivot(nums);
        int low;
        int high;
        int mid;
        if (target >= nums[0]) {
            low = 0;
            if (piv == 0)
                high = nums.length - 1;
            else
                high = piv - 1;
        } else {
            low = piv;
            high = nums.length - 1;
        }
        while (low <= high) {
            mid = low + (high - low) / 2;
            if (nums[mid] == target) {
                return mid;
            }
            if (nums[mid] > target) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return -1;
    }
}