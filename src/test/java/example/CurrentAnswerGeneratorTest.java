package example;

import org.junit.jupiter.api.Test;

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
}
