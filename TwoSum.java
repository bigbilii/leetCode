/*
 * Created by bigbilii on 2016/12/21.
 */
public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        int[] twoSum = new int[2];
        int a = 0, b = 0;
        for (int j = 0; j < nums.length; j ++) {
            for (int i = 0; i < nums.length; i ++) {
                if (nums[j] + nums[i] == target && j != i) {
                    a = j;
                    b = i;
                }
            }
        }
        if(a > b) {
            int temp = a;
            a = b;
            b = temp;
        }
        twoSum[0] = a;
        twoSum[1] = b;
        return twoSum;
    }
}
