package org.example;


import lombok.SneakyThrows;

import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.Scanner;

public class HomeWork {

    /**
     * <h1>Задание 1.</h1>
     * Решить задачу https://codeforces.com/contest/356/problem/A
     */
    @SneakyThrows
    public void championship(InputStream in, OutputStream out) {
        Scanner scanner = new Scanner(in);
        PrintWriter writer = new PrintWriter(out);

        int n = scanner.nextInt();
        int m = scanner.nextInt();

        int[] defeatedBy = new int[n + 1];

        for (int i = 0; i < m; i++) {
            int li = scanner.nextInt();
            int ri = scanner.nextInt();
            int xi = scanner.nextInt();

            for (int knight = li; knight <= ri; knight++) {
                if (knight != xi && defeatedBy[knight] == 0) {
                    defeatedBy[knight] = xi;
                }
            }
        }

        for (int i = 1; i <= n; i++) {
            writer.print(defeatedBy[i] + " ");
        }

        writer.flush();

    }


}
