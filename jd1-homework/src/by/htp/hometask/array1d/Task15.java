package by.htp.hometask.array1d;

import java.util.Random;

//15. Дана последовательность действительных чисел a1,a2,...,an . 
//Указать те ее элементы, которые принадлежат отрезку [с, d]. 


public class Task15 {

	public static void main(String[] args) {
		
		int n;
		n = 10;
		
		int c;
		c = 2;
		
		int d;
		d = 7;

		int[] mas = new int[n];

		Random rand = new Random();

		for (int i = 0; i < mas.length; i++) {

			mas[i] = rand.nextInt(10);
		}

		System.out.println("Заданный массив: ");

		for (int i = 0; i < mas.length; i++) {

			System.out.print(mas[i] + "/");
		}
		
		System.out.println("\nЧисла удовлетворяющие условию :");
		
		for(int i = 0; i < mas.length; i++) {
			
			if(mas[i] <= d && mas[i] >= c) {
				
				System.out.print(mas[i] + "/" );
			}
		}

	}

}
