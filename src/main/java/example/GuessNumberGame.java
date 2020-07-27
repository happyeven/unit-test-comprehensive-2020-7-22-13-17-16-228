package example;

public class GuessNumberGame {
    GenerateOutput generateOutput;

    public GuessNumberGame(GenerateOutput generateOutput) {
        this.generateOutput = generateOutput;
    }

    public String play(int[] inputGuess){
        return generateOutput.getOutput(inputGuess);
    }
}
