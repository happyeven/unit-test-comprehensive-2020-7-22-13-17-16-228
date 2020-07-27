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
        int amountOfInputNumberInAnswer = 0;
        for (int currentNumber : inputNumbers) {
            if (isAnswerContainNumber(answer, currentNumber)) {
                amountOfInputNumberInAnswer ++;
            }
        }
        return amountOfInputNumberInAnswer - getAmountOfA(answer,inputNumbers);
    }

    private int getAmountOfA(int[] answer, int[] inputNumbers) {
        int amountOfA = 0;
        for (int index = 0; index < answer.length; index++) {
            if (answer[index] == inputNumbers[index]) {
                amountOfA++;
            }
        }
        return amountOfA;
    }
}
