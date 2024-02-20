package HW_samoproverka.Task3;
/*
    Дан следующий код, исправьте его там, где требуется
 */
class Popravki3 {
    public static void main(String[] args) {
        double [] intArray = new double[] {5,6,4,4,7,3,2,3};
        try {
            int d = 0;
            double catchedRes1 = intArray[8] / d;
            System.out.println("catchedRes1 = " + catchedRes1);
        } catch (ArithmeticException e) {
            System.out.println("Catching Arithmetic exception: " + e);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Index out of bounds for length: " + e);
        }

    }


}
