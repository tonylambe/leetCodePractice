package io.uan.leetcode.test.common;

import io.uan.leetcode.common.LeetCodeProblem;
import org.tinylog.Logger;

public abstract class LeetCodeTest {

    public void logTestInfo(final LeetCodeProblem problem){
        Logger.info(String.format("Running tests for problem: %d, more info here: %s", problem.getProblemNumber(), problem.getUrl()));
    }
}
