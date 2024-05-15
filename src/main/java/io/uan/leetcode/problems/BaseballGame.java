package io.uan.leetcode.problems;

import io.uan.leetcode.common.LeetCodeProblem;

import java.util.ArrayDeque;
import java.util.Stack;

public class BaseballGame extends LeetCodeProblem {

    ArrayDeque<Integer> stack = new ArrayDeque<Integer>();

    public BaseballGame() {
        this.setProblemNumber(682);
        this.setUrl("https://leetcode.com/problems/baseball-game/description/");
    }

    public int calPoints(String[] operations) {
        for(String op : operations) {
            switch(op){
                case "+":
                    final int top = stack.pop();
                    final int secondFromTop = stack.peek();
                    stack.push(top);
                    stack.push(top+secondFromTop);
                    break;
                case "D":
                    stack.push(stack.peek()*2);
                    break;
                case "C":
                    stack.pop();
                    break;
                default:
                    stack.push(Integer.parseInt(op));
            }

        }

        return stack.stream().reduce(0, Integer::sum);
    }


}
