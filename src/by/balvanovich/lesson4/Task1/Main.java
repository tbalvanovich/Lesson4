package by.balvanovich.lesson4.Task1;

public class Main {
    public static void main(String[] args) {
        int array[][] = new int[5][];
        for (int i = 0; i < array.length; i++) {
            array[i] = new int[array.length];
        }
        for (int i = 0; i <= array.length / 2; i++) { //работает с любыми размерами квадратного массива
                for (int j = i; j < array[i].length - i; j++) {
                    array[i][j] = 1;
                    array[array.length - i - 1][j] = 1;

                }
            }
            for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < array[i].length; j++) {
                    System.out.print(array[i][j] + " ");
                }
                System.out.println();
            }

    }
}
