package by.htp.hometask.array1d;

import java.util.Random;

//17. Дана последовательность целых чисел  a1,a2,...,an. 
//Образовать новую последовательность, выбросив из исходной 
//те члены, которые равны  min(a1,a2,...,an). 

public class Task17 {

	public static void main(String[] args) {

		int n;
		n = 10;

		int j;

		int count;
		count = 0;

		int[] mas = new int[n];

		Random rand = new Random();

		for (int i = 0; i < mas.length; i++) {

			mas[i] = rand.nextInt(10);
		}

		System.out.println("Заданный массив: ");

		for (int i = 0; i < mas.length; i++) {

			System.out.print(mas[i] + "/");
		}

		int min;
		min = mas[0];

		for (int i = 0; i < mas.length; i++) {

			if (min > mas[i]) {

				min = mas[i];
			}
		}

		for (j = 0; j < mas.length; j++) { // поиск количества удаляемых элементов

			if (mas[j] == min) {

				count++;
			}

		}

		for (j = 0; j < mas.length; j++) { // поиск первого удаляемого элемента

			if (mas[j] == min) {

				break;
			}

		}

		for (int k = j; k < mas.length - 1; k++) { // сдвиг последующих элементов

			if (mas[k + 1] == min) {

				for (int m = k + 1; m < mas.length - 1; m++) {

					mas[m] = mas[m + 1];
				}
			}

			mas[k] = mas[k + 1];

		}

		n = n - count; // уменьшение размера

		System.out.println("\nПолученный массив ");

		for (j = 0; j < n; j++) { // вывод элементов

			System.out.print(mas[j] + "/");

		}
		System.out.println();

	}

}
