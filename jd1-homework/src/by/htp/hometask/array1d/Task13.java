package by.htp.hometask.array1d;

import java.util.Random;

//13. Определить количество элементов последовательности натуральных чисел, кратных числу М и 
//заключенных в промежутке от L до N.

public class Task13 {

	public static void main(String[] args) {

		int k;
		k = 10;
		
		int  m;
		m = 5;
		
		int l;
		l = 1;
		
		int n;
		n = 50;
		
		int count;
		count = 0;

		int[] mas = new int[k];

		Random rand = new Random();

		for (int i = 0; i < mas.length; i++) {

			mas[i] = rand.nextInt(10);
		}

		System.out.println("Заданный массив: ");

		for (int i = 0; i < mas.length; i++) {

			System.out.print(mas[i] + "/");
		}
		
		for(int i = 0; i < mas.length; i++) {
			
			if(mas[i] < n && mas[i] > l) {
				
				if(mas[i] % m == 0) {
					
					count++;
				}
			}
		}
		
		System.out.println("\nКоличество элементов последовательности натуральных чисел, кратных числу " + m + " и \r\n" + 
				"//заключенных в промежутке от " + l + " до " + n + " равно " + count);
	}

}
