/*
 * Created by big_bili on 2017/1/15.
 */

public class TwoSumII {
    public int[] twoSum(int[] numbers, int target) {
        int hi = numbers.length - 1, lo = 0;
        if (numbers.length == 0)
            return new int[]{};

        while(numbers[hi] + numbers[lo] != target) {
            if(numbers[hi] + numbers[lo] > target)
                hi --;
            else
                lo ++;
            if (lo == hi)
                return new int[]{};
        }
        return new int[]{lo + 1,hi + 1};
    }
}
