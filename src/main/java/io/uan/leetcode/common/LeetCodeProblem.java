package io.uan.leetcode.common;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public abstract class LeetCodeProblem {
    private String url;
    private int problemNumber;
}
