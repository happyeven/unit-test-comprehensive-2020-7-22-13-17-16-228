package example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GuessNumberTest {
    @Test
    public void should_return_4A0B_when_guess_number_given_input_guess_1234_and_answer_1234() {
        //given
        GuessNumber guessNumber = new GuessNumber();
        int[] inputGuess = {1, 2, 3, 4};
        //when
        String result = guessNumber.guess(inputGuess);
        //then
        assertEquals("4A0B", result);
    }
}
