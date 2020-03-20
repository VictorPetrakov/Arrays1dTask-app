package by.htp.hometask.array1d;

import java.util.Random;

//6. Дана последовательность чисел а1 ,а2 ,..., ап. 
//Указать наименьшую длину числовой оси, содержащую все эти числа.

public class Task06 {

	public static void main(String[] args) {

		int n = 10;
		int[] mas = new int[n];

		Random rand = new Random();

		for (int i = 0; i < mas.length; i++) {

			mas[i] = rand.nextInt(10);
		}

		System.out.println("Заданный массив: ");
		
		for (int i = 0; i < mas.length; i++) {

			System.out.print(mas[i]);
		}

		int min = mas[0];

		for (int i = 0; i < mas.length; i++) {

			if (min > mas[i]) {

				min = mas[i];
			}

		}

		System.out.println("\nMin element: " + min);

		int max = mas[0];

		for (int i = 0; i < mas.length; i++) {

			if (mas[i] > max) {

				max = mas[i];
			}
		}

		System.out.println("Max element: " + max);

		int section;

		section = max - min;

		System.out.println("Длина числовой оси содержащей все числа массива равна " + section);
	}

}
