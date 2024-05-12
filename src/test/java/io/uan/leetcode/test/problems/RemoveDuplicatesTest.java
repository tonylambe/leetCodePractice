package io.uan.leetcode.test.problems;

import io.uan.leetcode.problems.RemoveDuplicates;
import io.uan.leetcode.test.common.LeetCodeTest;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RemoveDuplicatesTest extends LeetCodeTest {

    private final RemoveDuplicates removeDuplicates = new RemoveDuplicates();

    @Test
    void countUnique() {
        this.logTestInfo(removeDuplicates);
        final int[] testInput = {0,0,1,1,1,2,2,3,3,4};
        assertEquals(5, removeDuplicates.countUnique(testInput));
    }
}