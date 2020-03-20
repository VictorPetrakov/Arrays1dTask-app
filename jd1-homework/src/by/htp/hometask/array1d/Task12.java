package by.htp.hometask.array1d;

import java.util.Random;

//12. Задана последовательность N вещественных чисел.
//Вычислить сумму чисел, порядковые номера которых являются 
//простыми числами.

public class Task12 {

	public static void main(String[] args) {

		int n = 40;

		double[] mas = new double[n];

		Random rand = new Random();

		for (int i = 0; i < mas.length; i++) {

			mas[i] = rand.nextDouble();
		}

		System.out.println("Заданный массив: ");

		for (int i = 0; i < mas.length; i++) {

			System.out.print(mas[i] + "/");

		}

		System.out.println();

		int temp;
		double sum = 0;

		for (int i = 1; i <= mas.length; i++) {
			
			boolean isPrime = true;
			
			for (int j = 2; j <= i / 2; j++) {

				temp = i % j;

				if (temp == 0) {

					isPrime = false;

				}
			}

			if (isPrime) {

				System.out.println(i + " - номер ячейки простое число");
				sum = sum + mas[i];
			}

		}
		System.out.println("Сумма равна " + sum);
	}
}
