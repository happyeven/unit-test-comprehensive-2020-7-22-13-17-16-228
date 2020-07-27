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
        GenerateOutput generateOutput = new GenerateOutput(guessNumber, inputValidator);
        GuessNumberGame guessNumberGame = new GuessNumberGame(generateOutput);
        int[] inputGuess = {1,1};
        //when
        String result = guessNumberGame.play(inputGuess);
        //then
        assertEquals(result,"Wrong Input,Input again");
    }
}
