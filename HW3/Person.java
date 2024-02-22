package HW3;

import HW3.MyException.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Person {
    private String name;
    private String lastname;
    private String parentName;
    private String birthdate;
    private String phoneNumber;
    private String gender;
    private static final int numberOfAttributes = 6; // количество контролируемых параметров


    public Person() {
    }
    /** Конструктор класса */
    public Person(String name, String lastname, String parentName, String birthdate, String phoneNumber, String gender) {
        this.name = name;
        this.lastname = lastname;
        this.parentName = parentName;
        this.birthdate = birthdate;
        this.phoneNumber = phoneNumber;
        this.gender = gender;
    }

    /** Определяем принадлежность "частей" массива к полям класса */
    public static Person StringDate(String data) throws PersonException {
        Person person = new Person();
        String[] dataPerson = person.parseData(data);
        person.lastname = dataPerson[0];
        person.name = dataPerson[1];
        person.parentName = dataPerson[2];
        person.birthdate = dataPerson[3];
        person.phoneNumber = dataPerson[4];
        person.gender = dataPerson[5];
        return person;
    }

    /** Обрезка введенного пользователем массива splitом */
    private String[] parseData(String data) throws PersonException {
        String[] splitData = data.split(" ");
        validateAttributesQuantity(splitData);
        validateLastName(splitData[0].toLowerCase()); // игнорируя
        validateName(splitData[1].toLowerCase());
        validateParentName(splitData[2].toLowerCase());
        validateBirthdate(splitData[3]);
        validatePhoneNumber(splitData[4]);
        validateGender(splitData[5]);
        return splitData;
    }
    /** Осуществляем проверку вводимых данных пользователем
     * validateAttributesQuantity - проверка соответствия на количество введенного с ожидаемым
     * validateLastName - проверка фамилии на правильность ввода данных пользователем
     * validateName - проверка имени на правильность ввода данных пользователем
     * validateParentName - проверка отчества на правильность ввода данных пользователем
     * validateBirthdate - проверка дня рождения на правильность ввода данных пользователем
     * validatePhoneNumber - проверка номера телефона на правильность ввода данных пользователем
     * validateGender - проверка пола на правильность ввода данных пользователем
     * */
    private void validateAttributesQuantity(String[] attributes) throws PersonAttributesQuantityException {
        if (attributes.length != numberOfAttributes) {
            throw new PersonAttributesQuantityException("Введено неверное количество атрибутов", attributes.length);
        }
    }

    private void validateLastName(String lastname) throws PersonLastnameException { // проверка верности фамилии
        String regex = "[a-zа-яё]{1,50}";
        if(!lastname.matches(regex)){
            throw new PersonLastnameException("Введена неверная фамилия", lastname);
        }
    }

    private void validateName(String name) throws PersonNameException {
        String regex = "[a-zа-яё]{1,50}";
        if(!name.matches(regex)){
            throw new PersonNameException("Введено неверное имя",name);
        }
    }

    private void validateParentName(String parentname) throws PersonParentnameException {
        String regex = "[a-zа-яё]{1,50}";
        if(!parentname.matches(regex)){
            throw new PersonParentnameException("Введено неверное отчество",parentname);
        }
    }

    private void validateBirthdate(String birthdate) throws PersonBirthdateException {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy");
        dateFormat.setLenient(false); // проверка корректности ввода даты рождения
        try {
            dateFormat.parse(birthdate);
        } catch (ParseException e){
            throw new PersonBirthdateException("Дата введена в неверном формате ",birthdate);
        }
    }

    private void validatePhoneNumber(String phoneNumber) throws PersonPhoneNumberException {
        String regex = "\\d{11}";
        if(!phoneNumber.matches(regex)){
            throw new PersonPhoneNumberException("Введён неверный номер телефона!", phoneNumber);
        }
    }

    private void validateGender(String gender) throws PersonGenderException {
        String regex = "f|m";
        if(!gender.matches(regex)){
            throw new PersonGenderException("Введён неверный пол!", gender);
        }
    }
    /** Получаем нужные значения через gettoры */
    public String getName() {
        return name;
    }

    public String getLastname() {
        return lastname;
    }

    public String getParentName() {
        return parentName;
    }

    public String getBirthdate() {
        return birthdate;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getGender() {
        return gender;
    }

    /** Переопределяем вывод toStringa как нам нужно */
    @Override
    public String toString() {
        return "Person{"+
                ", lastname='" + lastname + '\'' +
                ", name='" + name + '\'' +
                ", parentname='" + parentName + '\'' +
                ", birthdata='" + birthdate + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", gender='" + gender + '\'' +
                '}';
    }
}
