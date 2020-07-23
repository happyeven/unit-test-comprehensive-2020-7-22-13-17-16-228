package example;

public class GuessNumber {
    private int[] answer;
    public GuessNumber(AnswerGenerator answerGenerator){
        this.answer = answerGenerator.generate();
    }
    public String guess(int[] inputGuess){
        int[] answer = this.answer;
        boolean isAllRight = isAllRight(inputGuess,answer);
        return isAllRight ? "4A0B" : null;
    }
    public boolean isAllRight(int[] inputGuess,int[] answer){
        for(int index = 0;index < answer.length;index++){
            if(answer[index] != inputGuess[index]){
                return false;
            }
        }
        return true;
    }
}
