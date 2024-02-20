package HW_samoproverka.Task2;
/*
Если необходимо, исправьте данный код
 */

public class Popravki2 {
    //    Задание 2
    public static void main(String[] args) {

        double[] intArray = new double[]{5, 4, 3, 2, 3, 2, 6, 4};
        try {
            int d = 0;
            double catchedRes1 = intArray[8] / d;
            System.out.println("catchedRes1 = " + catchedRes1);
        } catch (ArithmeticException e) {
            System.out.println("Catching Arithmetic exception: " + e);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Catching index out of bound exception: " + e);
        }
    }
}

//