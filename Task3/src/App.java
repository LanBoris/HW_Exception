import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        try {
            System.out.print("Введите первое число: ");
            int number1 = Integer.parseInt(input.nextLine());
            if (number1 > 100){
                throw new NumberOutOfRangeException("Первое число вне допустимого диапазона");
            }
            System.out.print("Введите второе число: ");
            int number2 = Integer.parseInt(input.nextLine());
            if (number2 < 0){
                throw new NumberOutOfRangeException("Второе число вне допустимого диапазона");
            } else if ((number1+number2) < 10){
                throw new NumberSumException("Сумма первого и второго чисел слишком мала");
            }
            System.out.print("Введите третье число: ");
            int number3 = Integer.parseInt(input.nextLine());
            if (number3 == 0){
                throw new DivisionByZeroException("Деление на ноль недопустимо");
            }
            System.out.println("Проверка пройдена успешно!");
        } catch (NumberFormatException e) {
            System.out.println("Вы ввели не число!!!");
        }
    }
}
