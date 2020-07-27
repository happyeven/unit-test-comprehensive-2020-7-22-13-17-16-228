package example;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class InputValidator {
    public boolean isisLegalInputNumbers(int[] inputNumbers) {
        return verifyInputNumbersLength(inputNumbers) && IsNumbersUnique(inputNumbers)
                && isNumbersInRange(inputNumbers);
    }

    private boolean verifyInputNumbersLength(int[] inputNumbers) {
        return inputNumbers.length == 4;
    }

    private boolean IsNumbersUnique(int[] inputNumbers) {
        return Arrays.stream(inputNumbers).boxed().collect(Collectors.toList()).stream().distinct().count() == inputNumbers.length;
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
        return inputNumber >= 0 && inputNumber <= 9;
    }
}