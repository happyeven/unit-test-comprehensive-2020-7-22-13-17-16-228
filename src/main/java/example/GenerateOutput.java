package example;

public class GenerateOutput {
    private GuessNumber guessNumber;
    private VerifyInputNumbers verifyInputNumbers;

    public GenerateOutput(GuessNumber guessNumber, VerifyInputNumbers verifyInputNumbers) {
        this.guessNumber = guessNumber;
        this.verifyInputNumbers = verifyInputNumbers;
    }

    public String getOutput(int[] inputGuess) {
        if(!verifyInputNumbers.isisLegalInputNumbers(inputGuess)){
            return "Wrong Input,Input again";
        }
        return null;
    }
}
