package laba4.irl;

import java.util.Random;

public class zadacha6 {
    public static void main(String[] args) {
        int rows = 5;
        int cols = 6;

        int[][] matrix = new int[rows][cols];
        Random random = new Random();

        System.out.println("Исходный массив:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = random.nextInt(100);
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }

        int rowToRemove = random.nextInt(rows);
        int colToRemove = random.nextInt(cols);

        System.out.println("\nУдаляем строку с индексом: " + rowToRemove);
        System.out.println("Удаляем столбец с индексом: " + colToRemove);

        int[][] newMatrix = new int[rows - 1][cols - 1];

        for (int i = 0, newRow = 0; i < rows; i++) {
            if (i == rowToRemove) continue;
            for (int j = 0, newCol = 0; j < cols; j++) {
                if (j == colToRemove) continue;
                newMatrix[newRow][newCol] = matrix[i][j];
                newCol++;
            }
            newRow++;
        }

        System.out.println("\nМассив после удаления строки и столбца:");
        for (int i = 0; i < newMatrix.length; i++) {
            for (int j = 0; j < newMatrix[i].length; j++) {
                System.out.print(newMatrix[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
