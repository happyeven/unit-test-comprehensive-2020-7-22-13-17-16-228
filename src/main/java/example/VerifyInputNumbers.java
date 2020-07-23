package example;

public class VerifyInputNumbers {
    public boolean isisLegalInputNumbers(int[] inputNumbers) {
        return verifyInputNumbersLength(inputNumbers);
    }

    private boolean verifyInputNumbersLength(int[] inputNumbers) {
        return inputNumbers.length == 4;
    }
}