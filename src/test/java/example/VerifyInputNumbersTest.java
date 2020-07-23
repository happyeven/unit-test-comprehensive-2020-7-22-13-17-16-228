package example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class VerifyInputNumbersTest {
    @Test
    void should_return_false_when_verify_input_numbers_given_11() {
        //given
        VerifyInputNumbers verifyInputNumbers = new VerifyInputNumbers();
        int[] inputGuess = {1,1};
        //when
        boolean isLegalInputNumbers = verifyInputNumbers.isisLegalInputNumbers(inputGuess);
        //then
        assertEquals(false,isLegalInputNumbers);
    }

    @Test
    void should_return_false_when_verify_input_numbers_given_1123() {
        //given
        VerifyInputNumbers verifyInputNumbers = new VerifyInputNumbers();
        int[] inputGuess = {1,1,2,3};
        //when
        boolean isLegalInputNumbers = verifyInputNumbers.isisLegalInputNumbers(inputGuess);
        //then
        assertEquals(false,isLegalInputNumbers);
    }

    @Test
    void should_return_true_when_verify_input_numbers_given_1234() {
        //given
        VerifyInputNumbers verifyInputNumbers = new VerifyInputNumbers();
        int[] inputGuess = {1,2,3,4};
        //when
        boolean isLegalInputNumbers = verifyInputNumbers.isisLegalInputNumbers(inputGuess);
        //then
        assertEquals(true,isLegalInputNumbers);
    }
}
