class Solution {
    public int[] searchRange(int[] nums, int target) {
        int firstidx = firstPosition(nums , target);
        if(firstidx == -1) {
            return new int [] {
                -1 ,
                -1
            };
        }

        int secidx = secPosition(nums , target);
            return new int [] {
                firstidx ,
                secidx
            };


    }
     public int firstPosition(int[] nums, int target) {
        int ans = -1;
        int low = 0;
        int high = nums.length - 1;

        while(low <= high) {
            int mid = low + (high - low) / 2;
            if(nums[mid] == target) {
                ans = mid;
                high = mid -1;
            }else if(nums[mid] > target) {
                high = mid - 1;
            }
            else
                low = mid + 1;
        }
        return ans;
    }

     public int secPosition(int[] nums, int target) {
        int ans = -1;
        int low = 0;
        int high = nums.length - 1;

        while(low <= high) {
             int mid = low + (high - low) / 2;

            if(nums[mid] == target) {
                ans = mid;
                low = mid + 1;
            }else if(nums[mid] > target) {
                high = mid - 1;
            }
            else
                low = mid + 1;
        }
        return ans;
    }
}