package example;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class CurrentAnswerGenerator implements AnswerGenerator {
    @Override
    public int[] generate() {
        return generateAnswer();
    }

    private int generateNumberFrom0to9() {
        return new Random().nextInt(10);
    }

    private int[] generateAnswer() {
        return generateInputNumbersFromList(getAnswer());
    }

    private List<Integer> getAnswer() {
        List<Integer> answer = new ArrayList<>();
        do {
            int generateNumber = generateNumberFrom0to9();
            if (!answer.contains(generateNumber)) {
                answer.add(generateNumber);
            }
        } while (answer.size() < 4);
        return answer;
    }

    private int[] generateInputNumbersFromList(List<Integer> answers) {
        return answers.stream().mapToInt(Integer::valueOf).toArray();
    }
}
