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

    public String playGame(int[] inputGuess) {
        if (this.availableChance == 0) {
            return null;
        }
        availableChance--;
        return getOutput(inputGuess);
    }

    private static int[] getInputFromConsole() {
        Scanner scan = new Scanner(System.in);
        int[] inputNumber = new int[NumberConstant.INPUT_GUESS_LENGTH];
        for (int j = 0; j < inputNumber.length; j++) {
            inputNumber[j] = scan.nextInt();
        }
        scan.close();
        return inputNumber;
    }
}
