import java.util.LinkedList;
import java.util.List;

public class StatementDemo {

    public static void main(String[] args) {

        int m1 = max1(10, 8);
        System.out.println(m1);

        int m2 = max2(10, 8);
        System.out.println(m2);

        List<Integer> list = createList(10);
        System.out.println(list);



    }

    public static int max1(int a, int b) {
        int max;

        if (a > b) {
            max = a;
        } else {
            max = b;
        }

        return max;
    }

    public static int max2(int a, int b) {
        int i = a > b ? a : b;
        return i;
    }

    public static List<Integer> createList(int n) {
        List<Integer> numbers = new LinkedList<>();

        for (int i = 1; i <= 10; i++) {
            numbers.add(i);
        }

        return numbers;
    }
}
