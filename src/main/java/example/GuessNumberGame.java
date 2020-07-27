package example;

public class GuessNumberGame {
    GenerateOutput generateOutput;
    int availableChance = 6;
    public GuessNumberGame(GenerateOutput generateOutput) {
        this.generateOutput = generateOutput;
    }

    public String play(int[] inputGuess){
        availableChance --;
        return generateOutput.getOutput(inputGuess);
    }
}
