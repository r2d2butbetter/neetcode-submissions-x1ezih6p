class Solution {
    public int[] sortArray(int[] nums) {
        return mergeSort(nums, 0, nums.length-1);
    }

    public static void merge(int[] nums, int l, int mid, int r)
    {
        int[] left = Arrays.copyOfRange(nums, l, mid+1);
        int[] right = Arrays.copyOfRange(nums, mid+1, r+1);

        int i=l;
        int j=0, k=0;

        while(j<left.length && k<right.length)
        {
            if(left[j]<right[k])
            {
                nums[i] = left[j];
                j++;
            }
            else
            {
                nums[i] = right[k];
                k++;
            }
            i++;
        }

        while(j<left.length)
        {
            nums[i] = left[j];
            j++; i++;
        }

        while(k<right.length)
        {
            nums[i] = right[k];
            k++; i++;
        }
    }

    public static int[] mergeSort(int[] nums, int l, int r)
    {
        if(l==r) return nums;

        int mid = l + (r-l)/2;
        
        mergeSort(nums, l, mid);
        mergeSort(nums, mid+1, r);

        merge(nums, l, mid, r);
        return nums;
    }
}