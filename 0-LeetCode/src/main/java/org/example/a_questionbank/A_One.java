package org.example.a_questionbank;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * LeetCode 第 1 题：两数之和（Two Sum）
 * <p>
 * 题目描述：
 * 给定一个整数数组 nums 和一个整数目标值 target，请你在该数组中找出和为目标值 target 的那两个整数，并返回它们的数组下标。
 * <p>
 * 约束条件：
 * - 每种输入只会对应一个答案
 * - 不能使用两次相同的元素
 * - 可以按任意顺序返回答案
 * <p>
 * 示例：
 * 输入：nums = [2,7,11,15], target = 9 → 输出：[0,1]
 * 输入：nums = [3,2,4], target = 6     → 输出：[1,2]
 * 输入：nums = [3,3], target = 6       → 输出：[0,1]
 * <p>
 * 数据范围：
 * - 2 <= nums.length <= 10^4
 * - -10^9 <= nums[i] <= 10^9
 * - -10^9 <= target <= 10^9
 * <p>
 * 复杂度分析：
 * - 解法 1（暴力）：时间复杂度 O(n²)，空间复杂度 O(1)
 * - 解法 2（哈希表）：时间复杂度 O(n)，空间复杂度 O(n)
 *
 * @author Qwen
 * @version 1.0
 */
public class A_One {

    public static void main(String[] args) {
        // 测试用例 1：普通情况
        int[] result1 = twoSum(new int[]{2, 7, 11, 15}, 9);
        // 测试用例 2：普通情况
        int[] result2 = twoSumOptimized(new int[]{3, 2, 4}, 6);
        // 测试用例 3：重复元素情况
        int[] result3 = twoSumOptimized(new int[]{3, 3}, 6);

        // 输出测试结果
        System.out.println("测试 1: " + Arrays.toString(result1)); // [0, 1]
        System.out.println("测试 2: " + Arrays.toString(result2)); // [1, 2]
        System.out.println("测试 3: " + Arrays.toString(result3)); // [0, 1]
    }

    /**
     * 解法 1：暴力枚举法
     * <p>
     * 思路：
     * 使用两层循环，外层循环固定一个元素 nums[i]，内层循环查找是否存在另一个元素 nums[j]
     * 使得 nums[i] + nums[j] == target
     *
     * @param nums   输入的整数数组
     * @param target 目标和
     * @return 返回两个整数的数组下标
     * @throws IllegalArgumentException 如果没有找到符合条件的两个数
     */
    public static int[] twoSum(int[] nums, int target) {
        // 外层循环：遍历每个元素作为第一个数
        for (int i = 0; i < nums.length; i++) {
            // 内层循环：从 i+1 开始遍历，查找第二个数
            // j = i + 1 确保不会使用相同的元素
            for (int j = i + 1; j < nums.length; j++) {
                // 判断两数之和是否等于目标值
                if (nums[i] + nums[j] == target) {
                    // 找到符合条件的两个数，返回它们的索引
                    return new int[]{i, j};
                }
            }
        }
        // 如果遍历完所有组合都没有找到，抛出异常
        throw new IllegalArgumentException("No two sum solution");
    }

    /**
     * 解法 2：哈希表优化法（推荐解法）
     * <p>
     * 思路：
     * 使用哈希表存储已遍历过的元素值及其索引。
     * 对于每个元素 nums[i]，计算需要的补数 complement = target - nums[i]
     * 如果补数已在哈希表中，说明找到了答案；否则将当前元素存入哈希表
     * <p>
     * 核心技巧：
     * - 空间换时间：用 O(n) 的空间复杂度换取 O(n) 的时间复杂度
     * - 一次遍历：在遍历过程中同时完成查找和存储操作
     *
     * @param nums   输入的整数数组
     * @param target 目标和
     * @return 返回两个整数的数组下标
     * @throws IllegalArgumentException 如果没有找到符合条件的两个数
     */
    public static int[] twoSumOptimized(int[] nums, int target) {
        // 创建哈希表，用于存储「元素值 → 索引」的映射
        // 初始容量设为 nums.length 避免扩容开销，负载因子使用默认值 0.75
        Map<Integer, Integer> indexMap = new HashMap<>(nums.length);

        // 遍历数组，i 为当前元素的索引
        for (int i = 0; i < nums.length; i++) {
            // 计算当前元素需要的补数（目标值 - 当前值）
            int complement = target - nums[i];

            // 检查补数是否已在哈希表中
            if (indexMap.containsKey(complement)) {
                // 如果存在，说明找到了两个数：
                // - 补数（之前遍历过的元素）
                // - 当前元素 nums[i]
                // 返回它们的索引数组
                return new int[]{indexMap.get(complement), i};
            }

            // 如果补数不存在，将当前元素及其索引存入哈希表
            // 供后续元素查找时使用
            indexMap.put(nums[i], i);
        }

        // 如果遍历完整个数组都没有找到符合条件的两个数，抛出异常
        // 根据题目保证，正常情况下不会执行到这里
        throw new IllegalArgumentException("No two sum solution");
    }
}
