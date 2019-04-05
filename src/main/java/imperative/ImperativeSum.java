package imperative;

import java.util.Arrays;
import java.util.List;

public class ImperativeSum {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(2, 5, 1, 7, 3, 9, 6, 4);
        int answer = sum(numbers);
        System.out.println(answer);
    }

    private static int sum(List<Integer> numbers) {
        int answer = 0;
        for (int i = 0; i <= numbers.size(); i++) {
            answer = answer + numbers.get(i);
        }
        return answer;
    }
}
