class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] answer = new int[nums.length];
            int total = 1;
            int zeroIdx = -1;

            for (int i = 0; i < nums.length; i++) {
                if (nums[i] == 0) {
                    if (zeroIdx >= 0) {
                        Arrays.fill(answer, 0);
                        return answer;
                    } else {
                        zeroIdx = i;
                    }
                } else {
                    total *= nums[i];
                }
            }

            if (zeroIdx >= 0) {
                Arrays.fill(answer, 0);
                answer[zeroIdx] = total;
                return answer;
            } else {
                for (int i = 0; i < nums.length; i++) {
                    answer[i] = total / nums[i];
                }
            }

            return answer;
    }
}