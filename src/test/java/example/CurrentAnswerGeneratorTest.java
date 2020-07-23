package example;

import org.junit.jupiter.api.Test;

import java.util.HashMap;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CurrentAnswerGeneratorTest {
    @Test
    void should_answer_length_equals_to_4_when_generate_answer() {
        //given
        AnswerGenerator answerGenerator = new CurrentAnswerGenerator();
        //when
        int[] answer = answerGenerator.generate();
        //then
        assertEquals(4,answer.length);
    }

    @Test
    void should_number_in_answer_appear_only_once_when_generate_answer() {
        //given
        AnswerGenerator answerGenerator = new CurrentAnswerGenerator();
        //when
        int[] answer = answerGenerator.generate();
        //then
        assertEquals(true,isAppearOnlyOnce(answer));
    }

    private boolean isAppearOnlyOnce(int[] answer) {
        HashMap<Integer, Integer> inputNumbersAmountMap = new HashMap<>();
        for (int currentNumber : answer) {
            if (inputNumbersAmountMap.get(currentNumber) == null) {
                inputNumbersAmountMap.put(currentNumber, 1);
            } else {
                return false;
            }
        }
        return true;
    }
}
