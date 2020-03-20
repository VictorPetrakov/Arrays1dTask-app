package by.htp.hometask.array1d;

//8.  Дан  массив  действительных  чисел,  размерность  которого  N.  
//Подсчитать,  сколько  в  нем  отрицательных, 
//положительных и нулевых элементов. 

public class Task08 {

	public static void main(String[] args) {

		int[] mas = new int[] { 1, -12, 0, 54, -5, 10, 0, 0, 15 };

		int countNegative;
		countNegative = 0;

		int countPositive;
		countPositive = 0;

		int countZero;
		countZero = 0;

		System.out.println("Заданный массив: ");

		for (int i = 0; i < mas.length; i++) {

			System.out.print(mas[i]);
		}

		for (int i = 0; i < mas.length; i++) {

			if (mas[i] < 0) {

				countNegative++;
			}
		}

		for (int i = 0; i < mas.length; i++) {

			if (mas[i] > 0) {

				countPositive++;
			}
		}

		for (int i = 0; i < mas.length; i++) {

			if (mas[i] == 0) {

				countZero++;
			}
		}

		System.out.println("\nКоличество отрицательных элементов в массиве: " + countNegative);
		System.out.println("Количество положительных элементов в массиве: " + countPositive);
		System.out.println("Количество элементов равных нулю в массиве: " + countZero);
	}

}
