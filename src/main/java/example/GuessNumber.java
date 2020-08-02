package example;

import java.util.Arrays;
import java.util.stream.Collectors;

public class GuessNumber {
    private int[] answer;

    public GuessNumber(AnswerGenerator answerGenerator) {
        this.answer = answerGenerator.generate();
    }

    public String guess(int[] inputGuess) {
        return String.format("%dA%dB", getAmountOfPositionAndNumberAllCorrect(this.answer, inputGuess), getAmountOfNumberCorrectButPositionIncorrect(this.answer, inputGuess));
    }

    private boolean isAnswerContainNumber(int[] answer, int inputNumber) {
        return Arrays.stream(answer).boxed().collect(Collectors.toList()).contains(inputNumber);
    }

    private int getAmountOfNumberCorrectButPositionIncorrect(int[] answer, int[] inputNumbers) {
        int amountOfNumberCorrect = 0;
        for (int currentNumber : inputNumbers) {
            if (isAnswerContainNumber(answer, currentNumber)) {
                amountOfNumberCorrect++;
            }
        }
        int amountOfPositionAndNumberAllCorrect = getAmountOfPositionAndNumberAllCorrect(answer, inputNumbers);
        int amountOfNumberCorrectButPositionIncorrect = amountOfNumberCorrect - amountOfPositionAndNumberAllCorrect;
        return amountOfNumberCorrectButPositionIncorrect;
    }

    private int getAmountOfPositionAndNumberAllCorrect(int[] answer, int[] inputNumbers) {
        int amountOfPositionAndNumberAllCorrect = 0;
        for (int index = 0; index < answer.length; index++) {
            if (answer[index] == inputNumbers[index]) {
                amountOfPositionAndNumberAllCorrect++;
            }
        }
        return amountOfPositionAndNumberAllCorrect;
    }
}
