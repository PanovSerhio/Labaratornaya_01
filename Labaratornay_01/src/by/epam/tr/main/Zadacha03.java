package by.epam.tr.main;

public class Zadacha03 {

	public static void main(String[] args) {
		// ��������� ��������� ��� ���������� �������� ������� F(x) �� ������� [�, b] �
		// ����� h. ���������
		// ���������� � ���� �������, ������ ������� ������� � �������� ���������,
		// ������ -
		// ��������������� �������� �������. F(x) = tg(x)

		double a = 1.5;
		double b = 5.3;
		double h = 0.3;
		double y = 0.0;

		System.out.println(" -------------------------");
		System.out.println("|     x      |     y      |");

		for (double i = a; i <= b; i = i + h) {
			y = Math.tan(i);

			System.out.println(" -------------------------");
			System.out.printf("|%-12f|%-12f|\n", i, y);
		}

		System.out.println(" -----------------------");
		System.out.println();

	}

}
