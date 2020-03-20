package by.htp.hometask.array1d;

import java.util.Random;

//11. Даны натуральные числа а1 ,а2 ,..., аn . 
//Указать те из них, у которых остаток от деления на М равен L (0 < L < М-1). 

public class Task11 {

	public static void main(String[] args) {

		int m;
		m = 5;

		int l;
		l = 2;

		int n = 10;

		int[] mas = new int[n];

		Random rand = new Random();

		for (int i = 0; i < mas.length; i++) {

			mas[i] = rand.nextInt(10);
		}

		System.out.println("Заданный массив: ");

		for (int i = 0; i < mas.length; i++) {

			System.out.print(mas[i] + "/");
		}

		System.out.println("\nПолученный массив: ");

		for (int i = 0; i < mas.length; i++) {

			if (mas[i] % m == l) {

				System.out.println(mas[i] + "/");
			}
		}
	}

}
