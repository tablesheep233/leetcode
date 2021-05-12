package org.table.array;

/**
 * 给你一个有序数组 nums ，请你 原地 删除重复出现的元素，使每个元素 只出现一次 ，返回删除后数组的新长度。
 *
 * 不要使用额外的数组空间，你必须在 原地 修改输入数组 并在使用 O(1) 额外空间的条件下完成。
 *
 */
public class RemoveDuplicates_0026 {
    /**
     * 双指针思路
     * 一个指针指 i 在可交换的位置，另一个 j 往前遍历，由于数组是有序的，当前一个与当前值不一样就是新的不同的元素 ，此时将该元素移至可交换的位置，并移动可交换指针，最后可交换指针就是长度
     */
    public int removeDuplicates(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        int i = 1, j = 1;
        while (j < nums.length) {
            if (nums[j] != nums[j - 1]) {
                nums[i] = nums[j];
                i++;
            }
            j++;
        }
        return i;
    }

    public static void main(String[] args) {
        RemoveDuplicates_0026 removeDuplicates_0026 = new RemoveDuplicates_0026();
        int[] nums = {0,0,1,1,1,2,2,3,3,4};
        System.out.println(removeDuplicates_0026.removeDuplicates(nums));;
        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }
    }
}
