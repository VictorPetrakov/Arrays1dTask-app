package by.htp.hometask.array1d;

import java.util.Random;

//5. Дана последовательность натуральных чисел а1 , а2 ,..., ап. 
//Создать массив из четных чисел этой последовательности. 
//Если таких чисел нет, то вывести сообщение об этом факте. 

public class Task05 {

	public static void main(String[] args) {

		int n = 10;
		int[] a = new int[n];

		Random rand = new Random();

		for (int i = 0; i < a.length; i++) {

			a[i] = rand.nextInt(10);
		}

		System.out.println("Заданный массив: ");
		for (int i = 0; i < a.length; i++) {

			System.out.print(a[i]);
		}

		System.out.println("\nМассив из четных чисел :");

		int count;

		count = 0;

		for (int i = 0; i < a.length; i++) {

			if (a[i] % 2 == 0) {

				count++;
			}
		}

		int[] b = new int[count];

		int j = 0;

		for (int i = 0; i < a.length; i++) {

			if (a[i] % 2 == 0) {

				b[j] = a[i];

				j = j + 1;
			}
		}

		for (int i = 0; i < b.length; i++) {

			System.out.print(b[i]);
		}

	}

}
