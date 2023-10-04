package homework55_OV;

import java.util.Arrays;
import java.util.List;

public class Task2 {
    /*
    Задача 2

    Дан массив строк. Каждую строку из этого массива нужно преобразовать в массив байт (см. метод getBytes у строки).
    Получить двумерный массив byte[][] такой, где каждая строка -
    это массив байта, полученный преобразованием соответствующей String из данного массива строк.
    */

    public static void main(String[] args) {
        byte[][] arrBytes = listStrinsToByteArray(List.of("qwe1", "qwe2", "привет"));
        System.out.println(Arrays.deepToString(arrBytes));
    }

    public static byte[][] listStrinsToByteArray(List<String> list) {
        byte[][] resArr = new byte[list.size()][];
        int rowIndex = 0;
        for (String str : list) {
            resArr[rowIndex++] = str.getBytes();
        }
        return resArr;
    }
}
