package example;

public class GenerateOutput {
    private GuessNumber guessNumber;
    private InputValidator inputValidator;

    public GenerateOutput(GuessNumber guessNumber, InputValidator inputValidator) {
        this.guessNumber = guessNumber;
        this.inputValidator = inputValidator;
    }

    public String getOutput(int[] inputGuess) {
        if(!inputValidator.isisLegalInputNumbers(inputGuess)){
            return "Wrong Input,Input again";
        }
        return guessNumber.guess(inputGuess);
    }
}
