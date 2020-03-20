package by.htp.hometask.array1d;

import java.util.Random;

//16. Даны действительные числа  a1,a2,...,a(2*n).
//Найти max(a1 + a2 * n, a2 + a(2*n - 1),..., an + a(n+1)).

public class Task16 {

	public static void main(String[] args) {

		int n;
		n = 10;

		int[] mas;
		mas = new int[n];
		int[] mas1;
		mas1 = new int[n / 2];

		Random rand = new Random();

		for (int i = 0; i < mas.length; i++) {

			mas[i] = rand.nextInt(10);
		}

		System.out.println("Заданный массив: ");

		for (int i = 0; i < mas.length; i++) {

			System.out.print(mas[i] + "/");
		}

		for (int i = 0; i < mas1.length; i++) {

			mas1[i] = mas[i] + mas[(mas.length - 1) - i];
		}

		int max;
		max = mas1[0];

		for (int i = 0; i < mas1.length; i++) {

			if (max < mas1[i]) {

				max = mas1[i];
			}
		}

		System.out.println("\nПолученный массив ");

		for (int i = 0; i < mas1.length; i++) {

			System.out.print(mas1[i] + "/");
		}

		System.out.println("\nМаксимальный элемент равен: ");

		System.out.print(max);

	}

}
