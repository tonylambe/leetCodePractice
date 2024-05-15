package io.uan.leetcode.test.problems;

import io.uan.leetcode.test.common.LeetCodeTest;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import io.uan.leetcode.problems.BaseballGame;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BaseBallGameTest extends LeetCodeTest {

    private final BaseballGame baseBallGame = new BaseballGame();

    @ParameterizedTest
    @MethodSource("stringArrayProvider")
    public void testBaseBallGame(final String[] input, final int actual) {
        assertEquals(baseBallGame.calPoints(input), actual);
    }

    static Stream<Arguments> stringArrayProvider() {
        return Stream.of(
                Arguments.of((Object) new String[]{"5","2","C","D","+"}, 30),
                Arguments.of( (Object) new String[]{"5","-2","4","C","D","9","+","+"}, 27),
                Arguments.of( (Object) new String[]{"1","C"}, 0)
        );
    }
}
