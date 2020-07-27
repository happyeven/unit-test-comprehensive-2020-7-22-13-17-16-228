package example;

public class GuessNumberGame {
    GenerateOutput generateOutput;
    int availableChance = 6;

    public GuessNumberGame(GenerateOutput generateOutput) {
        this.generateOutput = generateOutput;
    }

    public String play(int[] inputGuess) {
        if (this.availableChance == 0) {
            return null;
        }
        availableChance--;
        return generateOutput.getOutput(inputGuess);
    }

    public void setAvailableChance(int availableChance) {
        this.availableChance = availableChance;
    }
}
