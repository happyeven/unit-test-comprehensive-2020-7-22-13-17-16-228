package example;

import java.util.HashMap;

public class InputValidator {
    public boolean isisLegalInputNumbers(int[] inputNumbers) {
        return verifyInputNumbersLength(inputNumbers) && isNumbersAppearOnlyOnce(inputNumbers)
                && isNumbersInRange(inputNumbers);
    }

    private boolean verifyInputNumbersLength(int[] inputNumbers) {
        return inputNumbers.length == 4;
    }

    private boolean isNumbersAppearOnlyOnce(int[] inputNumbers) {
        HashMap<Integer, Integer> inputNumbersAmountMap = new HashMap<>();
        for (int currentNumber : inputNumbers) {
            if (inputNumbersAmountMap.get(currentNumber) == null) {
                inputNumbersAmountMap.put(currentNumber, 1);
            } else {
                return false;
            }
        }
        return true;
    }
    private boolean isNumbersInRange(int[] inputNumbers){
        for(int inputNumber : inputNumbers){
            if(!isNumberInRange(inputNumber)){
                return false;
            }
        }
        return true;
    }
    private boolean isNumberInRange(int inputNumber){
        return inputNumber >= 0 && inputNumber <=9;
    }
}