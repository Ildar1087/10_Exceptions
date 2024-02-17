package HW_samotest.HW_samotest1;

class Answer {
    public static void arrayOutOfBoundsException() {
        // Напишите свое решение ниже
        int [] a = {5,3,33,3};
        a[10] = 33;
    }

    public static void divisionByZero() {
        // Напишите свое решение ниже
        int z = 6;
        int v = 0;
        int val = z/0;
    }

    public static void numberFormatException() {
        // Напишите свое решение ниже
        String f = "abba";
        int vali = Integer.parseInt(f);

    }
}

