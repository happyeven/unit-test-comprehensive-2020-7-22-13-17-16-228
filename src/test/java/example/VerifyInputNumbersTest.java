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
}