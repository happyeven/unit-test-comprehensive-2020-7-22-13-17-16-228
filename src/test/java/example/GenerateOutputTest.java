package example;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

public class GenerateOutputTest {
    @Test
    void should_return_wrong_input_input_again_when_generate_output_given_input_guess_11_and_answer_1234() {
        //given
        int[] answer = {1, 2, 3, 4};
        AnswerGenerator answerGenerator = Mockito.mock(AnswerGenerator.class);
        when(answerGenerator.generate()).thenReturn(answer);
        GuessNumber guessNumber = new GuessNumber(answerGenerator);
        InputValidator inputValidator = new InputValidator();
        GenerateOutput generateOutput = new GenerateOutput(guessNumber, inputValidator);
        int[] inputGuess = {1,1};
        //when
        String result = generateOutput.getOutput(inputGuess);
        //then
        assertEquals("Wrong Input,Input again",result);
    }

    @Test
    void should_return_wrong_input_input_again_when_generate_output_given_guess_1123() {
        //given
        //given
        int[] answer = {1, 2, 3, 4};
        AnswerGenerator answerGenerator = Mockito.mock(AnswerGenerator.class);
        when(answerGenerator.generate()).thenReturn(answer);
        GuessNumber guessNumber = new GuessNumber(answerGenerator);
        InputValidator inputValidator = new InputValidator();
        GenerateOutput generateOutput = new GenerateOutput(guessNumber, inputValidator);
        int[] inputGuess = {1,1,2,3};
        //when
        String result = generateOutput.getOutput(inputGuess);
        //then
    }
}
