package example;

public class GuessNumberGame {
    int availableChance = 6;

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
}
