package HW_samoproverka.Task4;

import java.util.Scanner;

/*
Разработайте программу, которая выбросит Exception, когда
пользователь вводит пустую строку. Пользователю должно
показаться сообщение, что пустые строки вводить нельзя.
 */
public class NullString {
    public static void main(String[] args) throws EmptyStringException {
        try {
            userInput();
        } catch (EmptyStringException e) {
            System.out.println("Пустые строки вводить нельзя!!! " + e);
        }
    }

    static Scanner scanner = new Scanner(System.in);

    public static String userInput() throws EmptyStringException {
        System.out.print("Введите строку:");
        String input = scanner.nextLine();
        if (input.equals("")) {
            throw new EmptyStringException("Вы ввели пустую строку!");
        } else if (!input.equals("")) {
            System.out.println("Вы ввели строку: " + input);
        }
        return input;
    }
}
