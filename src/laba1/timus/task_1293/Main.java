package laba1.timus.task_1293;

import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PrintWriter printWriter = new PrintWriter(System.out);

        int N = scanner.nextInt();
        int A = scanner.nextInt();
        int B = scanner.nextInt();

        int result = (N * (A*B)) * 2;

        printWriter.println(result);
        printWriter.flush();
    }
}