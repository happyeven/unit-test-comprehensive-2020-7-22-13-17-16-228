package example;

public class GuessNumber {
    private int[] answer;
    public GuessNumber(AnswerGenerator answerGenerator){
        this.answer = answerGenerator.generate();
    }
    public String guess(int[] inputGuess){
        int[] answer = this.answer;
        if(isAllRight(inputGuess,answer)){
            return "4A0B";
        }
        return "1A3B";
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
