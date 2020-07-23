package example;

public class GuessNumber {
    private int[] answer;

    public GuessNumber(AnswerGenerator answerGenerator) {
        this.answer = answerGenerator.generate();
    }

    public String guess(int[] inputGuess) {
        int[] answer = this.answer;
        int correctPositionAmount = getOnCorrectPositionAmount(answer, inputGuess);
        int inputNUmberInAnswerAmount = getNumberInAnswerAmount(answer, inputGuess);
        int answerLength = answer.length;
        if (inputNUmberInAnswerAmount == answerLength) {
            return correctPositionAmount + "A" + (answerLength - correctPositionAmount) + "B";
        }
        if(inputNUmberInAnswerAmount < 4 && inputNUmberInAnswerAmount >0){
            return String.format("%dA%dB", correctPositionAmount, inputNUmberInAnswerAmount - correctPositionAmount);
        }
        return "0A0B";
    }

    private boolean isAnswerContainNumber(int[] answer, int inputNumber) {
        for (int currentNumber : answer) {
            if (currentNumber == inputNumber) {
                return true;
            }
        }
        return false;
    }

    private int getNumberInAnswerAmount(int[] answer, int[] inputNumbers) {
        int count = 0;
        for (int currentNumber : inputNumbers) {
            if (isAnswerContainNumber(answer, currentNumber)) {
                count++;
            }
        }
        return count;
    }

    private int getOnCorrectPositionAmount(int[] answer, int[] inputNumbers) {
        int count = 0;
        for (int index = 0; index < answer.length; index++) {
            if (answer[index] == inputNumbers[index]) {
                count++;
            }
        }
        return count;
    }
}
