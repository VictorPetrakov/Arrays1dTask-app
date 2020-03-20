package by.htp.hometask.array1d;

import java.util.Random;

//7. Дана последовательность действительных чисел а1 ,а2 ,..., ап.
//Заменить все ее члены, большие данного Z, этим числом. 
//Подсчитать количество замен. 


public class Task07 {

	public static void main(String[] args) {
		
		int z = 4;
		
		int n = 10;
		
		int[] mas = new int[n];
		
		int count;
		count = 0;
		
		Random rand = new Random();

		for (int i = 0; i < mas.length; i++) {

			mas[i] = rand.nextInt(10);
		}

		System.out.println("Заданный массив: ");
		
		for (int i = 0; i < mas.length; i++) {

			System.out.print(mas[i]);
		}
		
		for(int i = 0; i < mas.length; i++) {
			
			if(mas[i] > z) {
				
				mas[i] = z;
				
				count++;
			}
		}
		
		System.out.println("\nЗаданный массив: ");
		
		for(int i = 0; i < mas.length; i++) {
			
			System.out.print(mas[i]);
		}
		
		System.out.println("\nКолличество замен " + count);
	}

}
