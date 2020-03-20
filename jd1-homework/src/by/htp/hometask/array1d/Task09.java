package by.htp.hometask.array1d;

//9. Даны действительные числа а1 ,а2 ,..., аn . 
//Поменять местами наибольший и наименьший элементы

public class Task09 {

	public static void main(String[] args) {

		int[] mas = new int[] { 1, -12, 0, 54, -5, 10, 0, 0, 15 };

		int max;
		max = mas[0];

		int min;
		min = mas[0];

		System.out.println("Заданный массив: ");

		for (int i = 0; i < mas.length; i++) {

			System.out.print(mas[i] + "/");
		}

		int maxIndex;
		maxIndex = 0;

		for (int i = 0; i < mas.length; i++) {

			if (mas[i] > max) {

				max = mas[i];

				maxIndex = i;
			}
		}

		System.out.println("\nMax element: " + max);

		int minIndex;
		minIndex = 0;

		for (int i = 0; i < mas.length; i++) {

			if (min > mas[i]) {

				min = mas[i];

				minIndex = i;
			}

		}

		System.out.println("\nMin element: " + min);

		mas[maxIndex] = min;
		mas[minIndex] = max;

		System.out.println("\nПолученый массив: ");

		for (int i = 0; i < mas.length; i++) {

			System.out.print(mas[i] + "/");
		}
	}
}
