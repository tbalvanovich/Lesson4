package by.balvanovich.lesson4.Task2;

public class Main {
    public static void main(String[] args) {
        int n = 5;
        int array[][] = new int[n][];
        for (int i = 0; i < array.length; i++) {
            array[i] = new int[array.length];
        }
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = 1;
            }
        }
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum = sum + array[i][i];
        }
        System.out.println("Сумма диагонали равна " + sum);

    }
}
//Проверено на разных размерах многомерного массива
//Проверено на разных вариантах заполнения массива
