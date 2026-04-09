class Solution {
public int search(int[] nums, int target) {
        int pivot = findMinIndex(nums);

        int res = binarySearch(nums, target, 0, pivot-1);
        if (res==-1) {
            res = binarySearch(nums, target, pivot, nums.length-1);
        }

        return res;
    }

    public static int binarySearch(int nums[], int target, int low, int high) {
        // int low = 0, high = nums.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (nums[mid] < target) {
                low = mid + 1;
            } else if (nums[mid] > target) {
                high = mid - 1;
            } else {
                return mid;
            }
        }
        return -1;
    }

    public static int findMinIndex(int[] nums) {

        int low = 0;
        int high = nums.length - 1;
        while (high > low) {
            int mid = low + (high - low) / 2;

            if (nums[mid] < nums[high]) {
                high = mid;
            } else {
                low = mid + 1;
            }

        }
        // return nums[low];
        return low;
    }
}