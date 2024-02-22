package HW3;

import HW3.MyException.PersonException;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        String inputPersonData = getPersonalData();
        Person person;
        try{
            person = Person.StringDate(inputPersonData);
        }catch (PersonException e) {
            System.out.println(e.getMessage() + ":" + e.getContext());
            e.printStackTrace();
            return;
        }
        try(FileWriter fileWriter = new FileWriter(person.getLastname(), true)){
            String output = person + "\n";
            fileWriter.write(output);
            fileWriter.flush();
        } catch (IOException e) {
            System.out.println("Ошибка при записи данных в файл: " + e.getMessage());
            e.printStackTrace();
        }

    }

    public static Scanner scanner = new Scanner(System.in);

    public static String getPersonalData(){
        System.out.println("Введите данные пользователя разделённые пробелом");
        System.out.println("Фамилия, имя, отчество - строки");
        System.out.println("дата рождения - строка формата dd.mm.yyyy");
        System.out.println("номер телефона - целое беззнаковое число без форматирования");
        System.out.println("укажите ваш пол - символ латиницей f или m");
        System.out.println("В следующем формате: Иванов Иван Иванович 12.01.1955 89653422312 m");
        return scanner.nextLine();
    }
}

