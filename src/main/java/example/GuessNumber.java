package example;

public class GuessNumber {
    private int[] answer;

    public GuessNumber(AnswerGenerator answerGenerator) {
        this.answer = answerGenerator.generate();
    }

    public String guess(int[] inputGuess) {
        int[] answer = this.answer;
        if (isAllRight(inputGuess, answer)) {
            return "4A0B";
        }
        int correctPositionAmount =  getOnCorrectPositionAmount(answer,inputGuess);
        return String.format("%dA%dB", correctPositionAmount, inputGuess.length - correctPositionAmount);
    }

    public boolean isAllRight(int[] inputGuess, int[] answer) {
        for (int index = 0; index < answer.length; index++) {
            if (answer[index] != inputGuess[index]) {
                return false;
            }
        }
        return true;
    }

    private boolean isAnswerContainNumber(int[] answer, int inputNumber) {
        for (int currentNumber : answer) {
            if (currentNumber == inputNumber) {
                return true;
            }
        }
        return false;
    }

    private int getOnCorrectPositionAmount(int[] answer, int[] inputNumbers) {
        int count = 0;
        for (int index = 0; index < answer.length; index++) {
            if (answer[index] == inputNumbers[index]) {
                count ++;
            }
        }
        return count;
    }
}
