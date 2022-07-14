import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Queue;

public class Calculator {

    public double deduction(double a, double b) {
        return Math.abs(a - b);
    }

    public double addition(double a, double b) {
        return a + b;
    }

    public double multiplication(double a, double b) {
        return a * b;
    }

    public int division(int a, int b) {
        return a / b;
    }

    public void polishNotation(String mathEquation) {
        Deque<String> sign = new ArrayDeque<>();
        Queue<Integer> numbers = new ArrayDeque<>();

        String[] arrayValue = mathEquation.split(" ");
        for (int i = 0; i < arrayValue.length; i++) {
            String value = arrayValue[i];
            if (i % 2 == 0) {
                numbers.offer(Integer.parseInt(value));
            } else {
                sign.offerFirst(value);
            }
        }
        System.out.print("Формат обратной польской записи: ");
        for (int number : numbers) {
            System.out.print(number + " ");
        }
        for (String s : sign) {
            System.out.print(s + " ");
        }
    }

    public int linearEquation(int x) {
        return 8 * (x - 1) + 2 * x / 2;
    }
}