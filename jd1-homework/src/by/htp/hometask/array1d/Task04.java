package by.htp.hometask.array1d;

import java.util.Random;

//4. Дана последовательность действительных чисел а1 а2 ,..., аn .
//Выяснить, будет ли она возрастающей. 

public class Task04 {

	public static void main(String[] args) {

		int n = 10;
		int[] a = new int[n];

		Random rand = new Random();
		
		for (int i = 0; i < a.length; i++) {

			a[i] = rand.nextInt(10);
		}

		for (int i = 0; i < a.length; i++) {

			System.out.println(a[i]);
		}

		for (int i = 0; i < a.length - 1; i++) {

			if (a[i] > a[i + 1]) {

				System.out.println("невозрастающая");

				break;
			}

			if (i == a.length) {

				System.out.println("возрастающая");
			}

		}
	}
}
