package com.sokima.tpja;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final var scanner = new Scanner(System.in);
        final var input = scanner.nextLine();
        Arrays.stream(input.split(" "))
                .mapToInt(Integer::valueOf)
                .filter(x -> x % 5 == 0 || x % 7 == 0)
                .forEach(
                        System.out::println
                );
    }
}