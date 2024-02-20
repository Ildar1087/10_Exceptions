package HW_samoproverka.Task1;
/* Реализуйте метод, который запрашивает у пользователя ввод дробного числа (типа float),
и возвращает введенное значение. Ввод текста вместо числа не должно приводить к падению приложения,
вместо этого, необходимо повторно запросить у пользователя ввод данных. */

import java.util.Scanner;


public class InFloat {

    public static void main(String[] args) {
        System.out.println(userInput());
    }

    /**
     * Метод, запрашивающий у пользователя ввод дробного числа (типа float),
     * и возвращающий введенное значение.
     *
     * @return float
     */
    public static float userInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите дробное число(типа float): ");
        try {
            return Float.parseFloat(scanner.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Некорректный ввод, должно быть число!!!");
            return userInput();
        }
    }
}


