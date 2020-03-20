package by.htp.hometask.array1d;

//1. В массив A [N] занесены натуральные числа. Найти сумму тех элементов, которые кратны данному К

public class Task01 {

	public static void main(String[] args) {

		int n;
		int k;
		int sum;

		n = 9;
		k = 2;
		sum = 0;

		int[] mas = new int[n];

		for (int i = 0; i < mas.length; i++) {

			mas[i] = i + 1;
		}

		for (int i = 0; i < mas.length; i++) {

			if (mas[i] % k == 0) {

				sum = sum + mas[i];
			}
		}

		System.out.println(sum);

	}

}
