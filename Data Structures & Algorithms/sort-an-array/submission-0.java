class Solution {
    
    public int[] sortArray(int[] nums) {
        
        return mergeSort(0, nums.length-1, nums);
    }

    public static int[] mergeSort(int l, int r, int[] nums)
    {
        if(l==r) return nums;


        int mid = l + (r-l)/2;
        mergeSort(l, mid, nums);
        mergeSort(mid+1, r, nums);
        merge(l, mid, r, nums); 

        return nums;
    }

    public static void merge(int l, int mid, int r, int[] nums)
    {
        int[] left = Arrays.copyOfRange(nums, l, mid+1);//mid was not inlcluded thats why
        int[] right = Arrays.copyOfRange(nums, mid+1, r+1);

        int i=l, j=0, k=0; //i is at main arr, j k for the others
        
        while(j<left.length && k< right.length)
        {
            if(left[j]<=right[k]) {
                nums[i] = left[j];
                i++;j++;
            }
            else{
                nums[i] = right[k];
                i++; k++;
            }
        }

        while(j<left.length)
        {
            nums[i] = left[j];
            i++;j++;
        }

        while(k<right.length)
        {
            nums[i] = right[k];
            i++;k++;
        }


    }
}