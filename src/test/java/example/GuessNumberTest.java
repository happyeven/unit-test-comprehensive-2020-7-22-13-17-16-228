package example;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

public class GuessNumberTest {
    @Test
    public void should_return_4A0B_when_guess_number_given_input_guess_1234_and_answer_1234() {
        //given
        int[] answer = {1, 2, 3, 4};
        AnswerGenerator answerGenerator = Mockito.mock(AnswerGenerator.class);
        when(answerGenerator.generate()).thenReturn(answer);
        GuessNumber guessNumber = new GuessNumber(answerGenerator);
        int[] inputGuess = {1, 2, 3, 4};
        //when
        String result = guessNumber.guess(inputGuess);
        //then
        assertEquals("4A0B", result);
    }

    @Test
    public void should_return_1A3B_when_guess_number_given_input_guess_1342_and_answer_1234() {
        //given
        int[] answer = {1, 2, 3, 4};
        AnswerGenerator answerGenerator = Mockito.mock(AnswerGenerator.class);
        when(answerGenerator.generate()).thenReturn(answer);
        GuessNumber guessNumber = new GuessNumber(answerGenerator);
        int[] inputGuess = {1, 3, 4, 2};
        //when
        String result = guessNumber.guess(inputGuess);
        //then
        assertEquals("1A3B", result);
    }

    @Test
    void should_return_0A4B_when_guess_number_given_input_guess_4321_and_answer_1234() {
        //given
        int[] answer = {1, 2, 3, 4};
        AnswerGenerator answerGenerator = Mockito.mock(AnswerGenerator.class);
        when(answerGenerator.generate()).thenReturn(answer);
        GuessNumber guessNumber = new GuessNumber(answerGenerator);
        int[] inputGuess = {4,3,2,1};
        //when
        String result = guessNumber.guess(inputGuess);
        //then
        assertEquals("0A4B", result);
    }

    @Test
    void should_return_1A1B_when_guess_number_given_input_guess_1546_and_answer_1234() {
        //given
        int[] answer = {1, 2, 3, 4};
        AnswerGenerator answerGenerator = Mockito.mock(AnswerGenerator.class);
        when(answerGenerator.generate()).thenReturn(answer);
        GuessNumber guessNumber = new GuessNumber(answerGenerator);
        int[] inputGuess = {1,5,4,6};
        //when
        String result = guessNumber.guess(inputGuess);
        //then
        assertEquals("1A1B", result);
    }
    @Test
    void should_return_0A2B_when_guess_number_given_answer_1234_and_input_guess_3156 () {
        //given
        int[] answer = {1, 2, 3, 4};
        AnswerGenerator answerGenerator = Mockito.mock(AnswerGenerator.class);
        when(answerGenerator.generate()).thenReturn(answer);
        GuessNumber guessNumber = new GuessNumber(answerGenerator);
        int[] inputGuess = {3,1,5,6};
        //when
        String result = guessNumber.guess(inputGuess);
        //then
        assertEquals("0A2B", result);
    }

}
