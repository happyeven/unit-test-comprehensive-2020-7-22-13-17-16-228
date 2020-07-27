package example;

public class GuessNumber {
    private int[] answer;

    public GuessNumber(AnswerGenerator answerGenerator) {
        this.answer = answerGenerator.generate();
    }

    public String guess(int[] inputGuess) {
        int[] answer = this.answer;
        int correctPositionAmount = getAmountOfA(answer, inputGuess);
        int inputNUmberInAnswerAmount = getAmountOfB(answer, inputGuess);
        return String.format("%dA%dB", correctPositionAmount, inputNUmberInAnswerAmount - correctPositionAmount);
    }

    private boolean isAnswerContainNumber(int[] answer, int inputNumber) {
        for (int currentNumber : answer) {
            if (currentNumber == inputNumber) {
                return true;
            }
        }
        return false;
    }

    private int getAmountOfB(int[] answer, int[] inputNumbers) {
        int inputNUmberInAnswerCount = 0;
        for (int currentNumber : inputNumbers) {
            if (isAnswerContainNumber(answer, currentNumber)) {
                inputNUmberInAnswerCount ++;
            }
        }
        return inputNUmberInAnswerCount;
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
