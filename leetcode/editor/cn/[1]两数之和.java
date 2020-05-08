//给定一个整数数组 nums 和一个目标值 target，请你在该数组中找出和为目标值的那 两个 整数，并返回他们的数组下标。
//
// 你可以假设每种输入只会对应一个答案。但是，数组中同一个元素不能使用两遍。
//
//
//
// 示例:
//
// 给定 nums = [2, 7, 11, 15], target = 9
//
//因为 nums[0] + nums[1] = 2 + 7 = 9
//所以返回 [0, 1]
//
// Related Topics 数组 哈希表


import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public static int[] twoSum1(int[] nums, int target) {
        int[] res = new int[2];
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    res[0] = i;
                    res[1] = j;
                }
            }
        }
        return res;
    }

    public static int[] twoSum2(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        int[] res = new int[2];
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }
        for (int i = 0; i < nums.length; i++) {
            Integer cha = target - nums[i];
            if (map.containsKey(cha) && map.get(cha) != i) {
                res[0] = i;
                res[1] = map.get(cha);
                return res;
            }

        }
        return res;
    }

    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        int[] res = new int[2];
        for (int i = 0; i < nums.length; i++) {
            //计算差值 2
            Integer cha = target - nums[i];
            //key相同的情况
            //key不同
            if (map.containsKey(cha)) {
                res[0] = map.get(cha);
                res[1] = i;
                break;
            }
            map.put(nums[i], i);
        }
        return res;
    }


    //
    public static void main(String[] args) {
//        int[] nums = {2, 8, 3, 6, 3,3};
        int[] nums = {3, 2, 4};
        System.out.println("res:" + Arrays.toString(twoSum(nums, 6)));
    }
}
//leetcode submit region end(Prohibit modification and deletion)
