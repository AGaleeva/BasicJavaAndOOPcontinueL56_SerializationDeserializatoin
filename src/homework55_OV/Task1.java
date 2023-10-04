package homework55_OV;

import java.util.Arrays;
import java.util.Random;

public class Task1 {
    /*
    Задача 1
    Создать двумерный массив 5x3 т.е. 5 строк 3 столбца. Заполнить его случайными числами.

    - Написать метод, который преобразует его в одномерный массив из 15 элементов,
      перенося числа по-порядку (слева направо и сверху вниз) из исходного.
    - Написать метод, который меняет все значения из первой строки, на соответствующие значения из 3 строки,
      а значения из третьей строки на значения из первой. Т.е. в итоге нужно поменять местами первую и
      третью строки исходного массива.
    */

    public static void main(String[] args) {
        int[][] arr = createAndFillArr(5, 3);
        print(arr);
        System.out.println("---------------------------------------");
        System.out.println(Arrays.toString(convertToSimpleArr(arr)));
        System.out.println("---------------------------------------");
        changeRows(arr, 1, 3);
        print(arr);
    }

    public static int[][] createAndFillArr(int row, int col) {
        int[][] arr = new int[row][col];
        Random rnd = new Random();
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = rnd.nextInt(50);
            }
        }
        return arr;
    }

    public static void print(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.printf("%3d ", arr[i][j]);
            }
            System.out.println();
        }
    }

    public static int[] convertToSimpleArr(int[][] arr) {
        int[] resArr = new int[arr.length * arr[0].length];
        int indx = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                resArr[indx++] = arr[i][j];
            }
        }
        return resArr;
    }

    public static void changeRows(int[][] arr, int row1, int row2) {
        if (row1 < 0 || row2 < 0 || row1 >= arr.length || row2 >= arr.length) {
            throw new IllegalArgumentException();
        }
        int[] temp;
        temp = arr[row1];
        arr[row1] = arr[row2];
        arr[row2] = temp;
    }
}
