package example;

import java.util.Scanner;

public class GuessNumberGame {
    private GuessNumber guessNumber;
    private InputValidator inputValidator;

    public GuessNumberGame(GuessNumber guessNumber, InputValidator inputValidator) {
        this.guessNumber = guessNumber;
        this.inputValidator = inputValidator;
    }

    public static void main(String[] args) {
        GuessNumber guessNumber = new GuessNumber(new CurrentAnswerGenerator());
        InputValidator inputValidator = new InputValidator();
        GuessNumberGame guessNumberGame = new GuessNumberGame(guessNumber, inputValidator);
        int chance = NumberConstant.PLAY_CHANCE;
        Scanner scan = new Scanner(System.in);
        while (chance != 0) {
            int[] inputGuess = getInputFromConsole(scan);
            String output = guessNumberGame.getOutput(inputGuess);
            if(output.equals(MessageConstant.SUCCESS_CODE)){

            }
            System.out.println(output);
            chance--;
        }
        scan.close();
    }

    public String getOutput(int[] inputGuess) {
        if (!inputValidator.isLegalInputNumbers(inputGuess)) {
            return ErrorMessageConstant.ERROR_MESSAGE;
        }
        return guessNumber.guess(inputGuess);
    }


    private static int[] getInputFromConsole(Scanner scan) {
        int[] inputNumber = new int[NumberConstant.INPUT_GUESS_LENGTH];
        for (int j = 0; j < inputNumber.length; j++) {
            inputNumber[j] = scan.nextInt();
        }
        return inputNumber;
    }
}
