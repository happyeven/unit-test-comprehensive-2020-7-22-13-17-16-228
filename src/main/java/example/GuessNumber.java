package example;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class GuessNumber {
    private int[] answer;

    public GuessNumber(AnswerGenerator answerGenerator) {
        this.answer = answerGenerator.generate();
    }

    public String guess(int[] inputGuess) {
        return String.format("%dA%dB", getAmountOfA(this.answer, inputGuess), getAmountOfB(this.answer, inputGuess));
    }

    private boolean isAnswerContainNumber(int[] answer, int inputNumber) {
        return Arrays.stream(answer).boxed().collect(Collectors.toList()).contains(inputNumber);
    }

    private int getAmountOfB(int[] answer, int[] inputNumbers) {
        int inputNUmberInAnswerCount = 0;
        for (int currentNumber : inputNumbers) {
            if (isAnswerContainNumber(answer, currentNumber)) {
                inputNUmberInAnswerCount ++;
            }
        }
        return inputNUmberInAnswerCount - getAmountOfA(answer,inputNumbers);
    }

    private int getAmountOfA(int[] answer, int[] inputNumbers) {
        int onCorrectPositionNumberCount = 0;
        for (int index = 0; index < answer.length; index++) {
            if (answer[index] == inputNumbers[index]) {
                onCorrectPositionNumberCount++;
            }
        }
        return onCorrectPositionNumberCount;
    }
}
