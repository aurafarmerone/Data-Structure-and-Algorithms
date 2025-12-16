class CountSortNegative {
    public int[] sortArray(int[] nums) {

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        // find min and max
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > max) max = nums[i];
            if (nums[i] < min) min = nums[i];
        }

        // range = max-min+1
        int range = max - min + 1;
        int freq[] = new int[range];

        // count frequency with shifted index
        for (int i = 0; i < nums.length; i++) {
            freq[nums[i] - min]++;     // shift by min
        }

        // fill back into nums
        int k = 0;
        for (int i = 0; i < range; i++) {
            while (freq[i] > 0) {
                nums[k] = i + min;     // reverse shift
                k++;
                freq[i]--;
            }
        }

        return nums;
    }
}
