package cn.leetcode.a_questionbank;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * 给定一个整数数组 nums 和一个整数目标值 target，请你在该数组中找出 和为目标值 target  的那 两个 整数，并返回它们的数组下标。
 * <p>
 * 你可以假设每种输入只会对应一个答案，并且你不能使用两次相同的元素。
 * <p>
 * 你可以按任意顺序返回答案。
 * <p>
 * <p>
 * <p>
 * 示例 1：
 * <p>
 * 输入：nums = [2,7,11,15], target = 9
 * 输出：[0,1]
 * 解释：因为 nums[0] + nums[1] == 9 ，返回 [0, 1] 。
 * 示例 2：
 * <p>
 * 输入：nums = [3,2,4], target = 6
 * 输出：[1,2]
 * 示例 3：
 * <p>
 * 输入：nums = [3,3], target = 6
 * 输出：[0,1]
 * <p>
 * 提示：
 * <p>
 * 2 <= nums.length <= 104
 * -109 <= nums[i] <= 109
 * -109 <= target <= 109
 * 只会存在一个有效答案
 * <p>
 * <p>
 * 进阶：你可以想出一个时间复杂度小于 O(n2) 的算法吗？
 */
public class A_One {
    public static void main(String[] args) {
        int[] ints = twoSum(new int[]{2, 7, 11, 15}, 9);
        int[] ints1 = twoSum2(new int[]{3, 2, 4}, 6);
        int[] ints2 = twoSum2(new int[]{3, 3}, 6);
        System.out.println(Arrays.toString(ints));
        System.out.println(Arrays.toString(ints1));
        System.out.println(Arrays.toString(ints2));
    }

    // 解法1：双重for循环暴力解法
    public static int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        throw new IllegalArgumentException("No two sum solution");
    }

    // 解法2：使用哈希表（时间复杂度 O(n)）
    public static int[] twoSum2(int[] nums, int target) {
        // 创建哈希表用于存储已遍历的元素值及其索引
        Map<Integer, Integer> hashtable = new HashMap<Integer, Integer>();
        // 遍历数组中的每个元素
        for (int i = 0; i < nums.length; i++) {
            // 计算当前元素需要的补数（target - 当前值）
            // 检查补数是否已在哈希表中存在
            if (hashtable.containsKey(target - nums[i])) {
                // 如果存在，说明找到了两个数的和等于target
                // 返回补数的索引和当前元素的索引
                return new int[]{hashtable.get(target - nums[i]), i};
            }
            // 将当前元素值和索引存入哈希表，供后续元素查找
            hashtable.put(nums[i], i);
        }
        // 如果未找到符合条件的两个数，返回空数组
        return new int[0];
    }
}
