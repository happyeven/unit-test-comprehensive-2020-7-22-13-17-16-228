package example;

import java.util.Scanner;

public class GuessNumberGame {
    private GuessNumber guessNumber;
    private InputValidator inputValidator;

    public GuessNumberGame(GuessNumber guessNumber, InputValidator inputValidator) {
        this.guessNumber = guessNumber;
        this.inputValidator = inputValidator;
    }

    public String getOutput(int[] inputGuess) {
        if (!inputValidator.isLegalInputNumbers(inputGuess)) {
            return ErrorMessageConstant.ERROR_MESSAGE;
        }
        return guessNumber.guess(inputGuess);
    }

    public void setAvailableChance(int availableChance) {
        this.availableChance = availableChance;
    }

    private static int[] getInputFromConsole(Scanner scan) {
        int[] inputNumber = new int[NumberConstant.INPUT_GUESS_LENGTH];
        for (int j = 0; j < inputNumber.length; j++) {
            inputNumber[j] = scan.nextInt();
        }
        return inputNumber;
    }
}
