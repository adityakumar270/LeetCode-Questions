class Solution {
    public int sumOddLengthSubarrays(int[] arr) {
        int total = 0;

        for (int start = 0; start < arr.length; start++) {
            for (int end = start; end < arr.length; end++) {
                if ((end - start + 1) % 2 == 1) {
                    for (int i = start; i <= end; i++) {
                        total += arr[i];
                    }
                }
            }
        }

        return total;
    }
}