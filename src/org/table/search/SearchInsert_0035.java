package org.table.search;

/**
 * 给定一个排序数组和一个目标值，在数组中找到目标值，并返回其索引。如果目标值不存在于数组中，返回它将会被按顺序插入的位置。
 *
 * 你可以假设数组中无重复元素。
 */
public class SearchInsert_0035 {

    //二分查找，写的时候可以举几个栗子试试
    public int searchInsert(int[] nums, int target) {
        int l = 0, r = nums.length - 1;
        while (l < r) {
            int middle = (r + l) >> 1;
            if (nums[middle] == target) {
                return middle;
            } else if (nums[middle] < target) {
                l = middle + 1;
            } else {
                r = middle;
            }
        }
        return l;
    }

    public static void main(String[] args) {
        SearchInsert_0035 searchInsert_0035 = new SearchInsert_0035();
        int[] arrays = {1, 4, 5, 6};
        System.out.println(searchInsert_0035.searchInsert(arrays, 0));
    }
}
