class Solution {
    public int[] getConcatenation(int[] nums) {
        int size = nums.length * 2;
        int[] doubleNums = new int[size];
        
        int num = 0;
        for (int i = 0; i < size; i++) {
            doubleNums[i] = nums[num];
            
            num++;
            
            if (num == nums.length) {
                num = 0;
            }
        }
        
        return doubleNums;
    }
}