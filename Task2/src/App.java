import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Введите первое число: ");
            int num1 = Integer.parseInt(scanner.nextLine());
            System.out.print("Введите второе число: ");
            int num2 = Integer.parseInt(scanner.nextLine());
            if (num2 == 0){
                throw new DivisionByZeroException("Деление на ноль недопустимо");
            }
            System.out.println("Результат деления: " + num1/num2);
        } catch (NumberFormatException e) {
            throw new NumberFormatException("Вы ввели не число!");
        }
        
    }
}
