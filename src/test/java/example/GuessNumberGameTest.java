package example;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

public class GuessNumberGameTest {
    @Test
    void should_return_wrong_input_when_play_given_input_guess_11_and_answer_1234() {
        //given
        int[] answer = {1, 2, 3, 4};
        AnswerGenerator answerGenerator = Mockito.mock(AnswerGenerator.class);
        when(answerGenerator.generate()).thenReturn(answer);
        GuessNumber guessNumber = new GuessNumber(answerGenerator);
        InputValidator inputValidator = new InputValidator();
        GuessNumberGame guessNumberGame = new GuessNumberGame(guessNumber, inputValidator);
        int[] inputGuess = {1, 1};
        //when
        String result = guessNumberGame.playGame(inputGuess);
        //then
        assertEquals(result, "Wrong Input,Input again");
    }

    @Test
    void should_return_wrong_input_when_play_given_input_guess_1123_answer_1234() {
        //given
        int[] answer = {1, 2, 3, 4};
        AnswerGenerator answerGenerator = Mockito.mock(AnswerGenerator.class);
        when(answerGenerator.generate()).thenReturn(answer);
        GuessNumber guessNumber = new GuessNumber(answerGenerator);
        InputValidator inputValidator = new InputValidator();
        GuessNumberGame guessNumberGame = new GuessNumberGame(guessNumber, inputValidator);
        int[] inputGuess = {1, 1, 2, 3};
        //when
        String result = guessNumberGame.playGame(inputGuess);
        //then
        assertEquals(result, "Wrong Input,Input again");
    }

    @Test
    void should_return_2A2B_when_play_given_input_guess_1234_answer_4231_and_available_chance_bigger_than_0() {
        //given
        int[] answer = {4, 2, 3, 1};
        AnswerGenerator answerGenerator = Mockito.mock(AnswerGenerator.class);
        when(answerGenerator.generate()).thenReturn(answer);
        GuessNumber guessNumber = new GuessNumber(answerGenerator);
        InputValidator inputValidator = new InputValidator();
        GuessNumberGame guessNumberGame = new GuessNumberGame(guessNumber, inputValidator);
        int[] inputGuess = {1, 2, 3, 4};
        //when
        String result = guessNumberGame.playGame(inputGuess);
        //then
        assertEquals(result, "2A2B");
    }

    @Test
    void should_return_null_when_play_given_input_guess_1234_answer_4231_and_available_chance_equal_to_0() {
        //given
        int[] answer = {4, 2, 3, 1};
        AnswerGenerator answerGenerator = Mockito.mock(AnswerGenerator.class);
        when(answerGenerator.generate()).thenReturn(answer);
        GuessNumber guessNumber = new GuessNumber(answerGenerator);
        InputValidator inputValidator = new InputValidator();
        GenerateOutput generateOutput = new GenerateOutput(guessNumber, inputValidator);
        GuessNumberGame guessNumberGame = new GuessNumberGame(generateOutput);
        int[] inputGuess = {1, 2, 3, 4};
        guessNumberGame.setAvailableChance(0);
        //when
        String result = guessNumberGame.play(inputGuess);
        //then
        assertEquals(result, null);
    }
}
