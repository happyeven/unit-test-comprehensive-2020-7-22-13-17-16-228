package example;

import java.util.Arrays;
import java.util.stream.Collectors;

public class InputValidator {
    public boolean isLegalInputNumbers(int[] inputNumbers) {
        return verifyInputNumbersLength(inputNumbers) && IsNumbersUnique(inputNumbers)
                && isNumbersInRange(inputNumbers);
    }

    private boolean verifyInputNumbersLength(int[] inputNumbers) {
        return inputNumbers.length == NumberConstant.INPUT_GUESS_LENGTH;
    }

    private boolean IsNumbersUnique(int[] inputNumbers) {
        return Arrays.stream(inputNumbers).boxed().collect(Collectors.toList())
                .stream().distinct().count() == inputNumbers.length;
    }

    private boolean isNumbersInRange(int[] inputNumbers) {
        for (int inputNumber : inputNumbers) {
            if (!isNumberInRange(inputNumber)) {
                return false;
            }
        }
        return true;
    }

    private boolean isNumberInRange(int inputNumber) {
        return inputNumber >= NumberConstant.NUMBER_MIN_RANGE && inputNumber < NumberConstant.NUMBER_MAX_RANGE;
    }
}