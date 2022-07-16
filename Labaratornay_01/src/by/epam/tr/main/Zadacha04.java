package by.epam.tr.main;

import java.util.Random;
import java.util.Scanner;

public class Zadacha04 {

	public static void main(String[] args) {

		int n;
		n = inter(); // ввод длинны массива
		System.out.println();

		int[] mas = new int[n];

		add(mas); //вывод массива на консоль

		System.out.println("\n");
		System.out.println("ѕростые числа под номерами:");

		for (int i = 0; i < mas.length; i++) {
			if ((mas[i] == 0) || (mas[i] == 1)) {  // поиск простых чисел
				break;
			} else if ((mas[i] / mas[i] == 1) && (mas[i] % 2 != 0)) {
				System.out.printf("%1d) ", i);
			} else if (mas[i] == 2) {
				System.out.printf("%1d) ", i);
			}
		}
	}

	///////////////////////////////////
	public static int inter() {

		int n;
		Scanner sc = new Scanner(System.in);

		System.out.print("Inter number >");
		n = sc.nextInt();

		return n;
	}

	/////////////////////////////////////
	public static void add(int[] mas) {

		Random rand = new Random();

		for (int i = 0; i < mas.length; i++) {
			mas[i] = rand.nextInt(50);
			System.out.printf("[%1d]", mas[i]);
		}
		return;
	}

}
