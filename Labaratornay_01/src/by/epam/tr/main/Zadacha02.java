package by.epam.tr.main;

import java.util.Random;
import java.util.Scanner;

public class Zadacha02 {

	public static void main(String[] args) {
		// Программа запрашивает количество чисел, вводит целые числа в соответствии с
		// заявленным
		// количеством ,определяет, сколько чисел больше 15 или <2, чему равна сумма
		// чисел, которые
		// делятся на 5 с остатком 4. Результат вывести на экран.

		System.out.println("Введите целое число:");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int[] mas = new int[num];
		int count = 0;
		int sum = 0;

		for (int i = 0; i < mas.length; i++) {
			Random rand = new Random();
			mas[i] = rand.nextInt(0, 30);

		}
		for (int i = 0; i < mas.length; i++) {
			System.out.print("[" + mas[i] + "] ");
		}
		System.out.println("\n\nниже определяем остаток от деления 4 и сумму чисел");

		for (int i = 0; i < mas.length; i++) {
			if (mas[i] % 5 == 4) {
				count++;
				System.out.print("\n" + count + ") " + mas[i] + "; \n");
				sum = sum + mas[i];
				System.out.println("сумма чисел = " + sum + "\n");
				System.out.println("числа >15 или <2");

				for (i = 0; i < mas.length; i++) {
					if (mas[i] > 15 || mas[i] < 2) {

						System.out.printf("[%3d ]", mas[i]);
					}

				}

			}
		}
	}
}
