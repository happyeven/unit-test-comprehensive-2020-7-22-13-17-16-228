package example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Random;

public class CurrentAnswerGenerator implements AnswerGenerator {
    @Override
    public int[] generate() {
        return generateAnswer();
    }

    private int generateNumberFrom0to9() {
        Random random = new Random();
        int a = random.nextInt(10);
        return a;
    }

    private int[] generateAnswer() {
        List<Integer> answerList = new ArrayList<>();
        do {
            int generateNumber = generateNumberFrom0to9();
            if (!answerList.contains(generateNumber)) {
                answerList.add(generateNumber);
            }
        } while (answerList.size() < 4);
        int[] answer = new int[4];
        for (int index = 0; index < 4; index++) {
            answer[index] = answerList.get(index);
        }
        return answer;
    }
}
