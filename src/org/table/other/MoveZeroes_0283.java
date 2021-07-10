package org.table.other;

/**
 * 给定一个数组 nums，编写一个函数将所有 0 移动到数组的末尾，同时保持非零元素的相对顺序。
 *
 *
 */
public class MoveZeroes_0283 {
    public void moveZeroes(int[] nums) {
        int l = 0, r = 0;
        while(r < nums.length) {
            if(nums[r] != 0) {
                int t = nums[l];
                nums[l] = nums[r];
                nums[r] = t;
                l++;
            }
            r++;
        }
        // int index = -1, i = 0;
        //     for(;i < nums.length; i++){
        //         if(nums[i] == 0) {
        //             index = i;
        //             break;
        //         }
        //     }
        //     if(index == -1) {
        //         return;
        //     }
        //     for(i = i + 1; i < nums.length; i++) {
        //         if(nums[i] != 0){
        //             int t = nums[i];
        //             nums[i] = nums[index];
        //             nums[index] = t;
        //             for(int j = index + 1; j < nums.length; j++) {
        //                 if(nums[j] == 0) {
        //                     index = j;
        //                     break;
        //                 }
        //             }
        //         }
        //     }
    }
}
