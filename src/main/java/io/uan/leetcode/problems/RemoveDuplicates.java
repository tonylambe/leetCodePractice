package io.uan.leetcode.problems;

import io.uan.leetcode.common.LeetCodeProblem;

public class RemoveDuplicates extends LeetCodeProblem {

    public RemoveDuplicates() {
        this.setUrl("https://leetcode.com/problems/remove-element/description/");
        this.setProblemNumber(27);
    }

    public int countUnique(int[] nums) {
        int leftPointer = 1;

        for(int i = 1; i < nums.length; i++) {
            if(nums[i] != nums[i-1]) {
                nums[leftPointer] = nums[i];
                leftPointer++;
            }
        }

        return leftPointer;
    }
}
