package HW_samotest.HW_samotest3;

import java.util.Arrays;

class Answer {
    public int[] divArrays(int[] a, int[] b){
        int [] res = new int [a.length];
        int[] res0 = {0};
        if(a.length != b.length)
            return res0;
        else if(a.length == b.length)
            for(int i = 0; i < a.length; i++)
                res[i] = a[i] / b[i];
        return res;

    }
}

// Не удаляйте этот класс - он нужен для вывода результатов на экран и проверки
