package by.epam.tr.main;

public class Zadacha01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Задача 1. Решить задачу.
		// Вычислить значение выражения по формуле (все переменные принимают
		// действительные
		// значения).

		double x = 7;
		double y = 9;
		double act1 = (Math.sin(x + y)) * (Math.sin(x + y)) + 1;
		double act2 = x - (2 * x) / (1 + (x * x) * (y * y)) + 2;
		double act3 = act1 / act2;
		double act4 = (act3 + x);

		System.out.println("Значение выражения = " + act4);

	}

}
