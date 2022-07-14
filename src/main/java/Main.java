public class Main {

    public static void main(String[] args) {
        Calculator calc = new Calculator();

        double deduct = calc.deduction(80, 20);
        System.out.println("Вычитание: 80 - 20 = " + deduct);

        double add = calc.addition(80, 20);
        System.out.println("Сложение: 80 + 20 = " + add);

        double mult = calc.multiplication(80, 20);
        System.out.println("Умножение: 80 * 20 = " + mult);

        int div = calc.division(80, 20);
        System.out.println("Деление: 80 / 20 = " + div);

        String mathEq = "8 / 2 * 3 - 5 + 8";
        System.out.println("Исходный формат уравнения: " + mathEq);
        calc.polishNotation(mathEq);
        System.out.println();

        int x = 4;
        int result = calc.linearEquation(x);
        System.out.println(
                "Линейное уравнение: 8 * (" + x + " - 1) + 2 * " + x + " / 2 = " + result);
    }
}