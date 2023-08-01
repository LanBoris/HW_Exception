import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        System.out.print("Введите число: ");
        Scanner scanner = new Scanner(System.in);
        try {
            int number = Integer.parseInt(scanner.nextLine());
            if (number <= 0){
                throw new InvalidNumberException("Некорректное число!");
            }
            System.out.println("Число корректно!");
        } catch (NumberFormatException e) {
            throw new NumberFormatException("Не число!!!");
        }
    }
}
