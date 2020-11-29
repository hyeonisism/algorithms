package org.hyeonisism.algorithms;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class EvaluateTests {

    Evaluate evaluate;

    @BeforeEach
    void setUp() {
        evaluate = new Evaluate();
    }

    @Test
    void shouldReturn5() {
        // given
        String input = "(1+((2+3)*(4*5)))";

        String[] inputStrings = new String[input.length()];
        int i = 0;
        for (char c : input.toCharArray()) {
            inputStrings[i] = String.valueOf(c);
            i++;
        }

        // when
        double result = evaluate.evaluate(inputStrings);

        // then
        assertThat(result).isEqualTo(101);
    }
}
