package by.htp.hometask.array1d;

//10. Даны целые числа а1 ,а2 ,..., аn . Вывести на печать только те числа, для которых аi > i. 

public class Task10 {

	public static void main(String[] args) {

		int[] mas = new int[] { 1, -12, 0, 54, -5, 10, 0, 0, 15 };

		System.out.println("Заданный массив: ");

		for (int i = 0; i < mas.length; i++) {

			System.out.print(mas[i] + "/");
		}
		System.out.println("\nЧисла которые больше номера ячейки в которой они расположены :");
		for (int i = 0; i < mas.length; i++) {

			if (mas[i] > i) {

				System.out.print(mas[i] + "/");
			}
		}

	}

}
