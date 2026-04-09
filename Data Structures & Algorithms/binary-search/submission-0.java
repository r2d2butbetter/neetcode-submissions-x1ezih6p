class Solution {
        public int search(int[] arr, int target) {
        int high = arr.length - 1;
        int low = 0;

        while (high >= low) {
            // int mid = (high + low) / 2; //might overflow in case of large values
            int mid = low + (high - low) / 2;
            if (arr[mid] > target) {
                high = mid - 1;
            } else if (arr[mid] < target) {
                low = mid + 1;
            } else {
                return mid;
            }
        }

        return -1;
    }
}